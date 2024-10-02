package raisetech.student.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;
import raisetech.student.management.domain.StudentDetail;
import raisetech.student.management.service.StudentService;

import java.util.List;
    }

    @GetMapping("/studentsCourseList")
    public List<StudentsCourses> getStudentsCourse() {
        return service.searchStudentsCourse();
    }
}

