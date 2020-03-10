package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    //Sendking Referral keyword to Auto Complete editbox
	    driver.findElement(By.id("FromTag")).clear();
	    driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
	    Thread.sleep(4000);  //Static timegap to load Sugesstions
	    //selecing sugession from services..
	    driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
	    
	    
	    //Sending referral keyword to autocomplete editbox
	    driver.findElement(By.id("ToTag")).clear();
	    driver.findElement(By.id("ToTag")).sendKeys("D"+Keys.ARROW_RIGHT+"EL");
	    Thread.sleep(4000);
	    driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
	    
	    //Select Date from datepicker
	    driver.findElement(By.linkText("28")).click();
		
	}

}
