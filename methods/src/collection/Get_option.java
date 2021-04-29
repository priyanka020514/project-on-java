package collection;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_option {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com/r.php");
        
      Select date_selector=new Select(driver.findElement(By.id("day")));
         List<WebElement>date=date_selector.getOptions();
         for (WebElement eachdate : date)
         {
			String optiondate=eachdate.getText();
			System.out.println(optiondate);
			eachdate.click();
			
		}
        
        
	}

}
