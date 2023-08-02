package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksRegisterPage {

	static WebDriver driver; // creating this since we can all in beyond the main method for generic methods 
	//we can call with static ...directly
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			By allLinks = By.xpath("//div[@class='list-group']/parent::aside[@id='column-right']//a");
			
			clickOnElement(allLinks,"Newsletter");
			
			//List<WebElement> rightLinks = driver.findElements(allLinks);
			
			//System.out.println("total links rightside in page " + rightLinks.size());
			
			
		}
		
		public static void clickOnElement(By locator,String linkText)
		{
			List<WebElement> langLInks = driver.findElements(locator);
			System.out.println("total number of links " + langLInks.size());
			
			for(WebElement e : langLInks)
			{
				String text = e.getText();
				System.out.println(text);
				if(text.equals(linkText))
				{
					e.click();
					break;
				}
			}
			
			
		}

}
