package launch_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{
	public static void main(String[] args) 
	{
		
		/*
		 * Download geckodriver.exe file
		 * 			URL:--> https://github.com/mozilla/geckodriver/releases
		 * 			=> download geckodriver w.r.t firefox version
		 * 					Firfox  60 >  => v0.26.0 [geckodriver version]
		 * 			=> Select operating system and hotspot size.
		 * 			=> Download zipformat file and unzip file to project location
		 * 			=> Set Runtime environment variable before launch firefox browser
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://fb.com");
		
	}

}
