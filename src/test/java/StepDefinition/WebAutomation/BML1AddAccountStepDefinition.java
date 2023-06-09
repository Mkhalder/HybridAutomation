package StepDefinition.WebAutomation;

import Core.WebHelper;
import POM.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BML1AddAccountStepDefinition {

    public static WebDriver driver;

    Elements elements;;
    @Given("bank manager lands on the XYZ home page")
    public void bankManagerLandsOnTheXYZHomePage() {
        WebHelper helper = new WebHelper();
        driver = helper.browser();
        
    }

    @When("manager clicks on the bank manager login option")
    public void managerClicksOnTheBankManagerLoginOption() {
        elements = new Elements(driver);
        elements.managerClicksOnTheBankManagerLoginOption();
        
    }

    @And("manager clicks on the add customer tab")
    public void managerClicksOnTheAddCustomerTab() {
        elements.managerClicksOnTheAddCustomerTab();


    }

    @And("manager inserts {string} {string} and {string}")
    public void managerInsertsFirstNameLastNameAndPostCode(String firstName, String lastName, String postCode) throws InterruptedException {
        elements.managerInsertsFirstNameLastNameAndPostCode(firstName, lastName, postCode);
        
    }

    @And("manager clicks on the add customer option")
    public void managerClicksOnTheAddCustomerOption() throws InterruptedException {
        elements.managerClicksOnTheAddCustomerOption();
        
    }

    @Then("manager gets a popup notification and closes it")
    public void managerGetsAPopupNotificationAndClosesIt() {
        elements.managerGetsAPopupNotificationAndClosesIt();
    }
}
