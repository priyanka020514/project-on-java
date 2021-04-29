package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Run_cleartrip_hotel {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.cleartrip.com/hotels");
        
        Page_cleartrip_hotel obj=new Page_cleartrip_hotel(driver);
        obj.where_location.sendKeys("New Delhi",Keys.ENTER);
        obj.Check_in_date.click();
        obj.Check_out_date.click();
        Thread.sleep(2000);
        new Select(obj.Travellers).selectByIndex(2);
        Thread.sleep(2000);
        obj.Search_btn.click();
        
	}

}
