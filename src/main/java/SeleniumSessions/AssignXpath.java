package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXpath {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		//((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()] -- for Help text at last
		//((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]--//Amazon services in amazon
		//(//div[@class='navFooterLinkCol navAccessibility']/div)[position()=1] --Get to know us under footer in amazon
		
		//((//div[@class='navFooterLinkCol navAccessibility'])[1]//a)[position()=1] = In Amazon for first value as careers
		
		//((//div[@class='navFooterLinkCol navAccessibility'])[1]//a)[last()] = in Amazon last value as Amazon service
		
		//WebElement careersLink = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[1]//a)[position()=1]"));
		WebElement AmazonSciLink = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[1]//a)[last()]"));
		
		String amzText = AmazonSciLink.getText();
		System.out.println(amzText);
		
		if(amzText.equals("Amazon Science"))
		{
			System.out.println("Yes its Correct");
		}
		
		
		
	}

}
