package pageClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePage {

	public static WebDriver driver = null;

	@BeforeSuite
	public void initialize() throws IOException {

		// This is the path of gecko driver
		String path = System.getProperty("user.dir");		
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\Firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		// To maximize the browser
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// To open Google page
		driver.get("https://www.google.com");
	}

	@AfterSuite
	// Test cleanup
	public void TeardownTest() {
		BasePage.driver.quit();
	}
}
