package webdriver.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_list {

	public static void main(String[] args) throws Exception {
         System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://hdfcbank.com");
         Thread.sleep(4000);
         driver.findElement(By.linkText("Select Product Type")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("(//li[contains(.,'Cards')])[5]")).click();
         Thread.sleep(4000);
         driver.findElement(By.linkText("Select Product")).click();
         driver.findElement(By.xpath("//li[@value='2'][contains(.,'Debit Cards')]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[contains(@class,'btn btn-default btn-custom btn-default-custom know-button')]")).click();
	     Thread.sleep(6000);
	     driver.findElement(By.name("Category")).click();
	     driver.findElement(By.xpath("//label[contains(.,'Insurance')]")).click();
	     driver.close();
	     
	
	
	}

}
