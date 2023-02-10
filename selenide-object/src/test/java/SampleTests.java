import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SelenideDocumentationPage;
import pages.SelenideHomePage;

import static com.codeborne.selenide.Selenide.open;
import static property.PropertyHolder.selenoidProperties;


public class SampleTests {
    SelenideHomePage selenideHomePage = new SelenideHomePage();
    SelenideDocumentationPage selenideDocumentationPage = new SelenideDocumentationPage();
    @BeforeMethod
    public void init(){
    //  WebDriverManager.chromedriver().win().driverVersion(selenoidProperties.getChromeVersion()).setup();

      open("https://selenide.org/");
    }

    @Test
    public void test_1(){
      selenideHomePage
              .mainMenueDisplayed()
              .clickDocs();

    }

    @Test
    public void test_2(){
        selenideHomePage
                .mainMenueDisplayed()
                .clickDocs();
        selenideDocumentationPage.verifyLogo();
    }

    @AfterMethod
    public void tearDown(){
        WebDriverRunner.getWebDriver().quit();
    }
}
