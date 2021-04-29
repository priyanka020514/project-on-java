package framework_testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "Output")
  public void Data(String name, String password) {
	  Reporter.log(name+" "+password,true);
  }

  @DataProvider
  public Object[][] Output() {
    return new Object[][] {
      new Object[] { "hasvithkaushal@gmail.com", "hassu05" },
      new Object[] { "kushithviyan@gmail.com", "kushu14" },
      new Object[] {"venkatesh.perumala@gmail.com", "venkat02"}
    };
  }
  @DataProvider
  public static Object[][] Productdetails() {
    return new Object[][] {
      new Object[] { "LG", "inches55",50000 },
      new Object[] { "Samsung", "inches45",45000 },
      new Object[] {"sony", "inches55", 55000},
      new Object[] {"smarttv","inches45",65000}
    };
  }
  @Test(dataProvider="Productdetails")
  public void use_outside(String prodid,String inches,int price)
  {
	  Reporter.log(prodid+" "+inches+" "+price,true);
  }

}
