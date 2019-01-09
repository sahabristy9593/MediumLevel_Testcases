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

public class LoginPOM_RTTC036 {
	private WebDriver driver; 

	public LoginPOM_RTTC036(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//div[@id='Menu_Wmt3OMY3']/nav/ul/li[2]/a/span/span/i")
	private WebElement userLink;

	@FindBy(how = How.XPATH, using="/html/body/div/header/div/div/div[3]/div[3]/nav/ul/li[2]/ul/li[3]/a/span")
	private WebElement MY_ORDERS_link;

	@FindBy(how = How.XPATH, using="//div[@id='system_epRD9Fax']/div/table/tbody/tr/td[7]/a")
    private WebElement view_icon;


    @FindBy(how = How.XPATH, using="//div[@id='System_epRD9Fax']/div/div/table/tbody/tr/td[6]/a[2]/i")
    private WebElement Return_icon;

    @FindBy(how = How.XPATH, using="//input[@name='return_reason_id']")
    private WebElement Return_Radio_btn;
    
    @FindBy(how = How.XPATH, using="//input[@name='opened']")
    private List <WebElement> Radio_btn_Product;
    
	@FindBy(how = How.XPATH, using = "//textarea[@id='input_comment']")
	private WebElement Faulty_or_other_details_textbox;

	@FindBy(how=How.XPATH, using = "//input[@value='submit']")
	private WebElement submit_btn; 
	


	public void clickOnUserLink() {
				this.userLink.click();
		
		}
	
	public void clickOnMyOrdersLink() {
				this.MY_ORDERS_link.click();
	}
	

		public void clickOnViewIcon() {
					this.view_icon.click(); 
	}
		public void clickOnReturnicon() {
					this.Return_icon.click();
			
		}
		public void clickOnReturnRadio() {
			this.Return_Radio_btn.click();
			Return_Radio_btn.sendKeys("Dead On Arrival");

			
		}
		public void selectOptionfromProduct() {
			Radio_btn_Product.get(0).isSelected();
			
		}
		public void sendtextOnFOODT() {
			this.Faulty_or_other_details_textbox.click();
			Faulty_or_other_details_textbox.sendKeys("Product is faulty");
			
		}
		public void submit() {
			submit_btn.click();
			
		}
	
}
