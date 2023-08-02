package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/icc-cricket-world-cup-qualifier-warm-up-matches-2023-1379547/scotland-vs-west-indies-warm-up-1379558/full-scorecard");

		Thread.sleep(4000);
		
		System.out.println(getWckTakerName("Shai Hope"));
	 
		
		ArrayList<String> getScoreList = getWckTakerRunsList("Johnson Charles");
		
	System.out.println(getScoreList);
	for(int i=0; i<getScoreList.size(); i++)
	{
		System.out.println(getScoreList.get(i));
		if(getScoreList.get(i).equals("30"))
		{
		
			System.out.println("PASS");
			break;
		}
		
	}
	

//		List<WebElement> cricList = driver
//				.findElements(By.xpath("//span[text()='Johnson Charles']/ancestor::td/following-sibling::td"));
        //Shai Hope ,
		//System.out.println(cricList.size());
		
		
		
		//span[text()='Johnson Charles']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]
		

//		for (WebElement e : cricList) {
//			String criText = e.getText();
//			System.out.println(criText);
//		}

	}
	
	public static String getWckTakerName(String batsmanName) {
		
		
		return driver
	.findElement(By.xpath("//span[text()='"+ batsmanName +"']/ancestor::td/following-sibling::td[contains(@class,'!ds-pl-[100px]')]"))
	.getText();
		
	}
	
	public static ArrayList<String> getWckTakerRunsList(String batsmanName)
	{
		ArrayList<String> scoreList = new ArrayList<String>();
		
		List<WebElement> cricList = driver
				.findElements(By.xpath("//span[text()='"+ batsmanName +"']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]"));
		//int i = 0;
		System.out.println("size of scorecard of " + batsmanName +  " is " +  cricList.size());
		for(WebElement e :cricList)
		{
		
		  String criText = e.getText();
		  //System.out.println(criText);
		  
		  if(!criText.isEmpty())
		  {
			scoreList.add(criText);
		  }
		}
		
		return scoreList;

	}
	
}

