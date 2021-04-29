package pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run_cleartrip_train {

	public static void main(String[] args) throws Exception
	
	{ 
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
          Page_cleartrip_trains trainsearch=new Page_cleartrip_trains(driver);
          trainsearch.search_trains();
          trainsearch.verify_title();
          
          
	}

}
