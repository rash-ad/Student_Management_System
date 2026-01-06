package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String age;
    private int grade;
    private int marks;

}
