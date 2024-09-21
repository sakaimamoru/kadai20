package raisetech.student.management.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class StudentsCourses {

    private int id;
    private int student_id;
    private String course;
    private LocalDateTime start_time;
    private LocalDateTime finish_time;


}
