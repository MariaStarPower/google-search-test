package cucumber;

import org.openqa.selenium.WebDriver;

import page_objects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public BaseClass base;
	public PageObjectManager manager;
	
	public TestContextSetup() {
		
		base = new BaseClass();
		manager = new PageObjectManager(base.startDriver());
	}

}
