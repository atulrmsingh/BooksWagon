package com.bookswagon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.base.BaseClass;


public class LoginPage extends BaseClass{
	@FindBy(linkText = "Login")
	WebElement Login;
	
	@FindBy(id="ctl00_phBody_SignIn_txtEmail")
	WebElement username;
	
	@FindBy(id="ctl00_phBody_SignIn_txtPassword")
	WebElement password;
	
	@FindBy(name="ctl00$phBody$SignIn$btnLogin")
	WebElement loginBtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException{
		Login.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);		    	
		return new HomePage();
	}
}
