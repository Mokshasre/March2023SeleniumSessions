package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browserName = "chrome";// in future we can pass thrgh properties file
		BrowserUtil brUtil = new BrowserUtil();
		// default value of driver is null
		// brUtil.driver = new ChromeDriver();
		// brUtil.driver.get("https://www.google.com");
		
		//http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html
		brUtil.launchBrowser(browserName);
		brUtil.enterUrl("https://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);
		if (actTitle.contains("Amazon")) {

			System.out.println("correct title");
		} else {
			System.out.println("In-correct title");
		}

		String actUrl = brUtil.getPageURL();
		System.out.println(actUrl);
		if (actTitle.contains("Amazon")) {

			System.out.println("correct Url");
		} else {
			System.out.println("In-correct Url");
		}

		brUtil.quitBrowser();
	}

}
