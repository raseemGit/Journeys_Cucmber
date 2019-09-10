package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "org.stepdefinition", plugin = { "json:target/cucumber.json",
		"rerun:src/test/resources/Features/failedCases.txt" })

public class TestRunner {

}
