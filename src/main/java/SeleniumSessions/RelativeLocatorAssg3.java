package SeleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorAssg3 {

	static WebDriver driver; // creating this since we can all in beyond the main method for generic methods 
	//we can call with static ...directly
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

		driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			Thread.sleep(2000);
			/**
			 * CHk with naveen why not clicked on radio button
			 */
			
		//WebElement chkLocator = driver.findElement(By.xpath("//input[@type='radio']/ancestor::div[@class='form-group']//div//label[1]"));
			
			
		//String text = chkLocator.getText();
		
			
		//driver.findElement(with(By.tagName("input")).toLeftOf(chkLocator)).click();
		
		
		WebElement chkpolicy = driver.findElement(By.xpath("//b[text()='Privacy Policy']"));
		
		driver.findElement(with(By.tagName("input")).toRightOf(chkpolicy)).click();
		
		WebElement chkFirst = driver.findElement(By.xpath("//label[@for='input-firstname']"));
		
		driver.findElement(with(By.tagName("input")).toRightOf(chkFirst)).sendKeys("sravs");
		
	WebElement chkLast = driver.findElement(By.xpath("//label[@for='input-lastname']"));
		
		driver.findElement(with(By.tagName("input")).toRightOf(chkLast)).sendKeys("poth");
		
		
		
		
		
		
			
	
			
			
			
			
}
		
}
