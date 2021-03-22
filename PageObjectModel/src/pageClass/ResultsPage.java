package pageClass;

import org.openqa.selenium.WebDriver;

public class ResultsPage {

	// Initializing driver
	WebDriver driver;
	String PageTitle;

	// Initializing driver variable in constructor
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	// get Page title
	public void GetPageTitle() {
		PageTitle = driver.getTitle();
	}

	// Verify page title
	public void VerifyPageTitle() {
		String Actual = PageTitle;
		String Expected = "selenium - Google Search";
		if (Actual.equals(Expected)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

	}

}
