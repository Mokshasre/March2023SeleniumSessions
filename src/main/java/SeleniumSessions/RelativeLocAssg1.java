package SeleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocAssg1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/icc-cricket-world-cup-qualifier-warm-up-matches-2023-1379547/scotland-vs-west-indies-warm-up-1379558/full-scorecard");

		Thread.sleep(4000);
		

		WebElement ele = driver.findElement(By.linkText("Johnson Charles"));
		
		
		List<WebElement> rightElents = driver.findElements(with(By.xpath("//span[text()='Johnson Charles']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]")).toRightOf(ele));
		
		for(WebElement b :rightElents)
		{
			System.out.println(b.getText());
		}
	
}
}
