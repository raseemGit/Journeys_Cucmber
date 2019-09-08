package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.journeys.java.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pageobject.CheckOutPage;
import org.pageobject.HomePage;
import org.pageobject.PaymentPage;
import org.pageobject.ProdDescripPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base {
	static HomePage obj;
	static ProdDescripPage obj1;
	static CheckOutPage obj2;
	static PaymentPage obj3;
	

	@Given("User Should Enter The Product Name Nd Click Search")
	public void user_Should_Enter_The_Product_Name_Nd_Click_Search()
			throws InterruptedException, AWTException, IOException {
		
		implWait();
		max();
		obj = new HomePage();
		escape();
		toWait(2000);
		click(obj.getSearchElmnt());
		passValue(obj.getSearchBarElmnt(), giveData(1, 0));
		enter();
	}

	@Given("User Select The Particular Product")
	public void user_Select_The_Particular_Product() {
		click(obj.getSelectShoe());
	}

	@When("User Add A Product To Cart")
	public void user_Add_A_Product_To_Cart() throws InterruptedException, AWTException {
		obj1 = new ProdDescripPage();
		selectIndex(obj1.getShoeSize(), 4);
		click(obj1.getCheckOut());
		moveElm(obj1.getCheckOut());
		click(obj1.getToCheckOut());
	}

	@When("User Navigate To The Cart Page nd Confirm The Product")
	public void user_Navigate_To_The_Cart_Page_nd_Confirm_The_Product() {
		obj2 = new CheckOutPage();
		click(obj2.getToPayCheck());
	}

	@Then("User Purchase The Product")
	public void user_Purchase_The_Product() throws IOException {
		obj3 = new PaymentPage();
		passValue(obj3.getFrstName(), giveData(1, 1));
		passValue(obj3.getlastName(), giveData(1, 2));
		passValue(obj3.getaddress(), giveData(1, 3));
		passValue(obj3.getcity(), giveData(1, 4));
		selectIndex(obj3.getstate(), 9);
		passValue(obj3.getzipCode(), giveData(1, 5));
		passValue(obj3.getphone(), giveData(1, 6));
		passValue(obj3.getemail(), giveData(1, 7));
		selectIndex(obj3.getcard(), 2);
		passValue(obj3.getCardNumber(), giveData(1, 8));
		selectIndex(obj3.getmnth(), 7);
		selectIndex(obj3.getyear(), 3);
		passValue(obj3.getCardCVV(), giveData(1, 9));
		click(obj3.getPayment());
		

	}

}
