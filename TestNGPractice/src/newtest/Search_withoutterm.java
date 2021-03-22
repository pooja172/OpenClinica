package newtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Search_withoutterm {

	WebDriver driver;

	@Parameters({ "browser" })
	@Test

	public void search(String browser) throws InterruptedException {

		if (browser.matches("firefox")) {
			//"D:\\Firefox\\geckodriver.exe"
			System.setProperty("webdriver.gecko.driver","/TestNGPractice/drivers/Firefoxdriver/geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		if (browser.matches("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/TestNGPractice/drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).click();
		driver.manage().timeouts().implicitlyWait(14000, TimeUnit.MILLISECONDS);

		List<WebElement> elementsLst = driver.findElements(By.xpath("//ul[@class='erkvQe']//li//span"));

		System.out.println(elementsLst.size());

		if (elementsLst.size() > 0) {
			for (WebElement row : elementsLst) {

				row.click();
				break;

			}
		}
		driver.quit();
	}
}
