@WD
Feature: Webdriver flow demo - simple navigation

@SeleniumDemo
Scenario Outline: Navigate to <website>
    Given I go to <website>
    Then I fail with screenshot
    Then I fail with afterstep screenshot

Examples:
    | website  |
    | google   |

