package pageClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	// Initializing webdriver
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator for login button
	By Searchtab = By.name("q");

	// Method to click login button
	public void Search() {
		driver.findElement(Searchtab).sendKeys("selenium");
	}

	public void Enter() {
		driver.findElement(Searchtab).sendKeys(Keys.ENTER);
	}

	public void click() {
		driver.findElement(Searchtab).click();
	}

	public void SearchDropdown() {
		// get the list of trending searches in firefox
		List<WebElement> elementsLst = driver.findElements(By.xpath("//ul[@class='erkvQe']//li//span"));
		// Get the size of list
		System.out.println(elementsLst.size());
		// if the list has values
		if (elementsLst.size() > 0) {
			for (WebElement row : elementsLst) {
				// click the first row
				row.click();
				break;
			}
		}
	}
}
