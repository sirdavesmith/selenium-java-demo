package model;

import lombok.Getter;

public class Announcement {
    @Getter
    private String announcementDescription;

    @Getter
    private String announcementTitle;

    public Announcement(String announcementTitle, String announcementDescription) {
        this.announcementDescription = announcementDescription;
        this.announcementTitle = announcementTitle;
    }
}
