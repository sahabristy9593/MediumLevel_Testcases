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
import com.training.pom.LoginPOM_RTTC037;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests_RTTC037 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM_RTTC037 loginPOM_RTTC037;
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
		loginPOM_RTTC037 = new LoginPOM_RTTC037(driver); 
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
	public void loginAdminPage() {
		loginPOM_RTTC037.typeUserid();
		loginPOM_RTTC037.typePassword();
		loginPOM_RTTC037.clickOnSubmit();
	}

	
	

}
