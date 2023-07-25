package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	 @FindBy(xpath="//a[text()='Logout']")
	    private WebElement logut;
	    
	 //   @FindBy(xpath="//a[@class='content tasks']")
	 //   private WebElement task;
	    
	    public HomePage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }

		public WebElement getLogut() {
			return logut;
		}
	    
	 /*   public void setLogout()
	    {
	    	logut.click();
	    	
	    }  */
	   // public void setTaskTab()
	   // {
	    //	task.click();
	   // }
	}



