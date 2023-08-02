package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		By searchLocator = By.name("q"); // to search the wording in google search field
		By searchSuggLocator = By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span");
		
		doSearch(searchLocator,searchSuggLocator,"Naveen Automation Labs","selenium");
		

	}

	public static void doSearch(By searchLocator, By searchSuggLocator, String searchKey, String suggName)
			throws InterruptedException {
		driver.findElement(searchLocator).sendKeys(searchKey);

		Thread.sleep(4000);

		List<WebElement> suggList = driver.findElements(searchSuggLocator);

		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}
		}

	}

}
