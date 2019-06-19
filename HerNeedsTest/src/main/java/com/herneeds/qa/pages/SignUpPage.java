package com.herneeds.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	
	
	@FindBy(xpath = ".//*a[contains(text(),'SIGN UP')]")
	WebElement signup;
}
