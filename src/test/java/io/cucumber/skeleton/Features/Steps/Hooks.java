package io.cucumber.skeleton.Features.Steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class Hooks {

    BaseClassStep test = new BaseClassStep();

    @AfterStep
    public void afterStep() {
        System.out.println("AfterStep Tag!");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("Step Armazenado Print: " + test.Step());
    }

}
