package io.cucumber.skeleton.StepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.Random;

public class Hooks {

    Random rand = new Random();
    int value = rand.nextInt(50);

    @Before
    public void beforeScenario() throws Exception {
        System.out.println("Before Scenario"+value + "\n");
    }

    @After
    public void afterScenario() throws InterruptedException, IOException {
        System.out.println("After Scenario"+value + "\n");
    }
}
