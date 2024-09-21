package raisetech.student.management.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class StudentsCourses {

    private String id;
    private String studentId;
    private String course;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;


}
