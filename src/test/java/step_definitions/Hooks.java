package step_definitions;

import cucumber.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {
	
	public TestContextSetup setup;
	
	public Hooks(TestContextSetup setup) {
		
		this.setup = setup;
	}
	
	@After
	public void closeDriver() {
		
		setup.base.driver.quit();
	}

}
