package framework_testng;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class My_TestNG
{
	WebDriver driver;
	
	
  @Test(groups="Log2")
  public void Tc001()
  {
	  WebElement emailid= driver.findElement(By.id("email"));
	  emailid.sendKeys("priyanka.perumala@gmail.com");
	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys("password123");
	  
	  
	  Reporter.log("Testcase1 executed",true);
  }
  @Test(groups="Log1")
  public void Tc002()
  {
	  WebElement emailid= driver.findElement(By.id("email"));
	  emailid.sendKeys("venkatesh.perumala@gmail.com");
	  WebElement password=driver.findElement(By.id("pass"));
	  password.sendKeys("hi456123");
	    
	  Reporter.log("Testcase2 executed",true);
  }

  @BeforeMethod(groups="Log2")
  public void loadwebpage() 
  {
	  driver.get("https://facebook.com");
	  
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File("screenshot\\"+method.getName()+".png")); 
	  
	
	  
	  
	  }

  @BeforeClass(groups="Log2")
  public void launch_browser() {
	  System.setProperty("webdriver.driver.geckodriver", "Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  }

  
  @AfterClass
  public void close() throws Exception
  {
	  Thread.sleep(3000);
	  driver.close();
  }

}
