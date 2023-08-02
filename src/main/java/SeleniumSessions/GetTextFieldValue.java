package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	
		By firstName = By.id("input-firstname");
		
		driver.findElement(firstName).sendKeys("testautomation");
		//this will give teh output of value entered in textbox
		String fn_val = driver.findElement(firstName).getAttribute("value");
		System.out.println(fn_val);

}
}
