package method_parameters;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_keywords 
{   
	WebDriver driver;
	String driverpath="Drivers\\";
	WebDriverWait wait;
    
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
   
   /*keyword:Enter text into editbox with xpath
    * Author:
    * Created on:
    * Reviewed by:
    * lastupdate date:
    * Parameters used:local
    */
  public void Edit_box_text(String ele_xpath,String inputdata)
  {
	  driver.findElement(By.xpath(ele_xpath)).clear();
	  driver.findElement(By.xpath(ele_xpath)).sendKeys(inputdata);
  }
  /*keyword:checkbox
   * Author:
   * Created on:
   * Reviewed by:
   * lastupdate date:
   * Parameters used:local
   */
  public void click_elements(String ele_xpath)
  {
	  try {
            driver.findElement(By.xpath(ele_xpath)).click();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
	 
 /*keyword:select dropdown
  * Author:
  * Created on:
  * Reviewed by:
  * lastupdate date:
  * Parameters used:local
  */
 public void Select_dropdown(String Select_type,String ele_xpath,String inputvalue)
 {
	 switch (Select_type) 
	 {
	case "visibletext":
		new Select(driver.findElement(By.xpath(ele_xpath))).selectByVisibleText(inputvalue);
		break;
	case "value":
		new Select(driver.findElement(By.xpath(ele_xpath))).selectByValue(inputvalue);
		break;
	case "index":
		new Select(driver.findElement(By.xpath(ele_xpath))).selectByIndex(Integer.valueOf(inputvalue));
		break;
	default:System.out.println("Select tag unavailable");
		break;
	}
 }
 
 /*keyword:mousehover
  * Author:
  * Created on:
  * Reviewed by:
  * lastupdate date:
  * Parameters used:local
  */
  public void mouse_over(String ele_xpath)
  {
	WebElement element=driver.findElement(By.xpath(ele_xpath));
	new Actions(driver).moveToElement(element).pause(3000).perform();
  }
  /*keyword:file uploading
   * Author:
   * Created on:
   * Reviewed by:
   * lastupdate date:
   * Parameters used:local
   */
  public void file_uploading(String file_path)
  {
	String text=file_path;
	//Select String
	StringSelection stext=new StringSelection(text);
	//Get default system clipboard
	Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
	//set content to clipboard at runtime.
	clip.setContents(stext, stext);
	//Crate object for Robot class
	Robot rob=null;
	try {
		rob=new Robot();
		} catch (Exception e) {
		e.printStackTrace();
	}
	rob.setAutoDelay(2000);
	//Press Ctrl+V to paste copied text into notepad file
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	//Press enter
	rob.keyPress(KeyEvent.VK_ENTER);
	//release control
	rob.keyRelease(KeyEvent.VK_CONTROL);
	
  }
  /*keyword:file uploading
   * Author:
   * Created on:
   * Reviewed by:
   * lastupdate date:
   * Parameters used:local
   */
  public void capture_screen(String imgname)
  {try 
   {
	//simple date format
	  SimpleDateFormat format=new SimpleDateFormat("yyyy/mmm/dd hh/mm/ss");
	  //date 
	  Date dd=new Date();
	  //convert into system date
	  String time=format.format(dd);
	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(source, new File("screenshot\\"+time+imgname+".jpg"));
     } catch (Exception e)
  {
	    e.printStackTrace();
}
	    }
  public void close_browser() 
  {
	  driver.close();
  }
  
}
