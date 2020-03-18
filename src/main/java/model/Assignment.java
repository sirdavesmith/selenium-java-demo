package model;

import lombok.Getter;

public class Assignment {
    @Getter
    private String assignmentName;

    public Assignment(String assignmentName) {
        this.assignmentName = assignmentName;
    }
}
