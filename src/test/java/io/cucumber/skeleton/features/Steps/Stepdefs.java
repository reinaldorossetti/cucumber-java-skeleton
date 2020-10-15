package io.cucumber.skeleton.features.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.suport.ReaderCSV;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Random;

public class Stepdefs {

    ArrayList<String> valores_da_massa;

    @Before
    public void doSomethingBefore(Scenario scenario) throws Exception {
        String CT = scenario.getSourceTagNames().iterator().next();
        System.out.println("TEST CN: " + CT);
        String cwd = System.getProperty("user.dir");
        System.out.println("Current working directory : " + cwd);
        String csv_path = (cwd + "\\data_mass\\data_mass_scenarioX.csv");
        ReaderCSV csv_file = new ReaderCSV();
        valores_da_massa = csv_file.oneByOne(csv_path, CT);
        System.out.println(String.format("massa => %s", valores_da_massa));
    }

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
        Assert. assertEquals(string, valores_da_massa.get(3));
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        final String[] list = {"growl","cry"};
        Random random = new Random();
        int index = random.nextInt(list.length);
        Assert.assertEquals(list[index], valores_da_massa.get(3));
    }
}
