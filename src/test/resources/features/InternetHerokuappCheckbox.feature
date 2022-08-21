@ui @samplescenario2
Feature: This clicks the checkboxes on the page

  Scenario Outline: This sample scenario opens page and click checkboxes
    Given As a user go to the "<webpage>" page
    Then As a user verify the page title is "<pagetitle>"
    When As a user clicks all checkboxes on the page
    Then As a user verify that checkbox1 is checked and checkbox2 is unchecked

    Examples:
      | webpage                                       | pagetitle    |
      | https://the-internet.herokuapp.com/checkboxes | The Internet |
