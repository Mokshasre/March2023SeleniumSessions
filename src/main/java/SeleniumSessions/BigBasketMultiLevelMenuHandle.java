package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);

//		WebElement level1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
//
//		Actions act = new Actions(driver);
//		act.moveToElement(level1).build().perform();
//
//		Thread.sleep(1500);
//
//		WebElement level2 = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(level2).build().perform();
//
//		Thread.sleep(1500);
//
//		WebElement level3 = driver.findElement(By.linkText("Tea"));
//		act.moveToElement(level3).build().perform();
//		Thread.sleep(1500);
//       driver.findElement(By.linkText("Green Tea")).click();
       
       
       By level1Locator = By.xpath("//a[@qa='categoryDD']");	
       multiLevelMenuHandling(level1Locator,"Beverages","Tea","Green Tea");
       //multiLevelMenuHandling(level1Locator,"Beauty & Hygiene","Skin Care","EyCare");
	}
	
	public static WebElement getElement(By locator)
	{
		
		return driver.findElement(locator);
	}
	
	//take the text of teh element and give me the webelement
	public static WebElement getLinkEleByText(String linkText)
	{
		return driver.findElement(By.linkText(linkText));
		
		
	}
	//below 2 methodsare method overloading example
	public static void multiLevelMenuHandling(By level1Locator,String level2,String level3,String level4) throws InterruptedException
	
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1Locator)).build().perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level3)).perform();
		Thread.sleep(1500);
		
		getLinkEleByText(level4).click();
		
		
	}
	
    public static void multiLevelMenuHandling(By level1Locator,String level2,String level3) throws InterruptedException
	
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1Locator)).build().perform();
		Thread.sleep(1500);
		act.moveToElement(getLinkEleByText(level2)).perform();
		Thread.sleep(1500);
          getLinkEleByText(level3).click();
			
	}

}
