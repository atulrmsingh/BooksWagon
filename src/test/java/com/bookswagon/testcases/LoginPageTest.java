package com.bookswagon.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookswagon.base.BaseClass;
import com.bookswagon.pages.HomePage;
import com.bookswagon.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 4)
	public void checkLoginWithCorrectData() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void checkLoginWithValidEmailInvalidPassword() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("username"), "1234");
	}

	@Test(priority = 2)
	public void checkLoginWithInvalidEmailValidPassword() throws InterruptedException {
		homePage = loginPage.login("9919003775", "1234");
	}

	@Test(priority = 3)
	public void checkLoginWithInvalidData() throws InterruptedException {
		homePage = loginPage.login("9919003775", "1234");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
