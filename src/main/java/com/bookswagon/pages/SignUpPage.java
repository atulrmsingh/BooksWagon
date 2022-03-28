package com.bookswagon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.base.BaseClass;

public class SignUpPage extends BaseClass{
	
	@FindBy(xpath="")
	WebElement femaleRadioButton;
	
	@FindBy(name="websubmit")
	WebElement submitButton;
	
	public SignUpPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateSignUpPageTitle(){
		return driver.getTitle();
	}
	
	public LoginPage SignUp() throws InterruptedException{
		return null;
		
	}
}
