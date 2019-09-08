package org.pageobject;

import org.journeys.java.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Base {
	public PaymentPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "ShipFirstName")
	private WebElement frstName;

	public WebElement getFrstName() {
		return frstName;
	}

	@FindBy(id = "ShipLastName")
	private WebElement lastName;

	public WebElement getlastName() {
		return lastName;
	}

	@FindBy(id = "ShipAddress")
	private WebElement address;

	public WebElement getaddress() {
		return address;
	}

	@FindBy(id = "ShipCity")
	private WebElement city;

	public WebElement getcity() {
		return city;
	}

	@FindBy(id = "ShipStateOrProvince")
	private WebElement state;

	public WebElement getstate() {
		return state;
	}

	@FindBy(id = "ShipPostalCode")
	private WebElement zipCode;

	public WebElement getzipCode() {
		return zipCode;
	}

	@FindBy(id = "ShipPhone")
	private WebElement phone;

	public WebElement getphone() {
		return phone;
	}

	@FindBy(id = "ShipEmail")
	private WebElement email;

	public WebElement getemail() {
		return email;
	}

	@FindBy(id = "CardType")
	private WebElement card;

	public WebElement getcard() {
		return card;
	}

	@FindBy(id = "CardNumber")
	private WebElement CardNumber;

	public WebElement getCardNumber() {
		return CardNumber;
	}

	@FindBy(id = "CardMonth")
	private WebElement mnth;

	public WebElement getmnth() {
		return mnth;
	}

	@FindBy(id = "CardYear")
	private WebElement year;

	public WebElement getyear() {
		return year;
	}

	@FindBy(id = "CardCVV")
	private WebElement CardCVV;

	public WebElement getCardCVV() {
		return CardCVV;
	}

	@FindBy(xpath = "//button[text()='Continue Checkout']")
	private WebElement payment;

	public WebElement getPayment() {
		return payment;
	}

}
