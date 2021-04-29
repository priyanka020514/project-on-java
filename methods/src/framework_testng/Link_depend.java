package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Link_depend 
{ WebDriver driver;
  
  String url="https://www.facebook.com/";
	
  @Test(priority=3,description="signup page loaded",groups="Log2")
  public void sign_up_page() {
	  driver.findElement(By.xpath("//a[contains(@title,'Sign up for Facebook')]")).click();
	  String exp_title="Sign up for Facebook | Facebook";
	  Assert.assertEquals(driver.getTitle(), exp_title);
	  
  }
  @Test(priority=2,description="log in page loaded",groups="Log1")
  public void log_in_page() {
	  driver.findElement(By.xpath("//a[contains(@title,'Log in to Facebook')]")).click();
	  String exp_title="Log in to Facebook";
	  Assert.assertEquals(driver.getTitle(), exp_title);
	  Reporter.log(driver.getTitle());
	  
  }
  @Test(priority=1,description="messenger page loaded",groups="Log2")
  public void messenger() {
	  driver.findElement(By.xpath("//a[contains(@title,'Take a look at Messenger.')]")).click();
	  String exp_title="Messenger";
	  if(exp_title.equalsIgnoreCase(driver.getTitle()))
	  {
		  System.out.println("passed");
	  }
	  
  }
  @BeforeMethod(groups="Log2")
  public void app_url() {
	  driver.get(url);
  }
  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("screenshot\\"+method.getName()+".png")); 
  }
  @BeforeClass(groups="Log2")
  public void browserlaunch() 
  {
	  System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void closebrowser() 
  {
	  driver.close();
  }

}
