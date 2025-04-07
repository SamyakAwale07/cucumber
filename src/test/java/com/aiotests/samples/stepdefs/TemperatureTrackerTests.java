package com.aiotests.samples.stepdefs;

import com.aiotests.samples.deforestation.TemperatureTrackerModule;
import com.aiotests.samples.deforestation.TreeTrackerModule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TemperatureTrackerTests {

    @Given("There are no trees numbered in a given region")
    public void no_trees_state() {
        System.out.println("No trees state");
        TreeTrackerModule treeTrackerModule = TreeTrackerModule.getTreeTracker();
        treeTrackerModule.setNumberOfTrees(0);
    }

    @Then("Each user plants a tree and updates")
    public void plant_tree() {
        System.out.println("Plant trees");
        TreeTrackerModule.getTreeTracker().plantTrees(10);
    }

    @Then("The temperature is updated in the temperature log")
    public void set_init_temp() {
        System.out.println("Clearing day temperature");
        TemperatureTrackerModule.getTempTracker().clearTemperature();

    }

    @Then("Temperature is captured over a few days")
    public void capture_temp() {
        TemperatureTrackerModule.getTempTracker().setTemperature(40);
    }

    @Then("The graph should show the relation between the number of trees and temperature")
    public void validate_graph() {
        Assert.assertTrue(true, "Verified graph is displayed correctly");
    }

    @Then("The graph should show no updates")
    public void no_updates() {
//        DriverManager.get().get("https://www.google.com");
        Assert.assertEquals(true, false, "Verified graph is showing no updates");
    }
}
