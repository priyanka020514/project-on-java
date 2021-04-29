package reports;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class With_webdriver {
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
	String filepath="Reports\\";
	String url="https://www.facebook.com/";
  @Test
  public void valid_login() 
  {
	  driver.findElement(By.id("email")).sendKeys("askapriyanka@gmail.com");
	  test.log(LogStatus.INFO, "enter email");
	  driver.findElement(By.id("pass")).sendKeys("priyavenkat");
	  test.log(LogStatus.INFO, "enter password");
	  driver.findElement(By.name("login")).click();
	  test.log(LogStatus.INFO, "login clicked");
	  test.log(LogStatus.PASS, "successful login");
  }
  @Test
  public void invalid_login() 
  {
	  driver.findElement(By.id("email")).sendKeys("venkatesh.perumala@gmail.com");
	  test.log(LogStatus.INFO, "enter email");
	  driver.findElement(By.id("pass")).sendKeys("venkat");
	  test.log(LogStatus.INFO, "enter password");
	  driver.findElement(By.name("login")).click();
	  test.log(LogStatus.INFO, "login clicked");
	  test.log(LogStatus.FAIL, "unsuccessful login");
  }
  @BeforeMethod
  public void beforeMethod(Method method)
  {  driver.get(url);
	 test=report.startTest(method.getName());
  }

  @AfterMethod
  public void afterMethod() 
  {
	  report.endTest(test);
  }

  @BeforeClass
  public void beforeClass() 
  {   System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
       driver=new FirefoxDriver();
	  report=new ExtentReports(filepath+"report.html", true);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  report.flush();
  }

}
