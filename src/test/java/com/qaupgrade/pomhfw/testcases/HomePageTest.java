package com.qaupgrade.pomhfw.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaupgrade.pomhfw.base.TestBase;
import com.qaupgrade.pomhfw.pages.HomePage;
import com.qaupgrade.pomhfw.pages.LoginPage;
import com.qaupgrade.pomhfw.pages.SelectFlights;

public class HomePageTest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	SelectFlights selectflights;
	
	public HomePageTest() {
//		super(driver);
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage();	
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void validatetitleTest() {
		String homepagetitle = homepage.verifyHomepagetitle();
		Assert.assertEquals(homepagetitle, "Find a Flight: Mercury Tours: ");
	}

	@Test
	public void continueflights() {
		selectflights= homepage.clickContinueflights();
	}

	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
