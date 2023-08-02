package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver; // creating this since we can all in beyond the main method for generic methods 
//we can call with static ...directly
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("naveen@gmail.com");

		// 2.no need to create the webelement again we can use the emailID
//		 WebElement emailID = driver.findElement(By.id("input-email"));
//		 WebElement Password = driver.findElement(By.id("input-password"));
//		 
//		 emailID.sendKeys("naveen@gmail.com");
//		 Password.sendKeys("naveen@gmail.com");

		// 3. By Locator

		// maintain the by locator

//		By email_id = By.id("input-email");
//		By pass_id = By.id("input-password");
//		WebElement emailID = driver.findElement(email_id);
//		WebElement password = driver.findElement(pass_id);
//
//		emailID.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@gmail.com");
		
		//4.BY Locator with webelement generic method 
//		By email_id = By.id("input-email");
//		By pass_id = By.id("input-password");
//		
//		
//		getElement(email_id).sendKeys("naveen@gmail.com");
//		getElement(pass_id).sendKeys("naveen@123");
		
		//5.why dont we create the BY locator with web element and action generic method
//		By email_id = By.id("input-email");
//		By pass_id = By.id("input-password");
//		
//		doSendKeys(email_id,"naveen@gmail.com");
//		doSendKeys(pass_id,"naveen@123");
		
		//6.BY locator with web element and action generic methods in ElementUtil class 
		
		By email_id = By.id("input-email");
	By pass_id = By.id("input-password");
	ElementUtil eleUtil = new ElementUtil(driver);
	eleUtil.doSendKeys(email_id, "naveen@gmail.com");
	eleUtil.doSendKeys(pass_id, "naveen@123");
	
	
	//7.By locator with webelement  and action generic  method in utility class
	//with a test /called class with brutil and eleutil
	
	
}
	
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
		
	}
	//static since we can call directly //you give me the by locator i will give the webelement for you
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		}

}
