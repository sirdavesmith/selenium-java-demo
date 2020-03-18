package pages;

import org.openqa.selenium.WebDriver;

public class StudentHomePage extends PageAbstract {
    public StudentHomePage(WebDriver driver){
        super(driver);

        this.URL = "https://acmeu.com";
        this.pageName = "Student Home Page";
        this.pageTitle = "User Dashboard";
    }
}
