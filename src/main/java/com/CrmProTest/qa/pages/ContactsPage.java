package com.CrmProTest.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CrmProTest.qa.base.TestBase;

public class ContactsPage extends TestBase {
	WebDriver driver;
	ContactsPage() throws FileNotFoundException
	{
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="title")
	WebElement title;
	
	@FindBy(name="client_lookup")
	WebElement client_lookup;
	
	@FindBy(xpath="(//input[@onclick=\"javascript:lookup('CLIENT', 'prospectForm' , this.form.client_lookup.value);\"])[1]")
	WebElement lookup1btn;
	
	@FindBy(xpath="//input[@name='contact_lookup']")
	WebElement PrimaryContact;
	
	@FindBy(xpath="(//input[@onclick=\"javascript:lookup('CONTACT', 'prospectForm' , this.form.contact_lookup.value);\"])[1]")
	WebElement lookup2btn;
	
	@FindBy(name="amount")
	WebElement amount;
	
	@FindBy(id="probability")
	WebElement propability;
	
	@FindBy(id="commission")
	WebElement commission;
	
	@FindBy(name="identifier")
	WebElement identifier;
	
	@FindBy(xpath="//tbody/tr[8]/td[2]/input[2]")
	WebElement qbtn1;
	
	@FindBy(xpath="//a[normalize-space()='Add one here']")
	WebElement addonelink;
	
	@FindBy(id="quantity")
	WebElement quanity;
	
	@FindBy(xpath="//input[@value='Set projected total']")
	WebElement setprojectedtotal;
	
	@FindBy(name="type")
	WebElement typedropdown;
	
	@FindBy(name="source")
	WebElement sourcedropdown;
	
	@FindBy(xpath="//img[@id='f_trigger_c_close_date']")
	WebElement predictedclosedatecalender;
	
	@FindBy(xpath="//img[@id='f_trigger_c_actual_close_date']")
	WebElement actualcloseddatecalender;
	
	@FindBy(name="exclude_reports")
	WebElement excludecheckbox;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement savebtn;
	
	public void addtocontact(String  contacttitle)
	{
		title.sendKeys(contacttitle);
	}
	public void companylookup(String company)
	{
		client_lookup.sendKeys(company);
		lookup1btn.click();
	}
	
	
}
