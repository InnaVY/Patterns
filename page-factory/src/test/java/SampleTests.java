import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SelenideDocumentationPage;
import pages.SelenideHomePage;


public class SampleTests {
    WebDriver driver;
    SelenideHomePage selenideHomePage;
    SelenideDocumentationPage selenideDocumentationPage;
    @BeforeMethod
    public void init(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://selenide.org/");
    }

    @Test
    public void test_1(){
      selenideHomePage = new SelenideHomePage(driver);
      selenideHomePage.mainMenueDisplayed();
      selenideHomePage.clickDocs();
    }

    @Test
    public void test_2(){
        selenideHomePage = new SelenideHomePage(driver);
        selenideHomePage.mainMenueDisplayed();
        selenideHomePage.clickDocs();
        selenideDocumentationPage = new SelenideDocumentationPage(driver);
        selenideDocumentationPage.verifyLogo();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
