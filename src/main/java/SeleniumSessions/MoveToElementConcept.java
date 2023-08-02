package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		 
		 driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		 
		 Thread.sleep(3000);
		 
		// WebElement parentMenu = driver.findElement(By.className("menulink"));
		 
		 By parentMenu = By.className("menulink");
		By childMenu = By.linkText("COURSES");
		 //By childMenu = By.linkText("ARTICLES");
		 
		 //movetoelement to the parentmenu webelement
		 
		 //Actions class which is in selenium , same above webdriver we need to pass 
		 //when using...build method will collect 
		 
		 //Actions act = new Actions(driver);
		 // act.moveToElement(parentMenu).build();//it wont work
		 //act.moveToElement(parentMenu).perform();//it will work
		// act.moveToElement(parentMenu).build().perform();
		 //Thread.sleep(1500);
		 
		//driver.findElement(By.linkText("COURSES")).click();
		
		//driver.findElement(By.xpath("//a[text()='Courses']")).click();
		//driver.findElement(By.xpath("//ul[@class='submenu']//a[text()='Courses']")).click();
		 
		 
		 twoLevelMenuHandling(parentMenu,childMenu);

	}
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}

	public static void twoLevelMenuHandling(By level1MenuLocator,By level2MenuLocator) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(level1MenuLocator)).build().perform();
		Thread.sleep(1500);
		
		doClick(level2MenuLocator);
		
		
	}

}
