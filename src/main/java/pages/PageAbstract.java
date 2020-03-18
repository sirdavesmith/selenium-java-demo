package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;

public abstract class PageAbstract {
    @Getter
    private final WebDriver driver;

    @Getter
    protected String pageName;

    @Getter
    protected String pageTitle;

    @Getter
    protected String URL;

    PageAbstract(WebDriver driver) {
        this.driver = driver;
    }

    public void open(WebDriverWait driverWait){
        this.getDriver().get(URL);
        driverWait.until(ExpectedConditions.titleIs(getPageTitle()));
        Log.pageLoaded(this);
    }

    public PageAbstract SwitchToFrame(String frame) {
        driver.switchTo().frame(frame);
        return this;
    }

    public PageAbstract RestoreDefaultFrameAndWindow() {
        driver.switchTo().defaultContent();
        return this;
    }

    public void AcceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    void clearTextById (String textId) {
        this.getDriver().findElement(By.id(textId)).clear();
    }

    void sendTextById(String textId, String text, String identifier) {
        Log.logMessage("Accessing " + identifier + " by id: " + textId + "\n");
        this.getDriver().findElement(By.id(textId)).sendKeys(text);
    }

    void clickById(String textId, String identifier){
        Log.logMessage("Accessing " + identifier + " by id: " + textId + "\n");
        this.getDriver().findElement(By.id(textId)).click();
    }

    void clickByClassName(String className, String identifier){
        Log.logMessage("Accessing " + identifier + " by class name: " + className + "\n");
        this.getDriver().findElement(By.className(className)).click();
    }

    void clickByXpath (String xpath, String identifier){
        Log.logMessage("Accessing " + identifier + " by xpath: " + xpath + "\n");
        this.getDriver().findElement(By.xpath(xpath)).click();
    }

    void reorderElementByXpath (String xpathSourceElement, String xpathTargetElement) {
        Actions act = new Actions(this.getDriver());

        act.dragAndDrop(this.getDriver().findElement(By.xpath(xpathSourceElement)), this.getDriver().findElement(By.xpath(xpathTargetElement))).perform();
    }
}
