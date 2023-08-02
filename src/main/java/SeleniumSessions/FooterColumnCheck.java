package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumnCheck {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(5000);
		
//		String footerHeaderText = driver.
//		findElement(By.xpath("//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
//		.getText();
		
		//----//a[text() ='Amazon Science']/ancestor::ul/parent::div/div - xpath like above other way of doing
		
		//-------//a[text() ='Amazon Science']/parent::li/parent::ul/parent::div/div --- xpath like above other way of doing
		
		//----------//a[text() ='Amazon Science']/ancestor::ul/preceding-sibling::div--- xpath like above other way of doing
		
		//---//a[text()='Joe.Root']/parent::td/following-sibling::td -- we will get 3 columns data of right side 
		
		System.out.println(getFooterHeaderTest("Careers"));
		System.out.println(getFooterHeaderTest("Amazon Visa"));
		System.out.println(getFooterHeaderTest("Become an Affiliate"));
		System.out.println(getFooterHeaderTest("Help"));

		//ohrmList_chkSelectRecord_21
		//https://selectorshub.com/xpath-practice-page/   for webtable
		
		//----//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']---- 	
		//--//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
	}
	//Generic method to get the Header for teh footer
	public static String getFooterHeaderTest(String footerText)
	{
		
		String footerHeaderText = driver.
		findElement(By.xpath("//a[text()='"+footerText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
		.getText();
		
		return footerHeaderText;
		
	}

}
