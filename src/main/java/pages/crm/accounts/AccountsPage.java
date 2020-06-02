package pages.crm.accounts;

import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Page;

public class AccountsPage extends Page{
	public CreateAccountPage goToCreateAccount() {
		waitUntilClickable("createAccountBTN_XPATH");
		return new CreateAccountPage();
	}
	public void goToImportAccount() {
		
	}
}
