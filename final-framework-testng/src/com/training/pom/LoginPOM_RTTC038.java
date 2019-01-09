package com.training.pom;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;;

public class LoginPOM_RTTC038 {
	private WebDriver driver; 

	public LoginPOM_RTTC038(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//input[@id='input-username']")
	private WebElement username;

	@FindBy(how = How.XPATH, using="//input[@id='input-password']")
	private WebElement password;

	@FindBy(how = How.XPATH, using="//button[@type='submit']")
    private WebElement submitbtn;


  	public void typeUserid() {
				this.username.click();
				username.sendKeys("admin");
		
		}
	
	public void typePassword() {
				this.password.click();
				password.sendKeys("admin@123");
	}
	

		public void clickOnSubmit() {
					this.submitbtn.click(); 
	}
	

	
}
