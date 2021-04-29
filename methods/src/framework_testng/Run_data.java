package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run_data {
  @Test(dataProvider="Productdetails",dataProviderClass=Dataprovider.class)
  public static void use_outside(String prodid,String inches,int price)
  {
	  Reporter.log(prodid+" "+inches+" "+price,true);
  }
}
