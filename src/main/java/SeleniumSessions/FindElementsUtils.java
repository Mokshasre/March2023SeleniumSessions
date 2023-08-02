package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtils {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By links = By.tagName("a");
		By images = By.tagName("img");
		int imgcount = getElementsCount(images);
		
		System.out.println("Images count are " + imgcount);
		
		int lincount = getElementsCount(links);
		
		System.out.println("links count are " + lincount);
		//List<WebElement> linkslist = driver.findElements(links); --no need of this line for all the BY locators just create method
		
		// no need now System.out.println(getElementsCount(links));
		//no need System.out.println(getElementsCount(images));
		
		//---------- for getting text of all links list-----------------
		ArrayList<String> actEleTextList = getElementsTextList(links);
		System.out.println(actEleTextList);
		if(actEleTextList.contains("Privacy Policy"))
		{
			System.out.println("Privacy Policy -- PASS");
		}
		
		//---------for href/src/alt values of all images ...........
		
//		ArrayList<String> actEleAttriList = getElementsAttributeList(images,"src");
//		//getElementsAttributeList(images,"src");
//		System.out.println(actEleAttriList);
//		System.out.println("done ..");
		
		
		
	}

	
	public static int getElementsCount(By locator)
	{
		
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator)
	{
		
		return driver.findElements(locator);
	}
	//get elements text 
	public static ArrayList<String> getElementsTextList(By locator)
	{
		
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();//pc=0
		
		for(WebElement e : eleList)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
				//we no need to print but we need to store in list of strings
				eleTextList.add(text);
			}
		}
		return eleTextList;//we r returning since we can do validate
	}
	
	//getAttributes  -- Assignment 
	public static ArrayList<String> getElementsAttributeList(By locator,String attriVal)
	{
		
		List<WebElement> eleimagesList = getElements(locator);
		ArrayList<String> attributeList = new ArrayList<String>();//pc=0
		
		for(WebElement e : eleimagesList)
		{
			String attValue = e.getAttribute(attriVal);
			if(!attValue.isEmpty())
			{
				//we no need to print but we need to store in list of strings
				attributeList.add(attValue); 
				//System.out.println(attvalue);
			}
		}
		return attributeList;//we r returning since we can do validate
	}

}
