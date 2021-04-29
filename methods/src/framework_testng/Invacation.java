package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Invacation {
	WebDriver driver;
	int count=0;
  @Test(invocationCount=15)
  public void drop_down() {
	  WebElement state=driver.findElement(By.xpath("//select[@id='customState']"));
	  new Select(state).selectByIndex(count);
	  count=count+1;
  }
  @BeforeMethod
  public void load_webpage()
  {
	  driver.get("https://v1.hdfcbank.com/branch-atm-locator");
  }
  @BeforeClass
  public void launch_browser()
  {
	  System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
