package pagefactory;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reusable_keywords_webelement 
{       WebDriver driver;
        String driverpath="Drivers\\";
        WebDriverWait wait;
        
        public Reusable_keywords_webelement(WebDriver driver)
        {
        	this.driver=driver;
        }
        /*keyword:launch browser
         * Author:
         * Created on:
         * Reviewed by:
         * lastupdate date:
         * Parameters used:local
         */
        
        
        public void launch_browser(String Browsername)
        {
        switch (Browsername) 
        {
    	case "chrome":
    		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
            driver=new ChromeDriver();
    	   break;
    	case "firefox":
    		System.setProperty("webdriver.gecko.driver", driverpath+"geckodriver.exe");
    		driver=new FirefoxDriver();
    	   break;
    	 case "IE":
    		System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
    	    driver=new InternetExplorerDriver();
    	   break;



    	default:System.out.println("Browser couldn't launch");
    		break;
    	}
        }
        /*keyword:load webpage
         * Author:
         * Created on:
         * Reviewed by:
         * lastupdate date:
         * Parameters used:local
         */
       
        public void create_webpage(String url)
        {
        	driver.get(url);
        	driver.manage().window().maximize();
        }

        
        /*keyword:implicity wait
         * Author:
         * Created on:
         * Reviewed by:
         * lastupdate date:
         * Parameters used:local
         */
       public void implicitly_wait(int Time_in_seconds)
       {
    	   driver.manage().timeouts().implicitlyWait(Time_in_seconds, TimeUnit.SECONDS);
       }
       /*keyword:explicitly wait
        * Author:
        * Created on:
        * Reviewed by:
        * lastupdate date:
        * Parameters used:local
        */
      
       public void explicitly_wait(int Time_in_seconds)
       {
    	   wait=new WebDriverWait(driver, Time_in_seconds);
       }


	public void Edit_box(WebElement element,String inputdata)
       {
    	   
         
    	   WebElement edit_box=wait.until(ExpectedConditions.visibilityOf(element));
 	       edit_box.clear();
 	       edit_box.sendKeys(inputdata);
 	       edit_box.click();
	    
	
    	     
       }
       public void click_element(WebElement element)
       {
    	  wait.until(ExpectedConditions.visibilityOf(element)).click();
    	   
       }
       public void Select_dropdown(String Select_type,WebElement element,String inputvalue)
       {
      	 switch (Select_type) 
      	 {
      	case "visibletext":
      		new Select(element).selectByVisibleText(inputvalue);
      		break;
      	case "value":
      		new Select(element).selectByValue(inputvalue);
      		break;
      	case "index":
      		new Select(element).selectByIndex(Integer.valueOf(inputvalue));
      		break;
      	default:System.out.println("Select tag unavailable");
      		break;
      	}
       }
       public void click(WebElement element)
       {
    	   wait.until(ExpectedConditions.visibilityOf(element)).click();
       }

}
