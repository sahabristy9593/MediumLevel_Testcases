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

public class LoginPOM_RTTC039 {
	private WebDriver driver; 

	public LoginPOM_RTTC039(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="/html/body/div/nav/ul/li[3]/a/i")
	private WebElement catalogIcon;

	@FindBy(how = How.CSS, using="#menu-catalog > ul > li > a")
	private WebElement categories;

	@FindBy(how = How.XPATH, using="//div[@id='form-category']/div/table/tbody/tr[9]/td[4]/a/i")
    private WebElement Edit_icon;


    @FindBy(how = How.XPATH, using="//input[@id='input-meta-title1']")
    private WebElement Meta_tag_title_box;

    @FindBy(how = How.XPATH, using="//textarea[@id='input-meta-description1']")
    private WebElement Meta_tag_title_General_tab;
    
 
  	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement savebtn;


	public void clickOncatalogIcon() {
		catalogIcon.click();
		
		}
	
	public void clickOnCategoriesLink() {
		Actions a = new Actions(driver);
		a.moveToElement(categories).build().perform();
	}
	

		public void clickOnEditIcon() {
					this.Edit_icon.click(); 
	}
		public void cleardata() {
					this.Meta_tag_title_box.click();
					Meta_tag_title_box.clear();
					Meta_tag_title_box.sendKeys("ORNAMENTS");
			
	}


		public void typeDescription() {
			this.Meta_tag_title_General_tab.click();
			Meta_tag_title_General_tab.sendKeys("ornaments for ladies");
			
	}
		public void saveChanges() {
			savebtn.click();
			
	}
	
}
