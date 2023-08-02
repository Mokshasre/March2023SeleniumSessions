package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledbutton {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			

			driver = new ChromeDriver();

			driver.get("https://omayo.blogspot.com/");
			//driver.findElement(By.id("pass")).sendKeys("test@123");//element not interactable
			
			By disaButton = By.id("but1");
			//boolean flag = driver.findElement(By.id("but1")).isEnabled();
			//System.out.println(flag);
			
			boolean diBut = checkElementIsDisabled(disaButton);
			System.out.println(diBut);
			if(diBut == true)
			{
				System.out.println("clicking on disabled button");
				getElement(disaButton).click();
				
			}
			 
				
				

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
