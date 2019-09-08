package org.stepdefinition;

import java.io.IOException;

import org.journeys.java.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base{
	
	
	@Before
	public void User_Should_LaunchBrowser_And_NavigateTo_Page() throws IOException {
		
		launchChromeDriver();
		loadUrl("https://www.journeys.com/");
	}
	
	@After
	public void User_Close_The_Browser() {
		
		quitBrowser();

	}
	

}
