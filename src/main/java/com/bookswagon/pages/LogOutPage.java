package com.bookswagon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.base.BaseClass;

public class LogOutPage extends BaseClass {
	
	@FindBy(xpath = "//a[@class=\"cart-pop1\"]")
	WebElement accountLabel;
	
	@FindBy(id = "ctl00_lnkbtnLogout")
	WebElement logOutLable;
	
	public LogOutPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public void logOut() {
		accountLabel.click();
		logOutLable.click();		
	}
}
