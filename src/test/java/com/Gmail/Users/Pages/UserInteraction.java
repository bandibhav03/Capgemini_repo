package com.Gmail.Users.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Gmail.Users.config.Base;
import com.aventstack.extentreports.ExtentTest;

public class UserInteraction 
{
	Base base;
	
	private WebDriver driver;
	private ExtentTest test;
	
	//P
    public UserInteraction(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    
    
    public void getUserName(String un) {
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(un);
    }

    public void getPassword(String pwrd) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwrd);
    }

    public void getSubmitted() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    public void LoginSuccess() {
        WebElement target = driver.findElement(By.xpath("//h3[contains(text(),'Login')]"));
        Assert.assertTrue(target.isDisplayed());
        System.out.println("Login Successfully.");
    }

    public void LoginFails() {
        WebElement target1 = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
        Assert.assertTrue(target1.isDisplayed());
        System.out.println("Login Failed....");
    }

    public void Run(String expectedResult) {
        if (expectedResult.equals("Login Successfully")) {
            WebElement success = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
            Assert.assertEquals(success.getText(), "Login Successfully");
            System.out.println("Navigated to HomePage");
        } else if (expectedResult.equals("Enter data Correctly")) {
            WebElement errorMsg = driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
            Assert.assertEquals(errorMsg.getText(), "Enter your userName and password correct");
            System.out.println("Error message appeared");
        }
    }
    
    
}




