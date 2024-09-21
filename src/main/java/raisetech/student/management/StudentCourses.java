package raisetech.student.management;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class StudentCourses {

    private String id;
    private String studentId;
    private String course;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;


}
