package raisetech.student.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//
@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private StudentRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/student")
    public String getStudent(@RequestParam String name) {
        Student student = repository.searchByName(name);
        return student.getName() + " " + student.getAge() + "歳";
    }

    @PostMapping("/student")
    public void setStudent(String name, int age) {
        repository.registerStudent(name, age);
    }

    @PatchMapping("/student")
    public void updateStudent(String name, int age) {
        repository.updateStudent(name, age);
    }

    @DeleteMapping("/student")
    public void deleteStudent(String name) {
        repository.deleteStudent(name);
    }

    //テーブル全件表示
    @GetMapping("/studentList")
    public List<Student> allCheckStudent() {
      return repository.allCheckStudent();
    }
}




