package webdriver.links;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_options {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
         driver.manage().window().maximize();
        boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
        System.out.println("Dropdown Multiple Selection State is---->"+flag);
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	     boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
	     System.out.println("Dropdown Multiple Selection State is--->"+flag1);
	     if(flag1=true)
	     {
	    	Select dropdown=new Select(driver.findElement(By.id("customState")));
	    	dropdown.deselectAll();
	    	dropdown.selectByValue("andhra-pradesh");
	    	dropdown.selectByVisibleText("Delhi");
            dropdown.selectByIndex(11);
            dropdown.selectByIndex(13);
            dropdown.selectByIndex(15);
            dropdown.selectByIndex(17);
	     
	     int Selectcount=dropdown.getAllSelectedOptions().size();
	     if(Selectcount==6) 
	     {
	    	 dropdown.deselectByVisibleText("Delhi");
	    	 dropdown.deselectByValue("andhra-pradesh");
	    	 dropdown.deselectByIndex(13);
	    	  int dcount=dropdown.getAllSelectedOptions().size();
	    	  if(dcount==3)
	    	  {
	    		  System.out.println("Testcase Pass:Three options has been deselected from the selected options");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Testcase Fail:Unsuccessful to deselect the selected options");
	    	  }
	     }
	     else
	    	  {
	    		System.out.println("Precondition fail:The customstate doesn't have six selected options");  
	    		
	    	  }
	     }
	     else
	     {
	    	 System.out.println("Testcase Fail:Dropdown is not a multiple selection type");
	    
	     }
	              
	    
	driver.close();
	     

	}

}
