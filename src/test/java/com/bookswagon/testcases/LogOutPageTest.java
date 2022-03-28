package com.bookswagon.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookswagon.base.BaseClass;
import com.bookswagon.pages.HomePage;
import com.bookswagon.pages.LogOutPage;
import com.bookswagon.pages.LoginPage;

public class LogOutPageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;
	LogOutPage logoutpage;

	public LogOutPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void logOut() throws InterruptedException, IOException {
		logoutpage = new LogOutPage();
		logoutpage.logOut();
		BaseClass.takeScreenshot();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
