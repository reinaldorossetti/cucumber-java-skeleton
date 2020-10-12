package io.cucumber.skeleton;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, glue="io.cucumber.skeleton.features.Steps", features = "src/test/java/io/cucumber/skeleton/features", plugin = {
        "pretty",
        "io.cucumber.skeleton.features.Steps.BaseClassStep",
        "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
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
