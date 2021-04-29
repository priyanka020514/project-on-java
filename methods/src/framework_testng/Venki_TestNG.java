package framework_testng;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Venki_TestNG {
  @Test(priority=1,description="test1 executed",groups="log1")
  public void tc001() 
  {
  Reporter.log("TC001 executed",true);
  
  assertTrue(true, "passed");
  }
  @Test(priority=2,description="test2executed",groups="log2")
  public void tc002() 
  {
  Reporter.log("TC002 executed",true);
  }
  @Test(priority=3,description="test3 executed",dependsOnMethods="tc001",groups="log1")
  public void tc003() 
  {
  Reporter.log("TC003 executed",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before menthod executed");
  }

  @AfterMethod
  public void afterMethod() 
  {
  System.out.println("after method is executed");
  }

  @BeforeClass
  public void beforeClass() 
  {
  System.out.println("before class is executed");
  }

 
}
