package verfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_validation {

	public static void main(String[] args) 
	{
		/*
		 * scenario:verify return date is hidden.
		 *          when round trip selected.
		 *          then return date should display
		 */
          System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.cleartrip.com/");
          
          String run_time_title=driver.getTitle();
          System.out.println("Print the tile----"+run_time_title);
		  
          String run_time_url=driver.getCurrentUrl();
          System.out.println("Print the current url---"+run_time_url);
          driver.findElement(By.id("FromTag")).sendKeys("Hyderabad");
          WebElement display=driver.findElement(By.tagName("body"));
          String display_text=display.getText();
          System.out.println(display_text);
          
          
          
		
		
	}

}
