package com.butler.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.butler.qa.base.TestBase;
import com.butler.qa.pages.ContactPage;
import com.butler.qa.pages.Homepage;
import com.butler.qa.pages.LoginPage;

public class ContactPageTest extends TestBase {


	LoginPage login;
	Homepage homepage;
	ContactPage ContactPage;

	public ContactPageTest() {
		super();
	}


	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
		login = new LoginPage();
		ContactPage = new ContactPage();
		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));
		ContactPage = homepage.openContact();
	}

	@Test(enabled=false)
	public void validateContactLabel() throws InterruptedException {
		ContactPage.verifyContactLabel();
	}
	@Test(priority=2)
	public void createnewcontact() throws InterruptedException {
		ContactPage.clickOnNewContact();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
