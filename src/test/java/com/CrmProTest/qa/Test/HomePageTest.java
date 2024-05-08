package com.CrmProTest.qa.Test;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CrmProTest.qa.base.TestBase;
import com.CrmProTest.qa.pages.ContactsPage;
import com.CrmProTest.qa.pages.HomePage;
import com.CrmProTest.qa.pages.LoginPage;
import com.CrmProTest.qa.utilities.UtilityTest;

public class HomePageTest extends TestBase {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	UtilityTest utility;
	ContactsPage contact;
	
	HomePageTest() throws FileNotFoundException
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws FileNotFoundException
	{
		initalization();
		utility= new UtilityTest();
		 login= new LoginPage();
		 login.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyhomepagetitletest() throws FileNotFoundException
	{
		home= new HomePage();
		String title= home.validatehomepagetitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO");
	}
	
	@Test(priority = 2)
	public void verifyhomelabel() throws FileNotFoundException
	{
		home= new HomePage();
		
		utility.switchtoframe();
		boolean b= home.validatehomelabel();
		System.out.println(b);
		Assert.assertTrue(b);
	}
	@Test(priority = 3)
	public void verifyclickoncontacts() throws FileNotFoundException
	{
		home= new HomePage();
		
		utility.switchtoframe();
		contact= home.verifycontactsbuton();
	}
	@AfterMethod
	public void close()
	{
		teardown();
	}
	
	

}
