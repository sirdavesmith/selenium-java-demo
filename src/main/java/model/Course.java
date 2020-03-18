package model;

import lombok.Getter;

public class Course {
    @Getter
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}