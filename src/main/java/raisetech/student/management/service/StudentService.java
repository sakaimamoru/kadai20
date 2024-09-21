package raisetech.student.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> searchStudentList() {
        return repository.search();
    }

    public List<StudentsCourses> searchStudentsCourse() {
        return repository.searchStudentsCourses();

    }

   @Transactional
    public void insertStudents(Student student) {
        repository.insertStudents(student);
    }
    @Transactional
    public void insertCourse(StudentsCourses studentsCourses) {
       repository.insertCourse(studentsCourses);
    }
}
