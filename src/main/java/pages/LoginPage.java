package pages;

import base.Page;

public class LoginPage extends Page{
	
	public ZohoAppPage doLogin(String username,String password) {
		type("email_XPATH",username);
		waitUntilClickable("loginUserBTN_XPATH");
		waitUntilVisible("password_XPATH",password);
		click("loginUserBTN_XPATH");
		return new ZohoAppPage();
	}
}
