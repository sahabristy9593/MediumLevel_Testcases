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

public class LoginPOM_RTTC040 {
	private WebDriver driver; 

	public LoginPOM_RTTC040(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="/html/body/div/nav/ul/li[3]/a/i")
	private WebElement catalogIcon;

	@FindBy(how = How.CSS, using="#menu-catalog > ul > li > a")
	private WebElement categories;

	@FindBy(how = How.XPATH, using="//input[@name='selected[]']/[9]")
    private WebElement _1deleteitem;


    @FindBy(how = How.XPATH, using="////input[@name='selected[]']/[10]]")
    private WebElement _2deleteitem;

    @FindBy(how = How.XPATH, using="//button[@type='button']")
    private WebElement deleteIcon;
    
 
  
	public void clickOncatalogIcon() {
		catalogIcon.click();
		
		}
	
	public void clickOnCategoriesLink() {
		Actions a = new Actions(driver);
		a.moveToElement(categories).build().perform();
	}
	

		public void _1deleteitem() {
					this._1deleteitem.click(); 
	}
		public void _2deleteitem() {
					this._2deleteitem.click();
					
			
	}

		public void deleteItems() {
			this.deleteIcon.click();
			
			
	}
		public void clickOnOK() {
			driver.getWindowHandle().a ;
			
			
			
	}
	
}
