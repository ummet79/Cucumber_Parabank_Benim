package StepDefinitions;

import Pages.LeftNav;
import Pages._01_DialogContent;
import Utilies.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_Register {
    LeftNav ln=new LeftNav();
    _01_DialogContent dc=new _01_DialogContent();

    @Given("Navigate to the WebSite")
    public void navigateToTheWebSite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");


    }


    @Then("Success mesaage should be displayed")
    public void successMesaageShouldBeDisplayed() {
        dc.verifyMessageContainsText("success");




    }
}
