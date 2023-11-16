package stepdefinitions;

import org.testng.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/main/java/featurefile",glue="stepdefinitions",plugin={"pretty","html:target/report.html"})
public class RunnerTestng extends AbstractTestNGCucumberTests{
	
	}

