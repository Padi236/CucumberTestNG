package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "Features/RHSLogin.feature",
		glue = "stepDefinition",
		dryRun = false,
		monochrome = false,
		tags = "@tag2",		
		plugin = {"pretty","html:test-output/CucumberReports/report.html "}
		
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
