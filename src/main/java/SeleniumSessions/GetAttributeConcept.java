package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By forgotPwd = By.linkText("Forgotten Password");
		
		By firstName = By.id("input-firstname");
		
		By logoImage = By.className("img-responsive");
		
//		String forgotpwd_href = driver.findElement(forgotPwd).getAttribute("href");
//		//String fn_placeholdr_val  = driver.findElement(firstName).getAttribute("placeholder");
//		
//		WebElement logo_ele = driver.findElement(logoImage);
//		String srcVal = logo_ele.getAttribute("src");
//		String titleVal = logo_ele.getAttribute("title");
//		String altVal = logo_ele.getAttribute("alt");
//		
//		System.out.println(srcVal);
//		System.out.println(titleVal);
//		System.out.println(altVal);
		
		//System.out.println(forgotpwd_href);
		//System.out.println(fn_placeholdr_val);
		String srcVal = getElementAttribute(logoImage,"src");
		System.out.println(srcVal);
		getElementAttribute(logoImage,"title");
		getElementAttribute(logoImage,"alt");
		getElementAttribute(firstName,"placeholder");
		String hrefVal = getElementAttribute(forgotPwd,"href");	
		System.out.println(hrefVal);

	}
	
	public static String getElementAttribute(By locator,String attrName)
	{
		return getElement(locator).getAttribute(attrName);
		//System.out.println(attrName);
	
	}
	
	public static WebElement getElement(By locator)
	{
		
		return driver.findElement(locator);
	}
	
	

}
