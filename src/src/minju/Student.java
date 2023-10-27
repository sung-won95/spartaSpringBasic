package minju;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;//이름
    private String hobby;//취미
    private Integer number;//학번
    private Integer grade;//학년
    private String school_name;//학교 이름
    private String major;//전공
    private List<String> subjectList;

    private Integer credit;

    public Student(String name, String school_name, Integer grade, Integer number, String major, String hobby) {
        this.name = name;
        this.school_name = school_name;
        this.grade = grade;
        this.number = number;
        this.major = major;
        this.hobby = hobby;
        this.subjectList = new ArrayList<>();
    }


    public String 전공이무엇이니() {
        return major;
    }

    public void 과목추가(String subject) {
        subjectList.add(subject);
    }

    public void 학점추가(Integer num) {
        this.credit += num;
    }

}
