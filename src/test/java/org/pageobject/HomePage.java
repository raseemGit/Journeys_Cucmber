package org.pageobject;

import org.journeys.java.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@title='Close'])[2]")
	private WebElement popUpCloseElmnt;

	@FindBy(xpath = "//span[@class='icon-search']")
	private WebElement searchElmnt;
	
	@FindBy(xpath = "(//div[@class='product-info'])[3]")
	private WebElement selectShoe;

	@FindBy(id = "txtSiteSearchNav")
	private WebElement searchBarElmnt;

	public WebElement getPopUpCloseElmnt() {
		return popUpCloseElmnt;
	}
	
	

	public WebElement getSearchElmnt() {
		return searchElmnt;
	}

	public WebElement getSearchBarElmnt() {
		return searchBarElmnt;
	}
	
	public WebElement getSelectShoe() {
		return selectShoe;
	}
}