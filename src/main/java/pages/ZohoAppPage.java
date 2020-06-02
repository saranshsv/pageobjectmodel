package pages;

import base.Page;
import pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	
	public void goToBooks() {
		click("booksLink_linkText");
	}
	public void goToCalendar() {
		click("calendarLink_linkText");
	}
	public void goToCampaigns() {
		click("campaignsLink_linkText");
	}
	public void goToCliq() {
		click("cliqLink_linkText");
	}
	public void goToConnect() {
		click("connectLink_linkText");
	}
	public CRMHomePage goToCRM() {
		waitUntilClickable("crmLink_XPATH");
		return new CRMHomePage();
	}
	public void goToDesk() {
		click("deskLink_linkText");
	}
	public void goToInvoice() {
		click("invoiceLink_linkText");
	}
	public void goToMail() {
		click("mailLink_linkText");
	}
	public void goToSheet() {
		click("sheetLink_linkText");
	}
	public void goToShow() {
		click("showLink_linkText");
	}
	public void goToWorkDrive() {
		click("workdriveLink_linkText");
	}
	public void goToWriter() {
		click("writerLink_linkText");
	}
}
