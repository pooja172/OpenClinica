package TestClass;

import org.testng.annotations.Test;

import pageClass.BasePage;
import pageClass.SearchPage;
import pageClass.ResultsPage;

public class SearchResults_TC extends BasePage {

	@Test
	public void init() throws Exception {

		// Create object of SearchPage and ResultsPage
		SearchPage searchpage = new SearchPage(driver);
		ResultsPage resultpage = new ResultsPage(driver);

		searchpage.Search();
		Thread.sleep(2000);
		searchpage.Enter();
		Thread.sleep(2000);

		// Get the page title
		resultpage.GetPageTitle();
		// Verify page title
		resultpage.VerifyPageTitle();

	}
}
