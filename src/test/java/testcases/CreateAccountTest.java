package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import pages.ZohoAppPage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;
import utilities.Utilities;

public class CreateAccountTest {

	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		ZohoAppPage zohoApp = new ZohoAppPage();
		zohoApp.goToCRM();
		AccountsPage accounts = Page.menu.goToAccounts();
		CreateAccountPage createAccount = accounts.goToCreateAccount();
		createAccount.createAccount(data.get("accountname"));
		
	}
}
