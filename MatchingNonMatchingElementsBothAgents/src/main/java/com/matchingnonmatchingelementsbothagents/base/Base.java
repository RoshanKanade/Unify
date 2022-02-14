package com.matchingnonmatchingelementsbothagents.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Base
{
	public Properties prop;
	public static WebDriver driver;
	/*
	 * public static String email="roshan.funake@msquaremedia.com"; public static
	 * String pass="Roshan@007";
	 * 
	 * public static String em="radhe@mailinator.com"; public static String
	 * ps="8565E329";
	 */
	
	public Base()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\funak\\AutomationTester\\MatchingNonMatchingElementsBothAgents\\config.properties");
			prop.load(ip);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
			

	public void initialization() throws Throwable {
		String browsewName=prop.getProperty("browser");
		if(browsewName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\funak\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsewName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}




}


