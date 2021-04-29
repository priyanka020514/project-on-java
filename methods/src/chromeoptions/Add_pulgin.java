package chromeoptions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Add_pulgin {

	public static void main(String[] args)
	{
          ChromeOptions opt=new ChromeOptions();
          opt.addExtensions(new File("C:\\Users\\USER\\mgjhkhhbkkldiihlajcnlfchfcmhipmn-1.0.0-Crx4Chrome.com"));
          
          System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver(opt);
          driver.get("https://www.facebook.com");
          System.out.println("Successful launched");
          		
          
	}

}
