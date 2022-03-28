package com.bookswagon.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookswagon.base.BaseClass;
import com.bookswagon.pages.LoginPage;
import com.bookswagon.pages.SignUpPage;
import com.bookswagon.util.TestUtil;


public class SignUpPageTest extends BaseClass{
	SignUpPage signupPage;
	LoginPage loginPage;
	
	public SignUpPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		signupPage = new SignUpPage();
	}
	
	
	@Test(priority=2)
	public void SignUpTest() throws InterruptedException, IOException{
		BaseClass.takeScreenshot();
	}
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
}
