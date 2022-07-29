package cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "step_definitions",
		monochrome = true,
		plugin = {"html:target/cucumber-reports/cucumber.html",
				"junit:target/cucumber-reports/cucumber.xml"}
	)
public class TestRunner {

}
