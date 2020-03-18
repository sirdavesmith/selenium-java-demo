package testScripts;

import data.CourseTest;
import data.TeacherTest;
import model.TestAbstract;
import org.testng.annotations.Test;
import pages.TeacherHomePage;

public class CreateCourseTest extends TestAbstract {
    private final TeacherTest teacher = new TeacherTest();
    private CourseTest course = new CourseTest();

    @Test
    public void createCourseTest() throws Exception {
        TeacherHomePage teacherHomePage = new TeacherHomePage(this.getDriver());

        teacher.setup(this.getDriver(), this.getDriverWait());
        teacherHomePage.clickStartANewCourseBtn();
        teacherHomePage.enterCourseName(course);
        teacherHomePage.clickCreateCourseBtn();
    }
}
