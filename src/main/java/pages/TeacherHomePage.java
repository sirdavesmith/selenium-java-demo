package pages;

import model.Course;
import org.openqa.selenium.WebDriver;

public class TeacherHomePage extends PageAbstract {
    private final String courseFld = "course_name";
    private final String coursesMenu = "courses_menu_item";
    private final String coursesMenuCourse = "//span[text()=\"Test1\"]";
    private final String createCourseBtn = "ui-button-text";
    private final String startANewCourseBtn = "start_new_course";

    public TeacherHomePage(WebDriver driver){
        super(driver);

        this.URL = "https://acmeu.com";
        this.pageName = "Teacher Home Page";
        this.pageTitle = "User Dashboard";
    }

    public void clickCoursesMenu(){
        clickById(coursesMenu, "coursesMenu");
    }

    public CourseHomePage clickCoursesMenuCourse(){
        clickByXpath(coursesMenuCourse, "coursesMenuCourse");

        return new CourseHomePage(this.getDriver());
    }

    public void clickStartANewCourseBtn(){
        clickById(startANewCourseBtn, "startANewCourseBtn");
    }

    public void enterCourseName(Course course){
        sendTextById(courseFld, course.getCourseName(), "courseFld");
    }

    public TeacherHomePage clickCreateCourseBtn(){
        clickByClassName(createCourseBtn, "createCourseBtn");
        return new TeacherHomePage(this.getDriver());
    }
}
