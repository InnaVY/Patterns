package pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SelenideHomePage {
    private final SelenideElement mainMenu = $(".main-menu-pages");
    private final SelenideElement docs = $x("//a[contains(text(), 'Docs')]");


    public SelenideHomePage mainMenueDisplayed(){
        Assert.assertTrue(mainMenu.isDisplayed());
        return this;
    }

    public SelenideHomePage clickDocs(){
        docs.click();
        return this;
    }
}
