package com.butler.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.butler.qa.base.TestBase;
import com.butler.qa.pages.CalenderPage;
import com.butler.qa.pages.ContactPage;
import com.butler.qa.pages.Homepage;
import com.butler.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	Homepage homepage;
	LoginPage login;
	ContactPage contactpage;
	CalenderPage calenderPage;


	public HomePageTest () {
		super();
	}	

	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		initialization();
		login = new LoginPage();
		contactpage = new ContactPage();
		calenderPage = new CalenderPage();
		homepage = login.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(enabled=false)
	public void HomePageLogoTest() throws InterruptedException {
		boolean flag = homepage.validateHomePageLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority=1)
	public void ValidateUserTest() {
		boolean flag = homepage.validateUser();
		Assert.assertTrue(flag);
	}	

	@Test(priority=2)
	public void OpenContactTest() throws InterruptedException {
		contactpage = homepage.openContact();
	}
	@Test(priority=3)
	public void OpenCalenderTest() throws InterruptedException {
		calenderPage = homepage.openCalender();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
}
