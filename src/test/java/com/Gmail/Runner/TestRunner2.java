package com.Gmail.Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".\\src\\test\\java\\com\\Gmail\\Users\\Features\\Login2.feature", glue = "com.Gmail.Users.StepDef", plugin = {
		"pretty", "html:Reports/cucumber-reports.html" })

public class TestRunner2 extends AbstractTestNGCucumberTests {

}
