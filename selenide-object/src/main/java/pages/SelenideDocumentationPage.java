package pages;

import com.codeborne.selenide.SelenideElement;
import logger.TestLogger;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

import org.testng.Assert;

public class SelenideDocumentationPage {
  private final SelenideElement logo = $("#selenide-logo");

    public void verifyLogo(){
        TestLogger.logAction("Inside verify logo");
      TestLogger.logAction(title());
      Assert.assertTrue(logo.isDisplayed());
    }
}
