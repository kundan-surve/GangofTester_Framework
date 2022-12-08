package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass{
	
	
	// test cases Steps
	@Test
	public void verify_loginpage() {
		
		// elment --> emaiid,password,login
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_Sendkeys(login.getTxt_email(), excel.getStringData_Excel("Login", 0, 0));
		Library.custom_Sendkeys(login.getTxt_password(), excel.getStringData_Excel("Login", 0, 1));
		Library.custom_click(login.getBtn_login());
		
		
	}

}
