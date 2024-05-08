package com.CrmProTest.qa.utilities;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.CrmProTest.qa.base.TestBase;

public class UtilityTest extends TestBase  {
	WebDriver driver;
	
	public UtilityTest() throws FileNotFoundException {
		
		super();
		driver= initalization();
		// TODO Auto-generated constructor stub
	}
	
	public static long PageLoadTimeout= 30;
	public static long implicitlyWait=40;
	
	
	public void switchtoframe()
	{
		
		
		driver.switchTo().frame("mainpanel");
	}
	//Handle Dropdown by Index
		public static void handleDropDown(WebElement ele,int index)
		{
			WebElement ele1=ele; 
			Select s=new Select(ele1);
			s.selectByIndex(index);
		}
		
	//Handle Dropdown by Visible Text
		public static void handleDropDownByVisibleText(WebElement ele,String str)
		{
			WebElement ele1=ele; 
			Select s=new Select(ele1);
			s.selectByVisibleText(str);
		}
	
	public void windowpopup()
	{
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		String childid= it.next();
		String parentid= it.next();
		driver.switchTo().window(childid);
		driver.close();
		driver.switchTo().window(parentid);
		driver.close();
		
	}

}
