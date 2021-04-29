package reports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Reports3 
{
    ExtentReports report;
	 ExtentTest test;
	 String filepath="Reports\\";
  @Test
  public void valid_login() 
  {
	  test.log(LogStatus.INFO, "launch browser");
	  test.log(LogStatus.INFO, "enter email");
	  test.log(LogStatus.INFO, "enter password");
	  test.log(LogStatus.INFO, "click lod in button");
	  test.log(LogStatus.INFO, "click logout");
	 Assert.assertEquals("log in successful", "log in successful");
	 test.log(LogStatus.PASS, "valid entry");
  }
  
  @Test
  public void invalid_login()
  {
	  test.log(LogStatus.INFO, "browser launch");
	  test.log(LogStatus.INFO, "email enter");
	  test.log(LogStatus.INFO, "invalid password");
	  test.log(LogStatus.INFO, "error msg displayed");
	  Assert.assertEquals("error msg", "error msg");
	  test.log(LogStatus.FAIL, "invalid entry");
  }
  @BeforeMethod
  public void beforeMethod(Method method)
  {
	 test=report.startTest(method.getName());
  }

  @AfterMethod
  public void afterMethod() 
  {
	  report.endTest(test);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  report=new ExtentReports(filepath+"report.html", true);
  }

  @AfterClass
  public void afterClass() {
	  report.flush();
  }

}
