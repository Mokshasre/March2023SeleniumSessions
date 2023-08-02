package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to(new URL("https://www.amazon.com"));
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println("actTitle : " + title);
		
		System.out.println(driver.getCurrentUrl());//url
		
		driver.quit();

		

	}

}
