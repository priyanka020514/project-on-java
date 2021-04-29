package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Run_cleartrip_flight {

	public static void main(String[] args) throws Exception
	{
         System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.get("https://www.cleartrip.com/");
         
         Page_cleartrip_flight obj= new Page_cleartrip_flight(driver);
         Thread.sleep(2000);
         obj.From_location.sendKeys("Hyd");
         Thread.sleep(400);
         obj.From_location.sendKeys(Keys.ENTER);
         obj.To_location.sendKeys("Del");
         Thread.sleep(400);
         obj.To_location.sendKeys(Keys.ENTER);
         obj.Date_picker.click();
         new Select(obj.Select_adluts).selectByIndex(3);
         Thread.sleep(3000);
         new Select(obj.Select_chlidren).selectByIndex(2);
         Thread.sleep(2000);
         new Select(obj.Select_infant).selectByIndex(1);
         Thread.sleep(5000);
         obj.Click_moreoption.click();
         new Select(obj.Select_class).selectByIndex(0);
         obj.Select_Prefairline.sendKeys("air");
         Thread.sleep(5000);
         obj.Select_Prefairline.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
         obj.Search_btn.click();
       
	}

}
