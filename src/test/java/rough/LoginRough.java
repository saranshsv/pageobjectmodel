package rough;

import base.Page;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;

public class LoginRough {

	public static void main(String[] args) {
		
		
		HomePage home=new HomePage();
		LoginPage login=home.goToLogin();
		ZohoAppPage zohoApp=login.doLogin("saranshsv@gmail.com", "CeLciusZOHO93");
	
		zohoApp.goToCRM();
		AccountsPage accounts = Page.menu.goToAccounts();
		CreateAccountPage createAccount = accounts.goToCreateAccount();
		createAccount.createAccount("Ashish Bisht");
	}

}
