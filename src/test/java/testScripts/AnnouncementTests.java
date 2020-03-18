package testScripts;

import data.AnnouncementTest;
import data.TeacherTest;
import model.TestAbstract;
import org.testng.annotations.Test;
import pages.CourseHomePage;
import pages.TeacherHomePage;

public class AnnouncementTests extends TestAbstract {
    private final TeacherTest teacher = new TeacherTest();
    private final AnnouncementTest announcement = new AnnouncementTest();

    @Test
    public void createAnnouncementTest() throws Exception {
        TeacherHomePage teacherHomePage = new TeacherHomePage(this.getDriver());
        CourseHomePage courseHomePage = new CourseHomePage(this.getDriver());

        teacher.setup(this.getDriver(), this.getDriverWait());
        teacherHomePage.clickCoursesMenu();
        teacherHomePage.clickCoursesMenuCourse();
        courseHomePage.clickAnnouncements();
        courseHomePage.clickCreateAnnouncement(announcement);
    }

    @Test
    public void editAnnouncementTest() throws Exception {
        TeacherHomePage teacherHomePage = new TeacherHomePage(this.getDriver());
        CourseHomePage courseHomePage = new CourseHomePage(this.getDriver());

        teacher.setup(this.getDriver(), this.getDriverWait());
        teacherHomePage.clickCoursesMenu();
        teacherHomePage.clickCoursesMenuCourse();
        courseHomePage.clickAnnouncements();
        courseHomePage.clickAnnouncement();
        courseHomePage.clickEditAnnouncement();
        courseHomePage.editAnnouncement();
    }

    @Test
    public void deleteAnnouncementTest() throws Exception {
        TeacherHomePage teacherHomePage = new TeacherHomePage(this.getDriver());
        CourseHomePage courseHomePage = new CourseHomePage(this.getDriver());

        teacher.setup(this.getDriver(), this.getDriverWait());
        teacherHomePage.clickCoursesMenu();
        teacherHomePage.clickCoursesMenuCourse();
        courseHomePage.clickAnnouncements();
        courseHomePage.clickDeleteAnnouncement();
    }
}
