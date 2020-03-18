package testScripts;

import data.AssignmentTest;
import data.TeacherTest;
import model.TestAbstract;
import org.testng.annotations.Test;
import pages.CourseHomePage;
import pages.TeacherHomePage;

public class AssignmentTests extends TestAbstract {
    private final TeacherTest teacher = new TeacherTest();
    private final AssignmentTest assignment = new AssignmentTest();

    @Test
    public void createAssignment() {
        TeacherHomePage teacherHomePage = new TeacherHomePage(this.getDriver());
        CourseHomePage courseHomePage = new CourseHomePage(this.getDriver());

        teacher.setup(this.getDriver(), this.getDriverWait());
        teacherHomePage.clickCoursesMenu();
        teacherHomePage.clickCoursesMenuCourse();
        courseHomePage.clickAssignments();
        courseHomePage.createAssignments(assignment, 1);
    }

    @Test
    public void createAssignments() throws InterruptedException {
        TeacherHomePage teacherHomePage = new TeacherHomePage(this.getDriver());
        CourseHomePage courseHomePage = new CourseHomePage(this.getDriver());

        teacher.setup(this.getDriver(), this.getDriverWait());
        teacherHomePage.clickCoursesMenu();
        teacherHomePage.clickCoursesMenuCourse();
        courseHomePage.clickAssignments();
        courseHomePage.reOrderAssignments();
    }
}
