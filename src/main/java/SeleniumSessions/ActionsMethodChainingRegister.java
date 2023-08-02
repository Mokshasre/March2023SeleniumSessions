package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
          WebElement fn = driver.findElement(By.id("input-firstname"));
          
          Actions act = new Actions(driver);
          
          act.sendKeys(fn, "Sravani")
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys("automation")
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys("automation@gmail.com")
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys("98764333209")
          .pause(1000)
          .sendKeys(Keys.TAB)
          .sendKeys("automation@123")
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys("automation@123")
          .pause(1000)
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys(Keys.TAB)
          .pause(1000)
          .sendKeys(Keys.SPACE)
          .pause(1000)
          .sendKeys(Keys.SPACE)
          .sendKeys(Keys.TAB)
          .click()
          .build().perform();

	}

}
