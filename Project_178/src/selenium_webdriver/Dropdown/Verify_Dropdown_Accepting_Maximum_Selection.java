package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Accepting_Maximum_Selection {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/");
	    driver.manage().window().maximize();
	    
	   
	    /*
	     * Using Javascript Convert Single Selection dropdown to multiple
	     * selection dropdown
	     */
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	    
	    
	    //Veriying dropdown multiple selection state
	    
	    boolean flag=new Select(driver.findElement(By.id("customState")))
	    		.isMultiple();
	    System.out.println("Dropdown Multiple selection state is => "+flag);
	    
	    
	    //Decision to accept on multiple selection
	    if(flag==true)
	    {
	    	System.out.println("dropdown is a multiple selection type");
	    	Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
	    	State_Dropdown.deselectAll();     //Deselection only possible on multiple selection type..
	    	State_Dropdown.selectByIndex(3);
	    	State_Dropdown.selectByIndex(6);
	    	State_Dropdown.selectByIndex(9);
	    	
	    	
		    	//Get Selection Count 
		    	int Selection_Count=State_Dropdown.getAllSelectedOptions().size();
		    	if(Selection_Count==3)
		    	{
		    		System.out.println("Testpass:--> selection count match as expected");
		    	}
		    	else
		    	{
		    		System.out.println("Testfail:--> Selection Count is mismatch");
		    	}
		    	
	    }
	    else
	    {
	    	System.out.println("Dropdown is a single option selection type");
	    }
	    

	}

}
