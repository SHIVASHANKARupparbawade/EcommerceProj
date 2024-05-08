package com.CrmProTest.qa.pages;

import java.io.FileNotFoundException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CrmProTest.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//td[@class='headertext'][1]")
	WebElement homelabel;
	
	@FindBy(xpath="//a[normalize-space()='Contacts']")
	WebElement contactsbtn;
	@FindBy(xpath="//a[normalize-space()='Deals']")
	WebElement dealsbtn;
	
	public String validatehomepagetitle()
	{
		return driver.getTitle();
	}
	public boolean validatehomelabel()
	{
		return homelabel.isDisplayed();
	}
	public ContactsPage verifycontactsbuton() throws FileNotFoundException
	{
		contactsbtn.click();
		return new ContactsPage();
	}
	public dealspage clickondealsbtn()
	{
		dealsbtn.click();
		return new dealspage();
	}
	
	
	

}
