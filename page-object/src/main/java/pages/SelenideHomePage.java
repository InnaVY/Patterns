package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelenideHomePage {
    WebDriver driver;
    By mainMenu = By.cssSelector(".main-menu-pages");
    By docs = By.linkText("Docs");

    public SelenideHomePage (WebDriver driver){
        this.driver = driver;
    }

    public void mainMenueDisplayed(){
        Assert.assertTrue(driver.findElement(mainMenu).isDisplayed());
    }

    public void clickDocs(){
        driver.findElement(docs).click();
    }
}
