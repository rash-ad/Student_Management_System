package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String classes;
    private int status;
    private int actions;

}
