package raisetech.student.management;


import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Select("SELECT * FROM student WHERE name = #{name}")
    Student searchByName(String name);

    @Insert("INSERT student values (#{name},#{age}")
    void registerStudent(String name, int age);

    @Update("UPDATE student SET age = #{age} WHERE name = #{name}")
    void updateStudent(String name, int age);

    @Delete("DELETE FROM student WHERE name = #{name}")
    void deleteStudent(String name);

    //全情報の取得
    @Select("SELECT * FROM student")
    List<Student> allCheckStudent();

}
