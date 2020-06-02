package pages;

import base.Page;

public class HomePage extends Page{
	
	
	public void goToSupport() {
		click("supportLink_XPATH");
	}

	public LoginPage goToLogin() {
		click("loginLink_XPATH");
		return new LoginPage();
	}

	public void goToSignUp() {
		click("signUpLink_XPATH");
	}

	public void goToCustomers() {
		click("customersLink_XPATH");
	}

	public void goToContactSales() {
		click("contactLink_XPATH");
	}

}
