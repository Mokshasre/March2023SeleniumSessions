package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil bU = new  BrowserUtil();
		WebDriver driver = bU.launchBrowser("chrome");
		bU.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(bU.getPageTitle());
		
		By first_id = By.id("input-firstname");
		By last_id = By.id("input-lastname");
		By email_id = By.id("input-email");
		By phone_id = By.id("input-telephone");
		By pass_id = By.id("input-password");
	    By cPass_id = By.id("input-confirm");
	    
	    ElementUtil eleU = new ElementUtil(driver);
	    eleU.doSendKeys(first_id, "sravs");
	    eleU.doSendKeys(last_id,"poth");
	    eleU.doSendKeys(email_id, "sravs@gmail.com");
	    eleU.doSendKeys(phone_id, "987653333");
	    eleU.doSendKeys(pass_id, "sravs123");
	    eleU.doSendKeys(cPass_id, "sravs123");
	    
	    driver.findElement(By.name("agree")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	    
		
		
		
		
		
		
		
		

	}

}
