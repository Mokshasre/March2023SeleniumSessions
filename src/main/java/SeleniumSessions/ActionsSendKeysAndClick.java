package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
//		
//		WebElement emailEle = driver.findElement(By.id("input-email"));
//		WebElement passEle = driver.findElement(By.id("input-password"));
//		
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
//				
//				Actions act = new Actions(driver);
//				act.sendKeys(emailEle, "test@gmail.com").perform();
//				act.sendKeys(passEle, "test@123").perform();
//				act.click(loginBtn).perform();
//		
//				
////				Equivalent to calling: Actions.click(element).sendKeys(keysToSend).
////				This method is different from WebElement.sendKeys(CharSequence) - see sendKeys(CharSequence) 
				
				

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator)
	{
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
		
	}
	
	public static void doActionsSendKeys(By locator,String value)
	{
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
		
	}

}
