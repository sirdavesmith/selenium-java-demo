package model;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public abstract class UserAbstract {
    @Getter
    private String username;

    @Getter
    private String password;

    UserAbstract(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setup(WebDriver driver, WebDriverWait waitTitlePage) {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open(waitTitlePage);
        loginPage.enterUsername(this);
        loginPage.enterPassword(this);
    }
}
