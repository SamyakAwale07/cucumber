package com.aiotests.samples.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberStepDefs {
    @Given("the {word} and {word}")
    public void printMeaning(String value1, String value2) {
        System.out.println("Life is about " + value1 + " and " + value2);
    }

    @Given("I go to Profile page")
    public void goToProfilePage() {
        System.out.println("Profile page navigation code");
    }

    @When("I change password to a new one")
    public void changePassword() {
        System.out.println("Change password");
    }

    @Then("I am logged out")
    public void verifyLoggedOut() {
        System.out.println("Verify I am logged out");
    }

    @Then("I am on the home page")
    public void verifyHomePage() {
        System.out.println("Verify I am logged out");
    }

    @Then("I select sign in to my account menu")
    public void signInFromAccount() {
        System.out.println("Verify I am logged out");
    }

    @Then("sign in page is opened")
    public void verifySignInPage() {
        System.out.println("Verify I am logged out");
    }

    @Then("I open main menu and select sign in now")
    public void signInFromMainMenu() {
        System.out.println("Sign In from Main menu");
    }

    @Then("I enter valid customer email address and password")
    public void signIn() {
        System.out.println("I sign in");
    }

    @Then("I am on the checkout page")
    public void checkout() {
        System.out.println("Checkout");
    }

}

