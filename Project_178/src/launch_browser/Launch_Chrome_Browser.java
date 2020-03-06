package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download ChromeDriver.exe file
		 * 		=> http://chromedriver.storage.googleapis.com/index.html
		 * 		=> Select Chromedriver version w.r.t chrome browser version
		 * 		=> Download chromedriver zip format file w.r.t OS.
		 * 		=> It is a zipformat file unzip file to project location
		 * 		=> set Runtime environment variable for chromedriver.exe
		 */
		
		
			//Setting runtime environment variable for chrome browser.
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			ChromeDriver chrome=new ChromeDriver();
			chrome.get("http://google.com");

	}

}
