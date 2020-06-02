package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.crm.accounts.AccountsPage;

public class TopMenu {
	WebDriver driver;
	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}
	
	public void goToHome() {
		driver.findElement(By.linkText("Home")).click();
	}

	public void goToLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	public void goToContacts() {
		driver.findElement(By.linkText("Contacts")).click();
	}

	public AccountsPage goToAccounts() {
		Page.waitUntilClickable("accountsTab_XPATH");
		return new AccountsPage();
	}

	public void goToDeals() {
		driver.findElement(By.linkText("Deals")).click();
	}

	public void goToActivities() {
		driver.findElement(By.linkText("Activities")).click();
	}

	public void goToReports() {
		driver.findElement(By.linkText("Reports")).click();
	}

	public void goToAnalytics() {
		driver.findElement(By.linkText("Analytics")).click();
	}
	public void goToProducts() {
		driver.findElement(By.linkText("Products")).click();
	}
	public void goToQuotes() {
		driver.findElement(By.linkText("Quotes")).click();
	}
	public void goToMarketplace() {
		driver.findElement(By.linkText("Marketplace")).click();
	}
	public void signOut() {
		driver.findElement(By.xpath("//div[@id='dropclk']")).click();
		driver.findElement(By.xpath("//a[@data-zcqa='signOut']")).click();
	}

}
