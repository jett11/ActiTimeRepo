package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

	@Listeners(com.actitime.generic.ListenerImplementation.class)
	public class CustomerModule extends BaseClass

	{

		@Test
		public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Reporter.log("Create Customer",true);
			
			FileLib f=new FileLib();
			String custName = f.getExcelData("Sheet1", 3, 5);
			String custDescription = f.getExcelData("Sheet1",3, 6);
			TaskListPage tp=new TaskListPage(driver);
			tp.getTasktab().click();
			tp.getAddnew().click();
			tp.getNewCust().click();
			tp.getEntercusttxt().sendKeys(custName);
			tp.getCustdesp().sendKeys(custDescription);
			tp.getSelcust().click();
			tp.getSelComp().click();
			tp.getCrtcustBtn().click();
			Thread.sleep(3000);
			

		
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.textToBePresentInElement(OutputType<T>));
			
		//	tp.ge
			
			
			
			
		}

	}


