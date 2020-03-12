package selenium_webdriver.Object_IIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_IDentification_Using_Class_Property {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com/");
	    driver.manage().window().maximize();
	    
	    
	    
	    /*
	     * => Before using class property make sure it is unique available
	     * 			with in htmlsource, Because developer use class property
	     * 			for single object and group objects.
	     * => Don't give class property with spaces while using Classname
	     * 		as locator identifier
	     * => User class along with spaces while using xpath and cssSelecto
	     * 		locator builders..
	     */
	    
	
	    //Enter Email
	    driver.findElement(By.className("whsOnd")).clear();
	    driver.findElement(By.className("whsOnd")).sendKeys("qadarshan");
	    
	    //Click Email validatio next button
	    driver.findElement(By.className("RveJvd")).click();
	    Thread.sleep(5000);
	    
	    //Enter password 
	    driver.findElement(By.className("whsOnd")).clear();
	    driver.findElement(By.className("whsOnd")).sendKeys("Hello12345");
	    
	    
	    //Click Password validation next button
	    driver.findElement(By.className("CwaK9")).click();
	}

}
