package com.Gmail.Users.StepDef;

import org.openqa.selenium.WebDriver;

import com.Gmail.Users.Pages.UserInteraction3;
import com.Gmail.Users.config.Base;
import com.Gmail.Users.config.Reports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoLogin {

	Reports report;

	WebDriver driver = Hooks.driver;
	ExtentTest test = Hooks.test;
	UserInteraction3 demo;

//	@When("I navigate to login page")
//	public void i_navigate_to_login_page()
//	{
//		driver =  new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours");
//	}
//	
//	
//	@And("I entered {string} and {string}")
//	public void i_entered_and(String unm, String pwd) {
//		WebElement unm1 = driver.findElement(By.name("userName"));
//		  unm1.sendKeys(unm);
//		  
//		  WebElement pwd1 = driver.findElement(By.name("password"));
//		  pwd1.sendKeys(pwd);
//	}
//	
//	
//	@And("I clicked on signin button")
//	public void i_clicked_on_signin_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		WebElement subm = driver.findElement(By.name("submit"));
//		subm.click();
//	}
//	@Then("Successfully logged in")
//	public void successfully_logged_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//		WebElement ref = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//		  System.out.println(ref.getText());
//		  Assert.assertEquals(ref.getText(), "Login Successfully");
//	}
//	

//	@When("I navigate to login page")
//	public void i_navigate_for_page()
//	{
//		driver =  new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours");
//	}
//	
//	
//	@And("I entered {string} and {string}")
//	public void i_entered(String unm, String pwd) {
//		WebElement unm1 = driver.findElement(By.name("userName"));
//		  unm1.sendKeys(unm);
//		  
//		  WebElement pwd1 = driver.findElement(By.name("password"));
//		  pwd1.sendKeys(pwd);
//	}
//	
//	@And("I clicked signin button")
//	public void i_clicked_on_sign_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		WebElement subm = driver.findElement(By.name("submit"));
//		subm.click();
//	}
//	
//	@Then("Its navigated to the error msg")
//	public void errorr() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//		WebElement ref = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//		  System.out.println(ref.getText());
//		  Assert.assertEquals(ref.getText(), "Login Successfully");
//	}

//@Given("I navigate to login page")
//public void i_navigate_to_login_page() {
//	
//}
//
//@When("I entered following details")
//public void i_entered_following_details(DataTable dataTable){
//	List<List<String>> ele=dataTable.cells();
//	System.out.println(ele.get(0).get(0));
//	System.out.println(ele.get(0).get(1));
//	System.out.println(ele.get(1).get(0));
//	System.out.println(ele.get(1).get(1));
//	
////	driver.findElement(By.id("enail")).sendKeys(ele.get(1).get(1));
//}
//
//@When("I clicked signin button")
//public void i_clicked_signin_button(){
//	
//}
//
//@When("Its navigated to the home page")
//public void Its_navigated_to_the_home_page(){
//	
//}

//@Given("I navigate to Browser")
//public void i_navigate_to_browser() {
//	
//}

//@Given("I navigate {string}")
//public void i_navigate_to_url(String url) {

	@Given("I navigate to Browser")
	public void i_navigate_to_Browser() {
		driver = Base.driver; // or new ChromeDriver() if not using Base
		demo = new UserInteraction3(driver, test);
	}

	@Then("I navigate to {string}")
	public void i_navigate(String url) {
		driver.get(url);
	}

	@When("I insert {string} and {string}")
	public void I_Insert_userName(String un, String pwrd) {
		demo.getUserName(un);
		demo.getPassword(pwrd);
	}

	@And("I clicked the signin button")
	public void I_Clicked_Login() {
		demo.getSubmitted();
	}

//@Then("Its navigates the UI")
//public void its_navigated_to_the_home_page() {
//		demo.LoginSuccess();
//}
////@Then("Its not navigates the UI")
////public void its_not_navigates_the_ui() {
////demo.LoginFails();
//}		
	@Then("Its navigated to the {string}")
	public void its_navigated_to_the(String expectedResult) {
		demo.run(expectedResult);
	}

}
