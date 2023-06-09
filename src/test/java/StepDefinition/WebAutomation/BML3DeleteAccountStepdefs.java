package StepDefinition.WebAutomation;

import POM.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.WebAutomation.BML1AddAccountStepDefinition.driver;

public class BML3DeleteAccountStepdefs {
    Elements elements;
    @Given("manager in customers page")
    public void managerInCustomersPage() throws InterruptedException {
        elements = new Elements(driver);
        elements.managerInCustomersPage();
        
    }

    @When("manager search name")
    public void managerSearchName() throws InterruptedException {
        Thread.sleep(1000);
        elements.managerSearchName();
        
    }

    @And("manager delete the account")
    public void managerDeleteTheAccount() throws InterruptedException {
        Thread.sleep(1000);
        elements.managerDeleteTheAccount();
        
    }

    @Then("successfully account will be deleted")
    public void successfullyAccountWillBeDeleted() throws InterruptedException {
        Thread.sleep(1000);
        elements.successfullyAccountWillBeDeleted();
    }
}
