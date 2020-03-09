package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verifying_Dropdown_Selection_State {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/");
	    driver.manage().window().maximize();
	    
	    
	    boolean flag=new Select(driver.findElement(By.id("customState")))
	    		.isMultiple();
	    System.out.println("Dropdown Multiple selection state is => "+flag);

	    
	    /*
	     * Using Javascript Convert Single Selection dropdown to multiple
	     * selection dropdown
	     */
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	    
	    
	    //Veriying dropdown multiple selection state
	    
	    boolean flag1=new Select(driver.findElement(By.id("customState")))
	    		.isMultiple();
	    System.out.println("Dropdown Multiple selection state is => "+flag1);
	    
	    
	    
	}

}
