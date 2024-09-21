package raisetech.student.management;


import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface StudentRepository {

    @Select("SELECT * FROM student")
    List<Student> search();

    @Select("SELECT * FROM student_courses")
    List<StudentCourses> searchCourses();

}
