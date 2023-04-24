
Feature: Validate location filter methods
  User Story: As a user, I should be able to use location filter methods

  Scenario: User sees location filter methods under location
    Given User logs in as a "driver"
    When user lands on Quick Launchpad
    Then user selects Vehicle under Fleet menu
    Then user lands on Cars page
    Then user clicks on filters icon
    Then user clicks on manage filters and selects location checkbox
    Then user clicks on location button to see various methods
    Then user validate "contains" method is displayed
    Then user validate "does not contains" method is displayed
    Then user validate "is equal to" method is displayed
    Then user validate "starts with" method is displayed
    Then user validate "ends with" method is displayed
    Then user validate "is any of" method is displayed
    Then user validate "is not any of" method is displayed
    Then user validate "is empty" method is displayed
    Then user validate "is not empty" method is displayed

    Scenario: user selects the "Contains" method with a keyword, the results should contain the specified keyword
      Given User logs in as a "driver"
      When user lands on Quick Launchpad
      Then user selects Vehicle under Fleet menu
      Then user lands on Cars page
      Then user clicks on filters icon
      Then user clicks on manage filters and selects location checkbox
      Then user clicks on location button to see various methods
      Then user selects "contains" method
      Then user enters keyword in the search box and click update button
      Then user verifies the results

      Scenario: user selects the "Does Not Contain" method with a keyword, the results should not contain the specified keyword
        Given User logs in as a "driver"
        When user lands on Quick Launchpad
        Then user selects Vehicle under Fleet menu
        Then user lands on Cars page
        Then user clicks on filters icon
        Then user clicks on manage filters and selects location checkbox
        Then user clicks on location button to see various methods
        Then user selects "does not contain" method
        Then user enters keyword in the search box and click update button
        Then user verifies the results