package io.cucumber.skeleton.features.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.Belly;
import io.cucumber.skeleton.suport.ReaderCSV;

import java.util.ArrayList;


public class StepdefsX {

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

    @Given("I have X cukes in my belly")
    public void I_have_cukes_in_my_belly() {
        Belly belly = new Belly();
        belly.eat(Integer.parseInt(valores_da_massa.get(1).trim()));
    }

    @When("I wait X hour")
    public void i_wait_hour() {
        System.out.println("\n" + valores_da_massa.get(2));
    }

    @Then("my belly should X")
    public void my_belly_should_growl() {
        System.out.println(valores_da_massa.get(3));
    }
}
