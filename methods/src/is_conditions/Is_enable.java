package is_conditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_enable {

	public static void main(String[] args) throws Exception
	{
		 
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
         driver.manage().window().maximize();
         
        WebElement customcity_enable=driver.findElement(By.id("customCity"));
        customcity_enable.isEnabled();
        boolean flag=customcity_enable.isEnabled();
        System.out.println("Print the statement----"+flag);
        if(customcity_enable.isEnabled())
        {
        	Thread.sleep(5000);
           new Select(driver.findElement(By.xpath("//select[@id='customRadius']"))).selectByIndex(3);
       WebElement list_box=driver.findElement(By.xpath("//input[@id='amenity_category_order_types49']"));
       list_box.click();
       if(list_box.isSelected())
    	      System.out.println("Test Pass:As selection done properly");
       else
    	   System.out.println("Test fail:Deselect");
        }
       else
    	  System.out.println("true statement mismatch");
          
        
        
        

	}

}
