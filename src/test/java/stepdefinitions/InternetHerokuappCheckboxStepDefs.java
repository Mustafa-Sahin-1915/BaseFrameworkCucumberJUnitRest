package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pages.InternetHerokuappCheckBoxes;
import utilities.Driver;
public class InternetHerokuappCheckboxStepDefs {

    private InternetHerokuappCheckBoxes checkBoxesPage = new InternetHerokuappCheckBoxes();
    public InternetHerokuappCheckboxStepDefs() {

    }

    @Then("As a user verify the page title is {string}")
    public void as_a_user_verify_the_page_title_is(String pageTitle) {
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title, pageTitle);
    }
    @When("As a user clicks all checkboxes on the page")
    public void as_a_user_clicks_all_checkboxes_on_the_page() {
        for (WebElement checkbox:checkBoxesPage.checkboxes) {checkbox.click();}
    }
    @Then("As a user verify that checkbox1 is checked and checkbox2 is unchecked")
    public void as_a_user_verify_that_checkbox1_is_checked_and_checkbox2_is_unchecked() {
        Assert.assertTrue(checkBoxesPage.checkbox1.isSelected());
        Assert.assertFalse(checkBoxesPage.checkbox2.isSelected());
    }
}
