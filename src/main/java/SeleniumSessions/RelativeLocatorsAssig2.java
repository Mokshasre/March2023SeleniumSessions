package SeleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorsAssig2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);

		WebElement baseEle = driver.findElement(By.xpath("//a[text()='Joe.Root']"));

		// right of ele:

		// driver.findElement(with(By.tagName("p")).toRightOf(ele))

		List<WebElement> rightElements = driver.findElements(with(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td")).toRightOf(baseEle));

		System.out.println(rightElements.size());
		 for(WebElement e : rightElements) {
		System.out.println(e.getText());

	}
}
}
