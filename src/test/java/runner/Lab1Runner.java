package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinations",
    // plugin = {"pretty", "html:target/cucumber-reports"}
	// plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}
    plugin = {"pretty", "json:target/cucumber-reports"}
)

public class Lab1Runner extends AbstractTestNGCucumberTests{
	
}
