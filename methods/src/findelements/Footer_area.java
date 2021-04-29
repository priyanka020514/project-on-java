package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer_area {

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.navigate().to("https://www.facebook.com/");
         
         Thread.sleep(5000);
         WebElement Footer_area=driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
        List<WebElement>foot_links=Footer_area.findElements(By.tagName("a"));
        for (int i = 0; i < foot_links.size(); i++) 
        {
			WebElement footerlink=foot_links.get(i);
			footerlink.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(6000);
			//restore
		    Footer_area=driver.findElement(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']"));
	        foot_links=Footer_area.findElements(By.tagName("a"));
			
			
			
		}
        
	}

}





