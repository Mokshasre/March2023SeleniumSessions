package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //childclass  object can be referred by grandparent interface
		//valid topcasting but not recommened
		//SearchContext sc = new ChromeDriver();
		//sc.only 2 methods are ther
		//2. valid and recommeneded -- local execution
		//WebDriver driver = new ChromeDriver();
		//driver.get ..all methods implemented in remote webdriver are used here 
		
		//3.topcasting betn Chrome -- local execution 
		//refrence type checked is passed and recommeneded
		//RemoteWebDriver driver = new ChromeDriver();
		//driver.fi
		
		//4.valid for chrome/edge only
		//ChromiumDriver driver = new ChromeDriver();
		
		//5.childclass object by parent interface varaible
		//used for selenoum grid/remote execution/cloud docker- valid and recommeneded
		//WebDriver driver =  new RemoteWebDriver(remoteAddress,capabilities);
		
		//6.
		//SearchContext sc = new RemoteWebDriver(remoteAddress,capabilities);
		
		
		
	}

}
