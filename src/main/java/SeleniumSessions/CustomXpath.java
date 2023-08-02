package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//htmltah[@attr='value']
		
		//driver.get("https://www.https://app.hubspot.com/login")
		By.xpath("//input[@class='form-control private-form__control login-email']");//valid
		By.className("login-email");//valid
		By.className("form-control private-form__control login-email"); //invalid
		//compund classnames are not permitted
		
		By.xpath("//input[contains(@class,'login-email')");//valid
		By.xpath("//input[@class='login-email']");//notvalid
		//input[contains(@class,'login-email')]
		//contains function
	//------------//htmltag[contains(@attr,'value')]
		//input[contains(@data-test-id,'email-input')]
		//input[contains(@data-test-id,'field')]
		//input[contains(@class,'login-email')]
		
		//-----contains with @attr1 and @attr2 without contains
		
		
		//htmltag[contains(@attr1,value)and @attr2='value')
		
		//ex - //input[contains(@data-test-id,'email-input')and@type='email']
		
		//-ex 2 -//input[@type='email' and contains(@data-test-id,'email-input')]
		
		// 3 //input[@type='email' and contains(@data-test-id,'email-input') and @id='username']
		
		
		//----text() function
		
		//htmltag[text()='value']
		//span[text()='Trusted by 60,000+ businesses of all sizes']
		
		//contains with text() function
		
		//htmltag[contains(text(),value)] //freshworks.com
		//span[contains(text(),'Trusted by 60,000+')]

		// -text with attri
		
		//htmltag[text() ='value' and @atrrr ='value']
		
		
		//a[text()='Login'and @class='list-group-item']
		//text withcontains and attr with contains and attr3
		
		//---c . ex -//a[contains(text(),'Address')and contains(@href,'account/address') and @class='list-group-item']
		
		//--index/position in xpath
		
		//---------By.xpath("(//input[@class='form-control'])[1]"); 
		// -----captcha group ----(//input[@class='form-control'])[position() =1])
		
		//(//input[@class='form-control'])[last()] or 
		
		 //By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]");
		
		// ----parent child relationship
		
		// for direct Association //select[@id='Form_getForm_Country']/option
		
		//direct +indirect child below elements
		////div[@class='footer-main']//a
		
		
	//-------	child to immediate parent -backward traversing by forward slash ..
		
		//form//input[@id='username']/../../../../../../../../../../../../../../../../../ [ Inter queation backward traversing]
		
		//By using keyword - for immediate parent in backward travelling
		//form//input[@id='username']/parent::div
		//below for grandparent and form is GrandPar name
		//form//input[@id='username']/ancestor::form
		
		//option[contains(text(),'Country')]/parent::select
		//option[contains(text(),'Country')]/ancestor::div
		//----------backward travelling from ancestor form to immediate parent and then to div
		//option[contains(text(),'Country')]/ancestor::form/parent::div/..
		
		//1.path 
		//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		
		
		
	}

}
