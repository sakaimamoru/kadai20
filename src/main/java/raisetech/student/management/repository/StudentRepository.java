package raisetech.student.management.repository;


import org.apache.ibatis.annotations.*;
import raisetech.student.management.data.Student;
import raisetech.student.management.data.StudentsCourses;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("SELECT * FROM student")
    List<Student> search();

    @Select("SELECT * FROM student_courses")
    List<StudentsCourses> searchStudentsCourses();

}
