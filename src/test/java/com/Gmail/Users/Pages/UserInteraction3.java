package com.Gmail.Users.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Gmail.Users.config.Reports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class UserInteraction3 {

	private WebDriver driver;
	private ExtentTest test;
	private WebDriverWait wait;

	// POM using page factory

	public UserInteraction3(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='submit']")
	private WebElement submit;

	@FindBy(xpath = "//h3[contains(text(),'Login')]")
	private WebElement Login;

	@FindBy(xpath = "//span[normalize-space()='Enter your userName and password correct']")
	private WebElement FLogin;

	@FindBy(xpath = "//h3[normalize-space()='Login Successfully']")
	private WebElement Success;

	@FindBy(xpath = "//span[normalize-space()='Enter your userName and password correct']")
	private WebElement ErrorMsg;

	public boolean getUserName(String un) {
		boolean result = true;

		try {
			wait.until(ExpectedConditions.visibilityOf(userName));
			Reports.generateReport(driver, test, Status.PASS, "UserName Found");

			userName.sendKeys(un);
		} catch (Exception te) {
			// TODO Auto-generated catch block
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "UserName not Interacting...");
		}
		return result;
	}

	public boolean getPassword(String pwrd) {
		boolean result = true;

		try {
			wait.until(ExpectedConditions.visibilityOf(password));
			Reports.generateReport(driver, test, Status.PASS, "Password Found");

			password.sendKeys(pwrd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Password not Interacting...");
		}
		return result;
	}

	public boolean getSubmitted() {

		boolean result = true;

		try {
			wait.until(ExpectedConditions.visibilityOf(submit));
			Reports.generateReport(driver, test, Status.PASS, "Submit Found");

			submit.click();
		} catch (Exception te) {
			// TODO Auto-generated catch block
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Submit not Interacting...");
		}
		return result;
	}

//    public void LoginSuccess() {
//        Assert.assertTrue(Login.isDisplayed());
//        System.out.println("Login Successfully.");
//    }
//
//    public void LoginFails() {
//        Assert.assertTrue(FLogin.isDisplayed());
//        System.out.println("Login Failed....");
//    }
//
//    public void Run(String expectedResult) {
//        if (expectedResult.equals("Login Successfully")) 
//        {
//            Assert.assertEquals(Success.getText(), "Login Successfully");
//            System.out.println("Navigated to HomePage");
//        } 
//        
//        else if (expectedResult.equals("Enter data Correctly")) 
//        {
//            Assert.assertEquals(ErrorMsg.getText(), "Enter your userName and password correct");
//            System.out.println("Error message appeared");
//        }
//    }

//    public boolean run(String expectedResult)
//    {
//    	boolean actResult = true;
//      	 try {
//      		 
//      		
//      		 wait.until(ExpectedConditions.visibilityOf(Success));
//      		 if(Success.getText().matches("Login Successfully"))
//      		 {
//      			Reports.generateReport(driver, test, Status.PASS, "Valid User");
//      		 }
//      		 else
//      		 {
//      			actResult = false;
//               Reports.generateReport(driver, test, Status.FAIL, "Invalid User");
//      		 }
//               
//      	 }catch (TimeoutException te) {
//               actResult = false;
//               Reports.generateReport(driver, test, Status.FAIL, "password not interacting...");
//           }
//      	 return actResult;
//       }
//    }

	public boolean run(String expectedResult) {
		boolean actResult = true;
		WebElement ele;
		if (expectedResult.equals("Login Successfully")) {
			ele = Success;
		} else {
			ele = ErrorMsg;
		}

		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			if (ele.getText().matches("Login Successfully")) {
				Reports.generateReport(driver, test, Status.PASS, "Valid User");
			} else {
				actResult = false;
				Reports.generateReport(driver, test, Status.FAIL, "Invalid Credentials");
			}
		} catch (Exception te) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Some Random Error");
		}

		return actResult;
	}

}
