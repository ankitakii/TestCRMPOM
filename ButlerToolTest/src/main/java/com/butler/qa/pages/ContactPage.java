package com.butler.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.butler.qa.base.TestBase;

public class ContactPage extends TestBase {

	Actions action;
	
	
	@FindBy(linkText="Ankit Prasad")
	WebElement contactLabel;
	
	@FindBy(xpath="//th[text()='Address']")
	WebElement moveelement;

	@FindBy(xpath="(//button[contains(@class,'ui mini')])[2]")
	WebElement createcontact;

	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}


	public boolean verifyContactLabel() throws InterruptedException {
		Thread.sleep(2000);
		return contactLabel.isDisplayed();	
	}
	
	public void clickOnNewContact() throws InterruptedException {
		Thread.sleep(2000);
		createcontact.click();	
	}
	
}
