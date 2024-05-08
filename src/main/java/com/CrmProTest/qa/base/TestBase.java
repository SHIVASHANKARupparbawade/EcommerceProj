package com.CrmProTest.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CrmProTest.qa.utilities.UtilityTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws FileNotFoundException
	{
		prop= new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\shivs\\eclipse-workspace\\EcommerceTest\\src\\main\\java\\com\\EcommerceTest\\qa\\config\\config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static WebDriver initalization()
	{
		
		String browsername= prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(UtilityTest.PageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilityTest.implicitlyWait));
		driver.get(prop.getProperty("url"));
		return driver;
		
		
	}
	public void teardown()
	{
		driver.quit();
	}

}
