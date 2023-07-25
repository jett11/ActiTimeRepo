package Naykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaykaaWeb 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/search/result/?q=cosmetic&root=search&searchType=Manual&sourcepage=home");
		 WebElement txt = driver.findElement(By.xpath("//input[@placeholder=\"Search on Nykaa\"]"));
		txt.sendKeys("cosmetic");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//header/div[@id='header_id']/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/*[1]")).click();
	}
	

}
