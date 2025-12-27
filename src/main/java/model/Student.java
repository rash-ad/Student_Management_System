package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Student {
    private String id;
    private String name;
    private String age;
    private int grade;
    private int marks;

}
