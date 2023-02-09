package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SelenideHomePage {
    WebDriver driver;
    @FindBy(css = ".main-menu-pages") WebElement mainMenu;
    @FindBy(linkText = "Docs") WebElement docs;

    public SelenideHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void mainMenueDisplayed(){
        Assert.assertTrue(mainMenu.isDisplayed());
    }

    public void clickDocs(){
        docs.click();
    }
}
