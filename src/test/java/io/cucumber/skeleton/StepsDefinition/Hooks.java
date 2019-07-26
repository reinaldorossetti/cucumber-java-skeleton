package io.cucumber.skeleton.StepsDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.Random;

public class Hooks {

    Random rand = new Random();
    int value = rand.nextInt(50);

    @Before
    public void beforeClass() throws Exception {
        System.out.println("Inside Before"+value + "\n");
    }

    @After
    public void afterClass() throws InterruptedException, IOException {
        System.out.println("Inside After"+value + "\n");
    }
}
