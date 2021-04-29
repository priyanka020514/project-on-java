package framework_testng.switch_command_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_switch {

	public static void main(String[] args)
	{
          System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://epass.apcfss.in/");
          driver.switchTo().frame("message");
          driver.findElement(By.xpath("(//a[contains(@class,'navText')])[4]")).click();
          driver.switchTo().defaultContent();
          driver.switchTo().frame("bodyFrame");
    new Select(driver.findElement(By.xpath("//select[@id='acyearid']"))).selectByIndex(2);
    
          
	}

}
