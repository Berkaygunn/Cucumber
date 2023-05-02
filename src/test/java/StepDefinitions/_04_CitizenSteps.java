package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenSteps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenShip);
    }

    @When("User a Citizenship name as {string} short name as {string}")
    public void userACitizenshipNameAsShortNameAs(String name, String shortName) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.shortName, shortName);
        dc.clickFunction(dc.saveInput);
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.alreadyExist,"already");
    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteItem(searchText);
    }
}
