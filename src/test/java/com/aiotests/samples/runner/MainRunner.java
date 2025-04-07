package com.aiotests.samples.runner;

/*
 * Copyright (c) 2021. [Navarambh Software Pvt. Ltd]
 */

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",tags = "@PWO",
        glue = {"com.aiotests.samples.stepdefs","com.aiotests.utils"},
        plugin = { "pretty", "json:target/cucumber-reports/cucumber_sample.json",
                "junit:target/cucumber-reports/Cucumber.xml"})

public class MainRunner extends AbstractTestNGCucumberTests {
}
