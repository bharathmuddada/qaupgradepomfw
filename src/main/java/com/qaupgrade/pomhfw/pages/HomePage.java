package com.qaupgrade.pomhfw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qaupgrade.pomhfw.base.TestBase;

public class HomePage extends TestBase  {

	@FindBy(xpath="//img[@alt='Mercury Tours']")
	WebElement mainLogo;
	
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement PassenegerDropdown;
	
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement continuebtn;
	
	public HomePage() {
//		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomepagetitle() {
		return driver.getTitle();
	}

	public SelectFlights clickContinueflights() {
		Select sel = new Select(PassenegerDropdown);
		sel.selectByValue("2");
		continuebtn.click();
		return new SelectFlights();
	}
}
