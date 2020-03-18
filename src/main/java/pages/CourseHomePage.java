package pages;

import model.Announcement;
import model.Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseHomePage extends PageAbstract {
    private final String announcement = "discussion-title";
    private final String announcements = "announcements";
    private final String announcementCogImg = "manage_link";
    private final String announcementDescriptionFld = "tinymce";
    private final String announcementTitleFld = "discussion-title";
    private final String assignments = "assignments";
    private final String activeAssignments = "div .active_assignments";
    private final String assignmentTitleFld = "assignment_name";
    private final String assignmentTextEntryCheckbox = "assignment_text_entry";
    private final String createAnnouncementBtn = "icon-plus";
    private final String createAssignmentBtn = "new_assignment";
    private final String deleteAnnouncementOption = "ui-id-3";
    private final String editAnnouncement = "edit-btn";
    private final String iFrame = "discussion-topic-message12_ifr";
    private final String save = ".submit";
    private final String updateAssignment = "submit-assignemnt";

    public final String sourceAssignment = "div > active1";
    public final String targetAssignment = "div > active";

    public CourseHomePage(WebDriver driver){
        super(driver);

        this.URL = "https://acmeu.com/courses/927539";
        this.pageName = "Teacher Home Page";
        this.pageTitle = "User Dashboard";
    }

    public void clickAnnouncements(){
        clickByClassName(announcements, "announcements");
    }

    public void clickCreateAnnouncement(Announcement announcement){
        clickByClassName(createAnnouncementBtn, "createAnnouncementBtn");

        sendTextById(announcementTitleFld, announcement.getAnnouncementTitle(), "announcementTitleFld");

        SwitchToFrame(iFrame);
        sendTextById(announcementDescriptionFld, announcement.getAnnouncementDescription(), "announcementDescriptionFld");
        RestoreDefaultFrameAndWindow();

        clickByXpath(save, "save");
    }

    public void clickAnnouncement() {
        clickByClassName(announcement, "announcement");
    }

    public void clickEditAnnouncement() {
        clickByClassName(editAnnouncement, "editAnnouncement");
    }

    public void editAnnouncement() {
        clearTextById(announcementTitleFld);
        sendTextById(announcementTitleFld, "Test Announcement Edited", "announcementTitleFld");
        clickByXpath(save, "save");
    }

    public void clickDeleteAnnouncement() {
        clickById(announcementCogImg, "announcementCogImg");

        clickById(deleteAnnouncementOption, "deleteAnnouncementOption");
        AcceptAlert();
    }

    public void clickAssignments() {
        clickByClassName(assignments, "assignments");
    }

    public void clickActiveAssignments() {
        clickByXpath(activeAssignments, "activeAssignments");
    }

    public void clickCreateAssignment(Assignment assignment, int assignmentNumber) {
        clickByClassName(createAssignmentBtn, "createAssignmentBtn");

        sendTextById(assignmentTitleFld, assignment.getAssignmentName() + assignmentNumber, "assignmentTitleFld");

        if (!this.getDriver().findElement(By.id(assignmentTextEntryCheckbox)).isSelected()) {
            clickById(assignmentTextEntryCheckbox, "assignmentTextEntryCheckbox");
        }

        clickByXpath(updateAssignment, "updateAssignment");
    }

    public void createAssignments(Assignment assignment, int numberOfAssignments){
        for (int x = 1; x < numberOfAssignments + 1; x++) {
            clickCreateAssignment(assignment, x);
            clickActiveAssignments();
        }
    }

    public void reOrderAssignments() {
        reorderElementByXpath(sourceAssignment, targetAssignment);
    }
}