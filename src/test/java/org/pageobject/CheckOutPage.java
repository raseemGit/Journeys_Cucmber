package org.pageobject;

import org.journeys.java.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Base {
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lnkCheckout2")
	private WebElement toPayCheck;
	
	public WebElement getToPayCheck() {
		return toPayCheck;
	}

}
