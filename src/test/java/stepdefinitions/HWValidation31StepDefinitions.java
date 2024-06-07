package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.HWValidation31;

public class HWValidation31StepDefinitions {

    HWValidation31 hwValidation = new HWValidation31();
    @When("user enters form firstname {string}")
    public void user_enters_form_firstname(String firstname) {
        hwValidation.firstname.sendKeys(firstname);
    }
    @When("user enters form lastname {string}")
    public void user_enters_form_lastname(String lastname) {
        hwValidation.lastname.sendKeys(lastname);
    }
    @When("user not enters form age {string}")
    public void user_not_enters_form_age(String age) {
       hwValidation.age.sendKeys(age);
    }
    @When("user selects form country {string}")
    public void user_selects_form_country(String country) {
       hwValidation.country.sendKeys(country);
    }
    @When("user enters form notes {string}")
    public void user_enters_form_notes(String notes) {
        hwValidation.notes.sendKeys(notes);
    }
    @When("user clicks on form gonder")
    public void user_clicks_on_form_gonder() {
        hwValidation.gonder.click();
    }
    @When("user validates error message about age")
    public void user_validates_error_message_about_age() {
        hwValidation.hataAge.isDisplayed();
    }

    @And("user enters form age {string}")
    public void userEntersFormAge(String age) {
        hwValidation.age.sendKeys(age);
    }
}
