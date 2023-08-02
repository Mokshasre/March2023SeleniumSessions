package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By email_id = By.id("input-email");
		By pass_id = By.id("input-password");
		By chkbox = By.name("agree");
		By Conbtn = By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]");
		//driver.findElement(By.name("agree")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
		doSendKeys(email_id, "sravs@gmail.com");
		doSendKeys(pass_id, "sravs@1234");
		
		doClick(chkbox);
		doClick(Conbtn);
		
		//linktext
		//driver.findElement(By.linkText("Delivery Information")).click();
        By deliveryInfoLink = By.linkText("Delivery Information");
        doClick(deliveryInfoLink);
        //Partial link text is risky since if 2 links are there with same text it takes teh first element
        String header = driver.findElement(By.tagName("h1")).getText();
        System.out.println(header);
        
	}
	
	//generic method for click 
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	
	public static void doClick(By locator)
	{
		 getElement(locator).click();
		
	}
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
		
	}

}
