package pages.crm.accounts;

import base.Page;

public class CreateAccountPage extends Page{
	public void createAccount(String accountName) {
		type("accountName_XPATH",accountName);
	}
}
