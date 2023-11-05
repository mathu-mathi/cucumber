package stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/featurefile",glue="stepdefinitions",plugin={"pretty","html:target/report.html"},tags="@smoke")
public class RunnerTestng extends AbstractTestNGCucumberTests{

}
