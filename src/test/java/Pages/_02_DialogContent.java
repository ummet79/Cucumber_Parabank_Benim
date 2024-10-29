package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _02_DialogContent extends ParentPage {

    public _02_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line

    @FindBy(xpath = "//*[text()='Accounts Overview']")
    public WebElement message;

    @FindBy(xpath = "//*[text()='The username and password could not be verified.']")
    public WebElement negativemessage;

    public void MessageContainsText(String value){
        Assert.assertTrue( this.message.isDisplayed());

    }
    public void NegaiveMessageContainsText(String value){
        Assert.assertTrue( this.negativemessage.isDisplayed());

    }
}