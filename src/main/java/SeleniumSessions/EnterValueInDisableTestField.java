package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueInDisableTestField {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/09/");
		//driver.findElement(By.id("pass")).sendKeys("test@123");//element not interactable
		
		boolean flag = driver.findElement(By.id("pass")).isEnabled();
		System.out.println(flag);
		
		boolean flag1 = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(flag1);
		
		String disableVal = driver.findElement(By.id("pass")).getAttribute("disabled");
		System.out.println(disableVal);
	
		
		

	}
	
	public static boolean checkElementIsDisabled(By locator)
	{
		
		String disabledValue = getElement(locator).getAttribute("disabled");//since disabled property is same in the DOm html code so w r writing 
	     if(disabledValue.equals("true"))
	     {
	    	 return true;
	     }
	     return false;
	
	
	}
	
	
	
	
	public  static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		}

}
