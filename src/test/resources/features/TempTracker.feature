@TempTracker
Feature: Capture the number of trees planted and show relation to global warming

  @P0
  Scenario: Trees effect on global warming
    Given There are no trees numbered in a given region
    When Each user plants a tree and updates
    Then The temperature is updated in the temperature log
    When Temperature is captured over a few days
    Then The graph should show the relation between the number of trees and temperature


  @P0
  Scenario: No trees planted - failed attempt
    Given There are no trees numbered in a given region
    When Each user plants a tree and updates
    Then The temperature is updated in the temperature log
    When Temperature is captured over a few days
    Then The graph should show no updates

  @P0
  Scenario: Skipped trees - skipped steps case
    Given There are no trees numbered in a given region
    When The graph should show no updates
    When Each user plants a tree and updates
    Then The temperature is updated in the temperature log