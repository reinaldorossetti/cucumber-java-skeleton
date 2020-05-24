package io.cucumber.skeleton.Features.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {

    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(Integer cukes) {
        System.out.println("Test Regex: " + cukes);
    }

    @When("I wait {double} hour")
    public void i_wait_hour(Double int1) {
        System.out.println("Test Integer: " + int1);
    }

    @Then("my belly should {string}")
    public void my_belly_should_growl(String string) {
        System.out.println("Test String: " + string);
    }
}
