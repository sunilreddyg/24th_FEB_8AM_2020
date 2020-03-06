package selenium_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		
		/*
		 * WebDriver is a interface class it is designed
		 * to automate all browser instances supported by selenium-webdriver.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		/*
		 * Exceptions:-->
		 * 			=>  WebDriver driver=new ChromeDriver();
		 * 		
		 * 				 IllegalStateException:-->
		 * 							When Chromdriver.exe file not located
		 * 							under current system.
		 * 
		 * 			=> driver.get("http://google.com");
		 * 		
		 * 				SessionNotCreated:-->
		 * 							Exception display when browserdriver
		 * 							version mismatch with browser version.
		 * 
		 * 				InvalidArgumentException:-->
		 * 							Exception display when protocal not
		 * 							define with http://  or https://
		 */
		
		

	}

}
