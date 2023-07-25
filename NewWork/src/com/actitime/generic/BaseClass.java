package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

public class BaseClass 
{
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("Close The Browser",true);
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Reporter.log("Login To The Application",true);
		//driver.get("https://demo.actitime.com/login.do");
		FileLib fil=new FileLib();
		String url = fil.getPropertyData("url");
		String un = fil.getPropertyData("username");
		String pw = fil.getPropertyData("password");
		driver.get(url);
		
		//Call The Login Page Method By Creating The Object
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(un,pw);
		
		
	}
	
	@AfterMethod
	public void logout() 
	{

		Reporter.log("Logout OF The Appliaction",true);
		HomePage etp=new HomePage(driver);
	    etp.getLogut().click();
		
		
		


	}
}




