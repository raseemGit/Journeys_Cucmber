package org.pageobject;

import java.util.List;

import org.journeys.java.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ProdDescripPage extends Base {
	public ProdDescripPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "detailSizesList")
	private WebElement shoeSize;

	public WebElement getShoeSize() {
		return shoeSize;
	}

	@FindBy(id = "btnAddToBag")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}

	@FindBy(xpath = "//span[@class='icon-bag']")
	private WebElement prodBag;

	public WebElement getProdBag() {
		return prodBag;
	}

	@FindBy(xpath = "//a[text()='Checkout']")
	private WebElement toCheckOut;

	public WebElement getToCheckOut() {
		return toCheckOut;
	}

}
