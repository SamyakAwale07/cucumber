@Login
Feature: Capture the number of trees planted and show relation to global warming

  @PWO
  Scenario: Validate sign in page
    Given I am on the home page
    When I select sign in to my account menu
    Then sign in page is opened
    When I enter valid customer email address and password
