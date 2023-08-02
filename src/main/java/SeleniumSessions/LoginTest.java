package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//combine browserutil and elemtutil
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brUtil.getPageTitle());
		
		By email_id = By.id("input-email");
		By pass_id = By.id("input-password");
		
		ElementUtil eleUtil = new  ElementUtil(driver);
		
		eleUtil.doSendKeys(email_id, "naveen@gmail.com");
		eleUtil.doSendKeys(pass_id, "naveen@123");
		brUtil.quitBrowser();
		
	}

}
