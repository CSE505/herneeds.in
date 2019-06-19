package com.herneeds.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.herneeds.qa.base.HerneedsBase;
import com.herneeds.qa.pages.HomePage;
import com.herneeds.qa.pages.LoginPage;

public class LoginPageTest extends HerneedsBase {
	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Home | Herneeds");
	}

	@Test(priority = 2)
	public void HerneedsLogoImageTest() {
		boolean flag = loginPage.validateHerneedsImage();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
