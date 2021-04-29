package framework_testng_cross;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsing {
	public WebDriver driver;
	String url;
  @Test
  @Parameters("browsername")
  public void browserlaunch(String browser) 
  {
	  switch ("browser") {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
   case "firefox":
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
   case "ie":
		System.setProperty("webdriver.i.e.driver", "Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		break;
   default:System.out.println("browser mismatch");
		break;
	}
  }
  @Test
  @Parameters("app_url")
  public void launchwebpage(String url)
  {
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  @Test
  public void Hotel_search() throws Exception
  {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='Tags']")).sendKeys("New Delhi",Keys.ENTER);
	  driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[30]")).click();
	  driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[47]")).click();
	 new Select(driver.findElement(By.id("travellersOnhome"))).selectByIndex(3);
	 driver.findElement(By.id("SearchHotelsButton")).click();
  }
  @Test
  public void closebrowser() throws Exception
  {
	  Thread.sleep(3000);
	  driver.close();
  }
}
