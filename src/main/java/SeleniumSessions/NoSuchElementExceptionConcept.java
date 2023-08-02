package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {

	static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			driver = new ChromeDriver();

			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			By forgotPwd = By.linkText("Forgotten Password11");
			//driver.findElement(forgotPwd).click();//no such element: Unable to locate element when By locator is wrong
			
			try {
				
				driver.findElement(forgotPwd).click();
			}catch(NoSuchElementException e)
			{
				System.out.println("getting element exception...plz check your locator ");
				e.printStackTrace();
				
			}
			System.out.println(driver.getTitle());
			

	}

}
