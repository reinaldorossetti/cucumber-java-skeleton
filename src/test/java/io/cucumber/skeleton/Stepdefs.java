package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(int1);
    }

    @Then("my belly should {string}")
    public void my_belly_should_growl(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }


}
