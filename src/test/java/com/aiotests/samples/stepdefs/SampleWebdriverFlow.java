package com.aiotests.samples.stepdefs;

import com.aiotests.utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SampleWebdriverFlow {

    @Given("I go to google")
    public void i_go_to_google() {
        DriverManager.get().get("https://www.google.com");
    }

    @Then("I fail with screenshot")
    public void i_fail_with() {
            new SoftAssert().assertTrue(false, "A soft assert has failed");
//            CucumberHooks.takeSS();
    }

    @Then("I fail with afterstep screenshot")
    public void failing_step_screenshot_in_after() {
        Assert.assertEquals(4,10, "Hard failure");
    }

}
