package com.bookswagon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookswagon.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(id = "ctl00_licategory")
	 WebElement Books;
	
	@FindBy(linkText = "Show All Categories")
	WebElement allcat;
	
	@FindBy(id = "ctl00_linewrelease")
	WebElement newArrivals;
	
	@FindBy(id = "ctl00_lipreorder")
	WebElement preOrder;
	
	@FindBy(id = "ctl00_libestseller")
	WebElement bestSeller;
	
	@FindBy(id = "ctl00_liTextBook")
	WebElement textBooks;
	
	@FindBy(id = "ctl00_liAW")
	WebElement awardWinners;
	
	@FindBy(id = "ctl00_liRequestBook")
	WebElement featuredAuthors;
	
	@FindBy(id = "ctl00_TopSearch1_txtSearch")
	WebElement searchBox;
	
	@FindBy(xpath = "//span[@class='cart-item-count']")
	WebElement cart;
	
	@FindBy(linkText = "Law")
	WebElement law;
	
	@FindBy(id = "ctl00_lihome")
	WebElement home;
	
	@FindBy(linkText = "Power to the Public")
	WebElement bookName;
	
	@FindBy(id = "ctl00_phBody_ProductDetail_divAddtoCart")
	WebElement buyNow;
	
	@FindBy(id = "cboxClose")
	WebElement cartCloseBtn;
	
	@FindBy(id = "ctl00_TopSearch1_Button1")
	WebElement searchButton;
	
	@FindBy(name = "BookCart$lvCart$ctrl0$txtQty")
	WebElement cartValue;
	
	@FindBy(id = "BookCart_lvCart_ctrl0_imgUpdate")
	WebElement cartUpdate;
	
	@FindBy(xpath = "//input[@id='BookCart_lvCart_imgPayment']")
	WebElement placeOrder;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNewArrivals() {
		newArrivals.click();	
	}
	
	public void verifyPreOrder() {
		preOrder.click();
	}
	
	public void verifyBooks() {
		Actions action = new Actions(driver);
		action.moveToElement(Books).perform();	
		
	}
	
	public void verifyBestSeller() {
		bestSeller.click();
	}
	
	public void verifytextBooks() {
		textBooks.click();
	}
	
	public void verifyAwardWinners() {
		awardWinners.click();
	}
	
	public void verifyFeaturedAuthors() {
		featuredAuthors.click();
	}
	
	public void verifyShowAllCart() {
		allcat.click();
	}
	
	public void VerifysearchBox() throws InterruptedException {
		searchBox.click();
		searchBox.sendKeys("Quick Start to using Essential Oils");
		searchButton.click();
	}
	
	public void VerifyCart() {
		cart.click();
		cartCloseBtn.click();
	}
	
	public void verifyLaw(){
		law.click();
		bookName.click();
		buyNow.click();
	}
	
	
	  public void verifyPlaceorder() throws InterruptedException { 
		  driver.get("https://www.bookswagon.com/shoppingcart.aspx?&pid=32715649&vid=244&ptype=1");
		  cartValue.clear();
		  cartValue.sendKeys("3");
		  cartUpdate.click();
		  Thread.sleep(2000);
		  placeOrder.click(); 
		  Thread.sleep(20000);
	  }
	 
	
	public void verifyHome() {
		home.click();
	}
}
