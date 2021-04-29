package variable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cross_browsing {

	public static void main(String[] args)
	{
		String browser="firefox";
		 WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.get("http://facebook.com");

	}

}
