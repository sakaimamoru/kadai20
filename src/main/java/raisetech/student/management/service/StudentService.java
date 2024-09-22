package raisetech.student.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.repository.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> searchStudentList() {
        //絞り込み検索で「年齢が30代の人」のみを抽出する。
        //抽出したリストをコントローラーに返す。
        List<Student> allStudents = repository.search();
        return allStudents.stream()
                .filter(student -> student.getAge() >= 30 && student.getAge() < 40)
                .toList();
    }

    public List<StudentsCourses> searchStudentsCourse() {
        //絞り込み検索で「Javaコース」のコース情報のみを抽出する。
        //抽出したリストをコントローラーに返す。
        List<StudentsCourses> allStudents = repository.searchStudentsCourses();
        return allStudents.stream()
                .filter(studentsCourses -> studentsCourses.getCourse().equals("Java"))
                .toList();
    }
}
