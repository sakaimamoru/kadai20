package raisetech.student.management.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private int id;
    private String name;
    private String nickname;
    private String email;
    private String address;
    private int age;
    private String gender;
    private String remark;//備考欄
    private boolean isDeleted;//論理削除

}
