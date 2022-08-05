package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class SampleScenarioStepDefs {
/*
@ui @samplescenario
Feature: This is sample feature

  Scenario Outline: This sample scenario opens google
    Given As a user go to the "<webpage>" page
    Then As a user verify the page title is not empty
    And As a user close the web page

    Examples:
      | webpage                |
      | https://www.google.com |
 */

    @Given("As a user go to the {string} page")
    public void as_a_user_go_to_the_page(String webpage) {
        Driver.getDriver().get(webpage);
    }
    @Then("As a user verify the page title is not empty")
    public void as_a_user_verify_the_page_title_is_not_empty() {
        Assert.assertFalse(Driver.getDriver().getTitle().isEmpty());
    }
    @Then("As a user close the web page")
    public void as_a_user_close_the_web_page() {
        Driver.closeDriver();
    }
}
