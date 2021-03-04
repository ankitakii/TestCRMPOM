package com.butler.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.butler.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory or OR
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn ;
	
	@FindBy(xpath="//a[@href='https://api.cogmento.com/register']")
	WebElement SignUp;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo ;		
	
	
	
	//Initialize the Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public Homepage login(String uname, String pwd) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(3000);
		return new Homepage();
		
	}
	
}
