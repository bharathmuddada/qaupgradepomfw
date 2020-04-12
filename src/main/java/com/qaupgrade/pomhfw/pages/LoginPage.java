package com.qaupgrade.pomhfw.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaupgrade.pomhfw.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory - OR:
		@FindBy(name="userName")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@name='login']")
		WebElement loginBtn;
	
		
		@FindBy(xpath="//img[@alt='Mercury Tours']")
		WebElement mercLogo;
		
		//Initializing the Page Objects:
		public LoginPage(){
//			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateCRMImage(){
			return mercLogo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			//loginBtn.click();
//	    	JavascriptExecutor js = (JavascriptExecutor)driver;
//	    	js.executeScript("arguments[0].click();", loginBtn);
			    	
			return new HomePage();
		}
	
}
