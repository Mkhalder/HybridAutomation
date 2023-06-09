package StepDefinition.WebAutomation;

import POM.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.WebAutomation.BML1AddAccountStepDefinition.driver;

public class BML2OppenAccountStepdefs {

    Elements elements;
    @Given("bank manager clicks on the oppen account tab")
    public void bankManagerClicksOnTheOppenAccountTab() throws InterruptedException {
        elements = new Elements(driver);
        elements.bankManagerClicksOnTheOppenAccountTab();
        
    }

    @When("bank manager select newly add a customer name")
    public void bankManagerSelectNewlyAddACustomerName() throws InterruptedException {
        elements.bankManagerSelectNewlyAddACustomerName();
        
    }

    @And("bank manager select currency")
    public void bankManagerSelectCurrency() throws InterruptedException {
        elements.bankManagerSelectCurrency();
        
    }

    @And("bank manager click process button")
    public void bankManagerClickProcessButton() throws InterruptedException {
        elements.bankManagerClickProcessButton();
        
    }

    @Then("bank manager gets a popup notification and closes it")
    public void bankManagerGetsAPopupNotificationAndClosesIt() {
        elements.bankManagerGetsAPopupNotificationAndClosesIt();
    }
}
