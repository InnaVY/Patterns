import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FactoryDesignTests {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeMethod
    public void init(){
       driverManager = DriverManageFactory.getManager(DriverType.FIREFOX);
       driver = driverManager.getDriver();
    }

    @Test
    public void verifyBStackDemoLogo() {
        driver.get("https://bstackdemo.com/");
        WebElement logo = driver.findElement(By.cssSelector(" a.Navbar_logo__26S5Y"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(logo.isDisplayed());
    }

    @AfterTest
    public void afterMethod() {
        driver.quit();
    }
}
