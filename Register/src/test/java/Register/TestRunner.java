package test.java.Register;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "src/test/resources/Register" }, glue = { "test/java/Register" }, plugin = {"pretty"}) 
	public class TestRunner {

	}

