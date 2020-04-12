package com.qaupgrade.pomhfw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaupgrade.pomhfw.base.TestBase;

public class SelectFlights extends TestBase {
	
	@FindBy(xpath="//img[@src='/images/masts/mast_selectflight.gif']")
	WebElement selectflight;
	
	public SelectFlights() {
//		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String SelectFlightsPageTitle(){
		return driver.getTitle();
	}
}
