package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_infobars {

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
        opt.addArguments("disable-infobars");
       
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(opt);
        driver.get("https://www.facebook.com");
        System.out.println("Successful launched");
       
	}

}
