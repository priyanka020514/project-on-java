package explicitwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Title_verified {

	public static void main(String[] args)
	{
		 ChromeOptions opt=new ChromeOptions();
	       opt.addArguments("start-maximized");
	    
	               System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	               WebDriver driver=new ChromeDriver(opt);
	               driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	               driver.get("https://www.facebook.com");
	            String title=driver.getTitle();
	            System.out.println(title);
	               
	           new WebDriverWait(driver, 50) .until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
	           System.out.println("title presented");
	           new WebDriverWait(driver, 50).
	           until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("askapriyanka@gmail.com");
	           System.out.println("successfully send keys");
	              
	    
	}

}
