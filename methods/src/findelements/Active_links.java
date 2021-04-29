package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Active_links {

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
         for (int i = 0; i < 5; i++) 
         {
            WebElement act_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			List<WebElement>links=act_month.findElements(By.tagName("a"));
			
			
			for (int j = 0; j < links.size(); j++)
			{
				links.get(j).click();
				Thread.sleep(3000);
				date.click();
				Thread.sleep(2000);
				act_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				links=act_month.findElements(By.tagName("a"));
				
			}
				if(i==3) 
				{
					WebElement sectable=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
					sectable.findElements(By.tagName("a")).get(0).click();
					Thread.sleep(2000);
					date.click();
					Thread.sleep(2000);
					
				}
				
			WebElement nextclick=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			nextclick.click();
			Thread.sleep(2000);
		}
        
	}

}
