package io.cucumber.skeleton;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, plugin = {
        "pretty",
        "io.cucumber.skeleton.StepsDefinition.BaseClassStep",
        "html:target/cucumber",
        "json:target_json/cucumber.json",
})
public class RunCucumberTest {
    @BeforeClass
    public static void setup() {
        System.out.println("Before BDD, Junit BeforeClass");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("After BDD, Junit AfterClass");
    }
}
