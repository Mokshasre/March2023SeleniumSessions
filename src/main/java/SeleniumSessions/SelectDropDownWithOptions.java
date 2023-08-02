package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		
		// htmltag = select
	   By country = By.id("Form_getForm_Country");
	   //below mthod call gives us the list of strings
	   if(getDropDownTextList(country).contains("India")) {
			System.out.println("PASS");
		}
	   
	   List<String> expCountryOptionList = Arrays.asList("india","Brazil","Aruba");
	   if(getDropDownTextList(country).containsAll(expCountryOptionList))
	   {
		   System.out.println(expCountryOptionList + " is available");
	   }

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	//count of teh DD
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropDownTextList(By locator) {

		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();
		// Create blank ArrayList
		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);

		}
		
		return optionsTextList;
	}

}
