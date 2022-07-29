package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	public WebDriver driver;
	
	private By searchBox = By.name("q");
	private By searchBtn = By.cssSelector("input[name='btnK']");
	private By searchField = By.name("q");
	
	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	public void enterSearchQuery(String query) {
		
		driver.findElement(searchBox).sendKeys(query);	
	}
	
	public void clickSearchButton() {
		
		driver.findElement(searchBtn).click();
	}
	
	public String returnSearchResult() {
		
		return driver.findElement(searchField).getAttribute("value");	
	}

}
