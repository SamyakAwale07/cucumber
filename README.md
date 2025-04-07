**Demo project Info**

This is a sample demo project, based on Cucumber, driven by TestNG-Java.  
The project shows how to map Cucumber scenarios with existing AIO Tests or to create new ones.

The feature file @src/test/resources/features contains the mapping.
Two cases are mapped to existing AIO Tests and one is a newly created scenario


``Feature: Capture the number of trees planted and show relation to global warming


  @P0 @AT-TC-1222  
  Scenario: Trees effect on global warming  
    Given There are no trees numbered in a given region  
    When Each user plants a tree and updates  
   ..


  @P0 @AT-TC-1223  
  Scenario: No trees planted - failed attempt  
    Given There are no trees numbered in a given region  
    When Each user plants a tree and updates  
..  

  @P0  
  Scenario: Skipped trees - skipped steps  
    Given There are no trees numbered in a given region  
    When The graph should show no updates  
   ..  ``
---

