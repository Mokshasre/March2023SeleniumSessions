package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//drop down: <select> tag
		//Select Class
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		

		By country = By.id("Form_getForm_Country");
		WebElement country_ele = driver.findElement(country);
		
//		Select select = new Select(country_ele);
//		select.selectByIndex(5);
//		select.selectByVisibleText("India");
//		select.selectByValue("Armenia");
		doSelectDropDownByIndex(country, 5);
		doSelectDropDownByVisibleText(country, "Brazil");
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
	
		//check for index number
		if(index<0)
		{
			
			System.out.println("please pass the right (+ve) index");
			return;//we are writing these because need to comeout of it
		}
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String visibleText)
	{
		if(visibleText == null)
		{
			
			System.out.println("please pass the right visible text and it can not be null");
		}
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
		
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		if(value == null) {
			System.out.println("please pass the right visible text and it can not be null");
			return;
		}
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
