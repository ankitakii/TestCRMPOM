package com.butler.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.butler.qa.base.TestBase;

public class Homepage extends TestBase {


	@FindBy(xpath="//div[@class='header item']")
	WebElement HomePageLogo;

	@FindBy(className="user-display")
	WebElement user;

	@FindBy(xpath="//i[@class='calendar icon']")
	WebElement calender;

	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contacts;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public Boolean validateHomePageLogo(){
		return HomePageLogo.isDisplayed();
	}

	public Boolean validateUser() {
		return user.isDisplayed();
	}

    public CalenderPage openCalender() throws InterruptedException {
    	calender.click();
    	Thread.sleep(3000);
    	return new CalenderPage();
    }

    public ContactPage openContact() throws InterruptedException {
    	contacts.click();
    	Thread.sleep(3000);
    	return new ContactPage();
    }

}
