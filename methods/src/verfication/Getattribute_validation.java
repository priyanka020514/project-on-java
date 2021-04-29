package verfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute_validation {

	public static void main(String[] args) throws Exception
	{

		/*
		 * scenario:verify that return date is hidden 
		 *          when one way is selected
		 *          then select round trip.
		 *          and return date should be display automatically.
		 */
          System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.cleartrip.com/");
          
          String run_time_title=driver.getTitle();
          System.out.println("Print the tile----"+run_time_title);
		  
          String run_time_url=driver.getCurrentUrl();
          System.out.println("Print the current url---"+run_time_url);
          
          WebElement select=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
          select.click();
          String select_display=select.getAttribute("id");
          System.out.println(select_display);
          Thread.sleep(50000);
          if(select_display.equals("RoundTrip"))
          {
        	  System.out.println("Round trip selected");
        	  WebElement ret_date=driver.findElement(By.xpath("//input[contains(@id,'ReturnDate')]"));
        	  ret_date.click();
        	  WebElement ret_date_picker=driver.findElement(By.id("ReturnDateContainer"));
        	 String display=ret_date_picker.getAttribute("class");
        	 System.out.println(display);
        	 if(display.equals("vertical"))
        	  System.out.println("Test Pass: Date picker has displayed");
        	 else
        		 System.out.println("Test fail: As date picker doesn't display");
        		 
        
          }
	}

}
