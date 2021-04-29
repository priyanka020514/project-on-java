package webpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Drivers {

	public static void main(String[] args)
	{
          System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
          WebDriver driver=new FirefoxDriver();
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          driver.navigate().to("https://www.hdfcbank.com/");
          Actions act=new Actions(driver);
          act.moveToElement(driver.findElement(By.linkText("SME"))).click();
          
          
	}

}
