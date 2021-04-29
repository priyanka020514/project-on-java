package explicitwaits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Witout_waits {

	public static void main(String[] args) 
	{
		 ChromeOptions opt=new ChromeOptions();
	       opt.addArguments("start-maximized");
	    
	               System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	               WebDriver driver=new ChromeDriver(opt);
	               driver.get("https://www.facebook.com");
	               
	               String title="log in or sign up";
	               //using waits
	             boolean flag=new WebDriverWait(driver, 100).until(ExpectedConditions.titleContains(title));
	             System.out.println(flag);
	            //without waits
	             boolean flag1=ExpectedConditions.titleContains(title).apply(driver);
	             System.out.println(flag1);
	             
	             
	           //Note:--> When we implement expectedconditions without webdriver wait
	     		//We must add apply method at end of statement..
	     		
	             
	}

}
