package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM_RTTC036;
import com.training.pom.LoginPOM_RTTC039;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_RTTC039 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM_RTTC039 loginPOM_RTTC039;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM_RTTC039 = new LoginPOM_RTTC039(driver); 
		baseUrl = properties.getProperty("http://retail.hommelle.com/admin");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@Test
	public void changePassword() {
		loginPOM_RTTC039.clickOncatalogIcon();
		loginPOM_RTTC039.clickOnCategoriesLink();
		loginPOM_RTTC039.clickOnEditIcon();
		loginPOM_RTTC039.cleardata();
		loginPOM_RTTC039.typeDescription();
		loginPOM_RTTC039.saveChanges();
		
	}

	
	

}
