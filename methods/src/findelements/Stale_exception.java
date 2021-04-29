package findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_exception {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.navigate().to("https://www.facebook.com/");
         
         WebElement email=driver.findElement(By.id("email"));
         driver.navigate().refresh();
        email=driver.findElement(By.id("email"));
         email.clear();
         email.sendKeys("askapriyanka@gmail.com");
         
         By passw=By.id("pass");
         driver.navigate().refresh();
         driver.findElement(passw).sendKeys("priya");
         
        
	}

}
