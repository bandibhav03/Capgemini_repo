package com.Gmail.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\src\\test\\java\\com\\Gmail\\Users\\Features\\Login2.feature",
		glue = "com.Gmail.Users.StepDef"
//				plugin = {"pretty", "json:target/cucumber-report.json","junit:target/cucumber-report.xml"}
		)

public class TestRunner 
{
	
}
