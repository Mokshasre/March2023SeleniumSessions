package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketAllLevelsMenuHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		
		
		WebElement mainCat = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		
		//(//div[@id='headlessui-menu-items-:r1:'])//ul[1]/li
		
		//WebElement mainCat = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:r0:']/div"));
	
				
		Actions act = new Actions(driver);
		act.moveToElement(mainCat).build().perform();
		System.out.println(mainCat.getText());
		
		 List<WebElement> mainCatlist = driver.findElements(By.xpath("(//div[contains(@id,'headlessui-menu-items-:r1:')])//ul[1]//a"));
		 
		 for(WebElement ed : mainCatlist) {
		       act.moveToElement(ed).build().perform();
		       System.out.println(ed.getText());
		      }
		
		
	
//		List<WebElement> level1List = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
//		 for(WebElement e1 : level1List) {
//		       act.moveToElement(e1).build().perform();
//		       System.out.println(e1.getText());
//		      }
//		//act.moveToElement(level1List).build().perform();
//		
//		
//		//Thread.sleep(1500);
//		
//		List<WebElement> level2List = driver.findElements(By.xpath("(//ul[contains(@class, 'nav-pills')])[2]//a"));
//		 for(WebElement e2 : level2List) {
//		       act.moveToElement(e2).build().perform();
//		       System.out.println(e2.getText());
//		      }
//		// Thread.sleep(1500);
//		List<WebElement> level3List = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]//a"));
//
//	      for(WebElement e3 : level3List) {
//	       act.moveToElement(e3).build().perform();
//	       System.out.println(e3.getText());
//	      }
		//div[@class='col-md-9 no-boxshadow desgn-fix']//div[@class='box']
		
		
		
		

	}

}
