package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
			plugin= {"pretty"},
			tags="",
			features= {"src/main/resources/com.app.features/"},
			glue= {"step_definitions/"},
			dryRun=false
			)

	public class CukesRunner extends AbstractTestNGCucumberTests{
}
