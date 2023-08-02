package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		By contextMenuLocator = By.xpath("//span[text()='right click me']");

		// WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right
		// click me']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.contextClick(rightClickEle).perform();
//		
//		List<WebElement> optionsList = 
//				driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//		
//		
//		System.out.println(optionsList.size());
//		for(WebElement e : optionsList)
//		{
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Copy"))
//			{
//				e.click();
//				break;
//			}
//			
//		}
		// or //Span[text()= 'Copy'] -- AFter rightclick we can do these instead of
		// using the Iterative loop

		selectRightClickOption(contextMenuLocator, "Quit");

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void selectRightClickOption(By contextMenuLocator, String optionValue) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();// right click is done
		By optionLocator = By.xpath("//*[text()='" + optionValue + "']");// to click on options upon rightclick
		// In above * we used since its applicable for all tags
		getElement(optionLocator).click();
	}

}
