package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		 
		 
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 

		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
//		act
//		.clickAndHold(sourceEle)
//		.moveToElement(targetEle)
//		.release().build().perform();
		
		//draganddrop only from element to element
		act.dragAndDrop(sourceEle, targetEle).perform();
		
		
		 

	}

}
