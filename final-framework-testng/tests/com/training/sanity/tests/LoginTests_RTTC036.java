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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_RTTC036 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM_RTTC036 loginPOM_RTTC036;
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
		loginPOM_RTTC036 = new LoginPOM_RTTC036(driver); 
		baseUrl = properties.getProperty("retail.hommelle.com");
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
		loginPOM_RTTC036.clickOnUserLink();
		loginPOM_RTTC036.clickOnMyOrdersLink();
		loginPOM_RTTC036.clickOnViewIcon();
		loginPOM_RTTC036.clickOnReturnicon();
		loginPOM_RTTC036.selectOptionfromProduct();
		loginPOM_RTTC036.sendtextOnFOODT();
		loginPOM_RTTC036.submit();
	}

	
	

}
