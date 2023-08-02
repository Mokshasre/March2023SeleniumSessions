package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open any url
		//get the count of links on page html tag = a
		//print teh text of each link on console
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		By links = By.tagName("a");
		List<WebElement> linksList = driver.findElements(links);//LIst is parent interface of ArrayList
		
		int linksCount = linksList.size();
		System.out.println("Total links =  " + linksCount);

		
		//INdex webbased loop
		
//		for(int i =0 ; i < linksCount; i++ )
//		{
//			String text = linksList.get(i).getText();
//			if(!text.isEmpty())
//			{
//				System.out.println( i + " : " + text);
//				
//			}
//			
//		}
		
		//for each loop
//		int count = 0;
//		for(WebElement e :linksList)
//		{
//			String text = e.getText();
//		
//		if(!text.isEmpty())
//			{
//				
//				System.out.println( count  + " : " + text);
//				
//			}
//		count++;
//		
//		}
		//getting href value -Assignment
		int count = 0;
		for(WebElement e :linksList)
		{
			
		  String hrefVal = e.getAttribute("href");
		  if(hrefVal != null)
	           System.out.println(count + " : " + hrefVal);
		  
		count++;
		
		}
	
		

	}

}
