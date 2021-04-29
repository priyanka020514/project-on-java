package case_name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Switch_case {

	public static void main(String[] args) 
	{
		String browser="firefox";
		WebDriver driver=null;
		switch (browser) 
		{
		case "ie":
			System.setProperty("webdriver.i.e.driver","Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		 
			
			break;
			
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		   
		break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
			
			break;
			

		default:
			System.out.println("browser coundn't launch");
			break;
			
		}
		
		driver.get("https://accounts.google.com/signup");

		
		

	}

}
