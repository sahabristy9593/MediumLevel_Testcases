package com.training.pom;

import static org.testng.Assert.assertTrue;

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

public class LoginPOM {
	private WebDriver driver; 

	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//href[contains(text(),'Forgotten Password')]")
	WebElement forgot_password;

	@FindBy(how = How.XPATH, using="//input[contains(@type,'text') and contains(@name,'email')]")
	WebElement enter_email;

	@FindBy(how = How.XPATH, using="//input[contains(@type,'submit') and contains(@value,'Continue')]")
    WebElement continue_button;


    @FindBy(how = How.XPATH, using="//input[contains(@type,'password') and contains(@name,'password')]")
    WebElement new_password;

    @FindBy(how = How.XPATH, using="//span[contains(text(),'ETHNIC')]")
    WebElement ethnic_link;
    
    @FindBy(how = How.XPATH, using="//select[contains(@onchange,'location')]")
    WebElement sort_by_list_box;
    
	@FindBy(xpath="\"/html/body/div/section[2]/div/div/div/div/div/div/div[1]/div\n" + "\n" + "[1]/div/div[3]/div/div/div[1]/h4/a\"")
	private WebElement integerVitaeLaculisMassa;

	@FindBy(id="button-cart")
	private WebElement addtocartbtn; 
	
	@FindBy(xpath="\"/html/body/div[1]/header/div/div/div[3]/div[2]/div/ul/li/h3/a/i\"")
	private WebElement carticon;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div/div[3]/div[2]/div/ul/li/div/div/div[3]/a[1]")
	private WebElement viewCart;
	
	/**@FindBy(id="login")
	*private WebElement userName;
	*/ 

	/**public void sendUserName(String userName) {
		*this.userName.clear();
		*this.userName.sendKeys(userName);}
		*/ 
	


		
	
	
	public void ethnic_select() {
		ethnic_link.click();
		if(sort_by_list_box.isEnabled()) {
			SelectFromDropdown("//select[contains(@onchange,'location')]","Name (A - Z)");
			if(driver.findElement(By.xpath("//select[contains(@onchange,'location')]")).getText().equalsIgnoreCase("Name (A - Z)")) {
				Assert.assertTrue(true,"Source is selected successfully");
				Reporter.log("Source" + " Name (A - Z)"+ " is selected successfully");
			}
			
			SelectFromDropdown("//select[contains(@onchange,'location')]","Rating (Highest)");
			
			if(driver.findElement(By.xpath("//select[contains(@onchange,'location')]")).getText().equalsIgnoreCase("Rating (Highest)")) {
				Assert.assertTrue(true,"Source is selected successfully");
				Reporter.log("Source" + " Name (A - Z)"+ " is selected successfully");	
			}

		}
	}
	public void resetPassword() {
		
		forgot_password.click();
		enter_email.sendKeys("sahabristy9593@gmail.com");
		continue_button.click();
		new_password.sendKeys("mehadi");
		
	}
	
	public void SelectFromDropdown(String xpath, String value) {
		
		Select source = new Select(driver.findElement(By.xpath(xpath)));
		source.selectByVisibleText(value);
	}
	

		public void removefromcart() {
		ethnic_link.click();
		integerVitaeLaculisMassa.click();
		addtocartbtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(carticon).build().perform();
		viewCart.click(); 
	}
		public void integerVitaeLaculisMassa() {
			// TODO Auto-generated method stub
			this.integerVitaeLaculisMassa.click();
			
		}
		public void addtocartbtn() {
			// TODO Auto-generated method stub
			this.addtocartbtn.click();
			
		}
		public void carticon() {
			// TODO Auto-generated method stub
			Actions action = new Actions(driver);
			action.moveToElement(carticon).build().perform();
			
		}
		public void viewCart() {
			// TODO Auto-generated method stub
			this.viewCart.click();
			
		}
	
	
}
