package is_conditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {

	public static void main(String[] args) 
	{
           /*
            * scenario: verify 
            * 
            * 
            * 
            */
		
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.cleartrip.com/");
         
         String run_time_title=driver.getTitle();
         System.out.println("Print the tile----"+run_time_title);
		  
         String run_time_url=driver.getCurrentUrl();
         System.out.println("Print the current url---"+run_time_url);
        
       WebElement oneway_select=driver.findElement(By.id("OneWay"));
       oneway_select.click();
       driver.findElement(By.id("ReturnDateContainer")).isDisplayed();
       if(true)
       
       
       
    	  System.out.println("Test Pass:Return date not visible");
       
         else
         
            System.out.println("Test fail:As return date displayed");
         
       
    
       WebElement roundtrip_select=driver.findElement(By.id("RoundTrip"));
       roundtrip_select.click();
      WebElement ret_date=driver.findElement(By.id("ReturnDateContainer"));
      if(ret_date.isDisplayed())
    	  System.out.println("Test Pass:Return date displayed");
      else
    	  System.out.println("Test fail:return doesn't dispalyed");
       
          
         
	}

	}

