package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
  By langLinks = By.xpath("//div[@id='SIVCob']/a");
  clickOnElement(langLinks,"marati");
  	

	}
	
	//when there is bunch of links
	
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
