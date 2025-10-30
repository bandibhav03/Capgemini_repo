package com.Gmail.Users.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction2
{
	
	private WebDriver driver;
	private ExtentTest test;
	
	//POM using page factory
	
	public UserInteraction2(WebDriver driver, ExtentTest test)
	{
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='userName']")
    private WebElement userName;
    
    @FindBy(xpath="//input[@name='password']")
    private WebElement password;
    
    @FindBy(xpath="//input[@name='submit']")
    private WebElement submit;
    
    @FindBy(xpath="//h3[contains(text(),'Login')]")
    private WebElement Login;
    
    @FindBy(xpath="//span[normalize-space()='Enter your userName and password correct']")
    private WebElement FLogin;
    
    @FindBy(xpath="//h3[normalize-space()='Login Successfully']")
    private WebElement Success;
    
    @FindBy(xpath="//span[normalize-space()='Enter your userName and password correct']")
    private WebElement ErrorMsg;
    
    

    
    
    public void getUserName(String un) {
        userName.sendKeys(un);
    }

    public void getPassword(String pwrd) {
        password.sendKeys(pwrd);
    }

    public void getSubmitted() {
        submit.click();
    }

    public void LoginSuccess() {
        Assert.assertTrue(Login.isDisplayed());
        System.out.println("Login Successfully.");
    }

    public void LoginFails() {
        Assert.assertTrue(FLogin.isDisplayed());
        System.out.println("Login Failed....");
    }

    public void Run(String expectedResult) {
        if (expectedResult.equals("Login Successfully")) 
        {
            Assert.assertEquals(Success.getText(), "Login Successfully");
            System.out.println("Navigated to HomePage");
        } 
        
        else if (expectedResult.equals("Enter data Correctly")) 
        {
            Assert.assertEquals(ErrorMsg.getText(), "Enter your userName and password correct");
            System.out.println("Error message appeared");
        }
    }
    
    
}
