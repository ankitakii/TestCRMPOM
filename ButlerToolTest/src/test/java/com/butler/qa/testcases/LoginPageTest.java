package com.butler.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.butler.qa.base.TestBase;
import com.butler.qa.pages.Homepage;
import com.butler.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage login;
	Homepage homePage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
	}
	
	@Test (priority=1)
	public void loginPageTitleTest() {
		String title = login.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test (enabled=false)
	public void validateCRMimageTest() {
		boolean flag = login.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@Test (priority=3)
	public void loginTest() throws InterruptedException {
		homePage = login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
}
