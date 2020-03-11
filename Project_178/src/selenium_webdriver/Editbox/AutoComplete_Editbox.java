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
	    
	    //Selecting Roundtrip Radio button
	    driver.findElement(By.id("RoundTrip")).click();
	    
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
	    Thread.sleep(2000);

	    //Type date into return date editbox [Before type make sure editbox is in writable mode]
	    driver.findElement(By.id("ReturnDate")).clear();
	    driver.findElement(By.id("ReturnDate")).sendKeys("Thu, 20 Aug, 2020",Keys.ESCAPE);
	    
	    //Seleting Dropdown by targeting option tag under select Tag.
	    driver.findElement(By.xpath("//*[@id=\"Adults\"]/option[3]")).click();
	    
	    //Click Link using partial linkname
	    driver.findElement(By.partialLinkText("More options:")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"Class\"]/option[1]")).click();
	    
	    //Send Request to Serverices
	    driver.findElement(By.id("AirlineAutocomplete")).clear();
	    driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air Asia");
	    Thread.sleep(5000);
	    //Select Required sugesstion from services.
	    driver.findElement(By.linkText("Air Asia (I5)")).click();
	    
	    
	    driver.findElement(By.id("SearchBtn")).click();
	    
	    
		
	}

}
