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

    @Insert("INSERT INTO student (name, nickname, email, address, age, gender, remark, isDeleted) " +
            "VALUES(#{name}, #{nickname}, #{email}, #{address}, #{age}, #{gender}, #{remark}, #{isDeleted})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertStudents(Student student);

    @Insert("INSERT INTO student_courses(student_id, course, start_time, finish_time)"
            + "VALUES(#{student_id}, #{course}, #{start_time}, #{finish_time})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertCourse(StudentsCourses studentsCourses);


}


