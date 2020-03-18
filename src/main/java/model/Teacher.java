package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.TeacherHomePage;

public class Teacher extends UserAbstract {
    protected Teacher(String username, String password) {
        super(username, password);
    }

    public void setup (WebDriver driver, WebDriverWait waitTitlePage) {
        LoginPage loginPage = new LoginPage(driver);
        super.setup(driver, waitTitlePage);

        TeacherHomePage teacherHomePage = loginPage.pressLoginBtnTeacher();
        waitTitlePage.until(ExpectedConditions.titleIs(teacherHomePage.getPageTitle()));
    }
}
