package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.com");
		 
		 Actions act = new Actions(driver);
//		 act.sendKeys(Keys.PAGE_DOWN).perform();
//		 Thread.sleep(1000);
//		 act.sendKeys(Keys.PAGE_DOWN).perform();
//		 Thread.sleep(1000);
//		 act.sendKeys(Keys.PAGE_UP).perform();
		 
		 //Cntrol/CMD + Key Down
		 
//		 act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
//		 Thread.sleep(1000);
//		 
//		 //Cntrol/CMD + Key UP
//		 
//		 act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		 act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
		 Thread.sleep(1000);
		//Scroll to element
		 act.scrollToElement(driver.findElement(By.linkText("Help")))
		 .click(driver.findElement(By.linkText("Help"))).build().perform();
		 
		 //refresh --Command is ctrl
		//// act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		 //driver.navigate().refresh();
		
		
		

	}

}
