package raisetech.student.management.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String id;
    private String name;
    private String nickname;
    private String email;
    private String address;
    private int age;
    private String gender;
    //25課題追加テーブル
    private String remark;//備考欄
    private boolean isDeleted;//論理削除

}
