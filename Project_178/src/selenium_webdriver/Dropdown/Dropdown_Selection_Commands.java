package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_Commands {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/");
	    driver.manage().window().maximize();
	    
	    //Dropdown selection using visible option name..
	   new Select(driver.findElement(By.id("customState")))
	   .selectByVisibleText("Telangana");
	   
	   //dropdown selection using value property
	   Thread.sleep(5000);
	   new Select(driver.findElement(By.id("customCity")))
	   .selectByValue("hyderabad");
	   
	   //Type Locality
	   driver.findElement(By.id("customLocality")).clear();
	   driver.findElement(By.id("customLocality")).sendKeys("Dilsukhnagar");
	   
	   //Dropdown selection using index number
	   new Select(driver.findElement(By.id("customRadius")))
	   .selectByIndex(3);
	   
	   //Selecting a checkbox  
	   driver.findElement(By.id("amenity_category_order_types50")).click();
	   
	}

}
