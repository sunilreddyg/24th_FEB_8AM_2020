package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser {

	public static void main(String[] args)
	{
		
		/*
		 * Download IEDriverServer.exe file.
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Under The Internet Explorer driver server
		 * 		=> Download IEDriverServer w.r.t HotSpot size
		 * 		=> IEDriverServer version should match with Webdriver Version..
		 * 		=> After download zip file unzip file to project location
		 * 		=> Set Runtime Environment variable before launch IE browser
		 * 
		 * 
		 * 	Note:-->
		 * 			1. IE browser zoom level should be 100
		 * 			2. Disable all security and privacy settings
		 * 			3. only Support IE browser 11 and above
		 * 
		 */
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
