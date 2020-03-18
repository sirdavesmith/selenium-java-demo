package pages;

import model.UserAbstract;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageAbstract {
    private final String usernameFld = "pseudonym_session_unique_id";
    private final String passwordFld = "pseudonym_session_password";
    private final String loginBtn = "btn-primary";

    public LoginPage(WebDriver driver){
        super(driver);

        this.URL = "https://acmeu.com/login";
        this.pageName = "Login Page";
        this.pageTitle = "Log In to Canvas";
    }

    public void enterUsername(UserAbstract user){
        sendTextById(usernameFld, user.getUsername(), "usernameFld");
    }

    public void enterPassword(UserAbstract user){
        sendTextById(passwordFld, user.getPassword(), "passwordFld");
    }

    private void pressLoginBtn(){
        clickByClassName(loginBtn, "loginBtn");
    }

    public TeacherHomePage pressLoginBtnTeacher(){
        pressLoginBtn();
        return new TeacherHomePage(this.getDriver());
    }

    public StudentHomePage pressLoginBtnStudent(){
        pressLoginBtn();
        return new StudentHomePage(this.getDriver());
    }
}
