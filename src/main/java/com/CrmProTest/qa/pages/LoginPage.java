package com.CrmProTest.qa.pages;





import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CrmProTest.qa.base.TestBase;



public class LoginPage extends TestBase {
	public WebDriver driver;

		// TODO Auto-generated constructor stub
	
	public LoginPage() throws FileNotFoundException
	{
		super();
		PageFactory.initElements(driver,this);
		
	}
		
		@FindBy(name="username")
		public WebElement username;

		@FindBy(name="password")
		public WebElement password;
		

		@FindBy(xpath="//input[@value='Login']")
		public WebElement loginbtn;
		
		@FindBy(xpath="//img[@src='https://classic.freecrm.com/img/logo@2x.png']")
		public WebElement crmlogo;
		
		
		public String validatelogintitle()
		{
			return driver.getTitle();
		}
		public boolean validatecrmlogo()
		{
			return crmlogo.isDisplayed();
		}
		public HomePage validatelogin(String un,String pass) throws FileNotFoundException
		{
			username.sendKeys(un);
			password.sendKeys(pass);
			loginbtn.click();
			return new HomePage();
		}
		
		
		
		
	}




