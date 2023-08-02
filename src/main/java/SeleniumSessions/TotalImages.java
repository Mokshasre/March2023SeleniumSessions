package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		By images = By.tagName("img");
List<WebElement> imagesList = driver.findElements(images);//LIst is parent interface of ArrayList
		
		int imgCount = imagesList.size();
		System.out.println("Total images =  " + imgCount);
		
		for(WebElement e :imagesList)
		{
		    String srcVal = e.getAttribute("src");
		    String altVal = e.getAttribute("alt");
		    System.out.println(srcVal + " : " + altVal);
		}
		
		  
		}
		  
}
