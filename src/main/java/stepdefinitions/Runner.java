package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Junit or TestNG
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/featurefile",glue="stepdefinitions",plugin={"pretty","html:target/report.html"},tags="@smoke")
public class Runner {

}
