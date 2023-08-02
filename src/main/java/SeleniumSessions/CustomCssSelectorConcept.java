package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomCssSelectorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//input.form-control
		By.cssSelector("input.form-control");
		
		//#input-email)-----(#id)
		//input#input-email------(tag#id)
		
		//if more class names are ther .classname.classname.classname
		//.form-control.private-form__control.login-email
		//.form-control.login-email --- 2 classnames also can juse
		//sequence also we can change
		
		///.form-control.login-email
		
		//---------with Id and class
		 // ---#id.class
		//2.----- .class#id
		//3------tag#id.class
		//4....tag.class#id
		
		
		//----ex -#username.login-email
		//.login-email#username
		//.form-control.private-form__control.login-email#username
		
		//tag#id.classname.cn.cn
		 // ----input#username.form-control.private-form__control.login-email
		//---input.login-email#username.form-control.private-form__control
		
		// ex -input[type='text'][name='email'][placeholder='E-Mail Address']
		
		//--//*[@id] -- xpath how many ids are ther in page
		//----[id] ------CSs how mnay ids are ther 
		
		// -contains in CSS-----
		// input[placeholder*='Address']  -- like contains in CSS
		
		
		//input[contains(@placeholder,'Address')] ---- xpath
		//----^for starts with in CSS
		
		//input[placeholder^='E-Mail'] ---CSS
		//input[starts-with(@placeholder,'E-Mail')] ---- xpath
		
		//endswith in css
		
		//tag[attr$='value']
		//input[placeholder$='Address']
		
		
	}

}
