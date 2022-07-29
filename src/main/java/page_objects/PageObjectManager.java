package page_objects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public GoogleSearchPage googleSearch;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public GoogleSearchPage getGoogleSearchPage() {
		
		googleSearch = new GoogleSearchPage(driver);
		
		return googleSearch;
	}
	
}
