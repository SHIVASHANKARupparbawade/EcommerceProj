package com.CrmProTest.qa.Test;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CrmProTest.qa.base.TestBase;
import com.CrmProTest.qa.pages.HomePage;
import com.CrmProTest.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	WebDriver driver;
	LoginPage login;
	HomePage homepage;
	
	
	LoginPageTest() throws FileNotFoundException
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws FileNotFoundException 
	{
		initalization();
		login= new LoginPage();
		
	}
	@Test(priority = 1)
	public void validatethelogintitle()
	{
		String title= login.validatelogintitle();
		System.out.println(title);
		Assert.assertEquals(title, "Free CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority = 2)
	public void logotest()
	{
		boolean b= login.validatecrmlogo();
		System.out.println(b);
		Assert.assertTrue(b);
	}
	@Test(priority = 3)
	public void logintest() throws FileNotFoundException
	{
		homepage= login.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void close()
	{
		teardown();
	}
	
	
	

}
