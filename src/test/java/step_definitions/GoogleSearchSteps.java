package step_definitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import page_objects.GoogleSearchPage;

@RunWith(Cucumber.class)
public class GoogleSearchSteps {
	
	public WebDriver driver;
	public TestContextSetup setup;
	public GoogleSearchPage searchPage;
	public String pageTitle;
	
	public GoogleSearchSteps(TestContextSetup setup) {
		
		this.setup = setup;
		this.searchPage = setup.manager.getGoogleSearchPage();
	}
	
	@Given("^I am on the main Google page$")
    public void i_am_on_the_main_google_page() throws Throwable {
       
		pageTitle = searchPage.getPageTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Google");
    }

    @When("^I type (.+) in the search box$")
    public void i_type_in_the_search_box(String something) throws Throwable {
        
    	searchPage.enterSearchQuery(something);
    	System.out.println("Typed " + something + " into the search text field");
    }
    
    @And("^Hit search$")
    public void hit_search() throws Throwable {
        
    	searchPage.clickSearchButton();
    }

    @Then("^I can see (.+) in the results$")
    public void i_can_see_in_the_results(String something) throws Throwable {
        
    	pageTitle = searchPage.getPageTitle();
    	System.out.println(pageTitle);
    	Assert.assertTrue(pageTitle.startsWith(something));
    	
    	String searchValue = searchPage.returnSearchResult();
    	Assert.assertEquals(something, searchValue);
    }
    
}
