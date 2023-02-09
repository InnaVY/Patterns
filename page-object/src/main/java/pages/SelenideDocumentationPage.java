package pages;

import logger.TestLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

public class SelenideDocumentationPage {
    WebDriver driver;

    public SelenideDocumentationPage (WebDriver driver){
        this.driver = driver;
    }
    By logo = By.id("selenide-logo");

    public void verifyLogo(){
        TestLogger.logAction("Inside verify logo");
      TestLogger.logAction(driver.getTitle());
        //Reporter.log(driver.getTitle());
       Assert.assertTrue(driver.findElement(logo).isDisplayed());
    }
}
