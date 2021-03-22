package TestClass;

import org.testng.annotations.Test;

import pageClass.BasePage;
import pageClass.SearchPage;
import pageClass.ResultsPage;

public class SearchWithoutText extends BasePage {

	@Test
	public void init() throws Exception {

		// BasePage b = new BasePage();
		// Create object of SearchPage and ResultsPage
		SearchPage search = new SearchPage(driver);
		ResultsPage result = new ResultsPage(driver);

		// search.Search();
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		search.SearchDropdown();

		// Get the page title
		result.GetPageTitle();
		// Verify page title
		result.VerifyPageTitle();
	}
}