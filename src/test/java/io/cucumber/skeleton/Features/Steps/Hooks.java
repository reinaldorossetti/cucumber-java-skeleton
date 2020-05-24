package io.cucumber.skeleton.Features.Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    BaseClassStep test = new BaseClassStep();
    private static String ultimoStep="";

    @AfterStep
    public void afterStep() {
        System.out.println("AfterStep Tag!");
    }

    @BeforeStep
    public void beforeStep() {
        ultimoStep = test.getStepText();
        System.out.println("Step Armazenado Print: " + ultimoStep);
    }

    @After
    public void afterScenario(Scenario scenario) {
        String scenarioName = scenario.getName();
        System.out.println("After Scenario:");
        System.out.println("Imagem_CenarioName=" + String.valueOf(scenarioName).replaceAll("[^a-zA-Z0-9]", "_")
                + "_StepName=" + String.valueOf(ultimoStep).replaceAll("[^a-zA-Z0-9]", "_") + "_" +
                dateNow().replaceAll("[^a-zA-Z0-9]", "_") );
    }

    public String dateNow() {
        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formata.format(date);
    }
}
