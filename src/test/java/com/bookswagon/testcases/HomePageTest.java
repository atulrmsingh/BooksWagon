package com.bookswagon.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bookswagon.base.BaseClass;
import com.bookswagon.pages.HomePage;
import com.bookswagon.pages.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void verifyBooks() {
		homePage.verifyBooks();

	}

	@Test(priority = 3)
	public void verifyNewArrivals() {
		homePage.verifyNewArrivals();

	}

	@Test(priority = 4)
	public void verifyPreOrder() {
		homePage.verifyPreOrder();

	}

	@Test(priority = 2)
	public void verifyShowAllCat() {
		homePage.verifyShowAllCart();
	}

	@Test(priority = 5)
	public void verifyBestSeller() {
		homePage.verifyBestSeller();
	}

	@Test(priority = 6)
	public void verifytextBooks() {
		homePage.verifytextBooks();
	}

	@Test(priority = 7)
	public void verifyAwardWinners() {
		homePage.verifyAwardWinners();
	}

	@Test(priority = 8)
	public void verifyFeaturedAuthors() {
		homePage.verifyFeaturedAuthors();
	}

	@Test(priority = 9)
	public void VerifysearchBox() throws InterruptedException {
		homePage.VerifysearchBox();
	}

	@Test(priority = 10)
	public void VerifyCart() throws InterruptedException {
		homePage.VerifyCart();
	}

	@Test(priority = 11)
	public void verifyHome() {
		homePage.verifyHome();

	}

	@Test(priority = 12)
	public void verifyLaw() throws InterruptedException {
		homePage.verifyLaw();
	}
	
	
	  @Test(priority = 13)
	  public void verifyPlaceorder() throws InterruptedException {
	  homePage.verifyPlaceorder(); }
	 

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
