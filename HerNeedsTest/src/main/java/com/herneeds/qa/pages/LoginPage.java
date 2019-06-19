package com.herneeds.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herneeds.qa.base.HerneedsBase;

public class LoginPage extends HerneedsBase{
	
	//PageFactory - OR:
	@FindBy(xpath = ".//*a[contains(text(),'SIGN IN')]")
	WebElement signin;
	
	@FindBy(xpath = ".//*img[contains(@src,'herneeds-logo_0_2.jpg' )]")
	WebElement Home;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHerneedsImage() {
		return Home.isDisplayed();
	}
	
	public SignUpPage ClickOnSignIn() {
		signin.click();
		return new SignUpPage();
		
	}
	
}
