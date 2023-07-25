package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TaskListPage 
{
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasktab;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entercusttxt;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selcust;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selComp;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crtcustBtn;
	public TaskListPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	public WebElement getTasktab() 
	{
		return tasktab;
	}
	public WebElement getAddnew() {
		return addnew;
	}
	public WebElement getNewCust() {
		return newCust;
	}
	public WebElement getEntercusttxt() {
		return entercusttxt;
	}
	public WebElement getCustdesp() {
		return custdesp;
	}
	public WebElement getSelcust() {
		return selcust;
	}
	public WebElement getSelComp() {
		return selComp;
	}
	public WebElement getCrtcustBtn() {
		return crtcustBtn;
	}
	 
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement adNew;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProj;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement prjtnametxt;
	
	@FindBy(xpath="//div[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected']")
	private WebElement custmer;
	
	@FindBy(xpath="//div[text()='HDFC_05']")
	private WebElement hdfc;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Add Project Description']")
	private WebElement description;
	
	
	
	//@FindBy()
/*	 public void clickTask()
	 {
		 tasktab.click();
	 }
	 
	 public void addNewbtn()
	 {
		 addnew.click();
	 }
	 
	 public void newCustomerBtn()
	 {
		 newCust.click();
	 }
	 
	 public void customerTxtField()
	 {
		 //entercusttxt.sendKeys("HDFC_001");
		
	 }
	 
	 public void customerDescription()
	 {
		 custdesp.sendKeys("cust");
	 }
	 
	 public void selectCustomer()
	 {
		 selcust.click();
	 }
	 
	 public void selectCompany()
	 {
		 selComp.click();
	 }
	 
	 public void createCustomerBtn()
	 {
		 crtcustBtn.click();
	 }
	    */

}
