package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				glue={"stepDefinitions"},
				tags = "@smoke",
				monochrome = true,
				plugin = {
						"pretty",
						"html:target/cucumber-reports/cucumber-reports.html",
						"json:target/cucumber-reports/cucumber-reports.json"
				})
public class TestRunner {
	
}