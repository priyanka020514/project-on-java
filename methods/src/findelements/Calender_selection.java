package findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_selection {

	public static void main(String[] args) throws Exception 
	{
          System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
          driver.get("https://www.cleartrip.com/trains");
         WebElement date=driver.findElement(By.id("dpt_date"));
         date.click();
         Thread.sleep(5000);
         
         String Exp_month="June 2021";
         String Exp_date="14";
         for (int i = 0; i <4; i++) 
         {
			WebElement act_month=driver.findElement(By.xpath("(//th[@class='month'])[1]"));
			String active=act_month.getText();
			System.out.println(active);
			
			if(active.contains(Exp_month))
			{
				driver.findElement(By.linkText(Exp_date)).click();
				break;
				
			}
			 WebElement next_month=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
	         next_month.click();
	         Thread.sleep(3000);
	        
		}
         
	}

}
