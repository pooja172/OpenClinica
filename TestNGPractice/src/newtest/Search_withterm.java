package newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Search_withterm {

	WebDriver driver;

	@Parameters({ "browser" })
	@Test

	public void search(String browser) throws InterruptedException {

		// This is the path of gecko driver

		if (browser.matches("firefox")) {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path + "\\drivers\\Firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		// This is the path of chrome driver
		if (browser.matches("chrome")) {

			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\drivers\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("selenium - Google Search"), true);
		driver.quit();
	}

}
