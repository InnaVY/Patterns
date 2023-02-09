package pages;

import logger.TestLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SelenideDocumentationPage {
    WebDriver driver;

    public SelenideDocumentationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="selenide-logo") WebElement logo;

    public void verifyLogo(){
        TestLogger.logAction("Inside verify logo");
        TestLogger.logAction(driver.getTitle());
        //Reporter.log(driver.getTitle());
       Assert.assertTrue(logo.isDisplayed());
    }
}
