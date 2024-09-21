package raisetech.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import raisetech.student.management.controller.converter.StudentConverter;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.domain.StudentDetail;
import raisetech.student.management.service.StudentService;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService service;
    protected StudentConverter converter;


    @Autowired
    public StudentController(StudentService service, StudentConverter converter) {
        this.service = service;
        this.converter = converter;

    }

    //受講生リストを取得して表示
    @GetMapping("/studentList")
    public String getStudentList(Model model) {
        List<Student> students = service.searchStudentList();
        List<StudentsCourses> studentsCourses = service.searchStudentsCourse();
        model.addAttribute("studentList", converter.convertStudentDetails(students, studentsCourses));
        return "studentList";
    }

    @GetMapping("/studentsCourseList")
    public List<StudentsCourses> getStudentsCourse() {
        return service.searchStudentsCourse();
    }

    @GetMapping("/newStudent")
    public String newStudent(Model model) {
        model.addAttribute("studentDetail", new StudentDetail());
        return "registerStudent";
    }

    @PostMapping("/registerStudent")
    public String registerStudent(@ModelAttribute StudentDetail studentDetail, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registerStudent";
        }
        //新規受講生情報を登録する処理を実装する。（最低ここ）
        //できればコース情報も一緒に登録できるように実装する。コースは単体で良い。
        service.insertStudents(studentDetail.getStudent());
        service.insertCourse(studentDetail.getStudentsCourses().getFirst());
        return "redirect:/studentList";

    }
}