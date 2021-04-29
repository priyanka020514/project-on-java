package tast;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Amazon_next_page_click {

	public static void main(String[] args) throws Exception 
	{     FirefoxOptions opt=new FirefoxOptions();
	      opt.addArguments("maximize");
         System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
         WebDriver driver=new FirefoxDriver(opt);
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.navigate().to("https://www.amazon.in/s?i=electronics&bbn=1389401031&rh=n%3A1389401031%2Cp_89%3AOnePlus&dc&qid=1615890723&rnid=3837712031&ref=sr_pg_1");
          
         WebElement next_btn=driver.findElement(By.xpath("//ul[@class='a-pagination']/li[5]/a"));
         
         boolean flag=false;
         
         do {
			
        	 WebElement fulltext=driver.findElement(By.xpath("//div[@class='sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16']"));
        	List<WebElement>text=fulltext.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col sg-col-4-of-20']"));
        	System.out.println(text.size());
        	next_btn.click();
        	for (int i = 0; i < text.size(); i++) 
        	{
        		fulltext=driver.findElement(By.xpath("//div[@class='sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16']"));
        		text=fulltext.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col sg-col-4-of-20']"));
        		
        	String Productname=text.get(i).findElement(By.xpath("//a[@class='a-link-normal s-no-outline']")).getText();
        	System.out.println("Productnames"+Productname);
        	Productname=text.get(i).findElement(By.xpath("//a[@class='a-link-normal s-no-outline']")).getText();
        	
				
			}
        	Thread.sleep(2000);
        	next_btn=driver.findElement(By.xpath("//ul[@class='a-pagination']/li[5]/a"));
        	if(next_btn.isDisplayed())
        	{
        		if(flag==false)
        		next_btn.click();
        		System.out.println("next button clicked");
        		
        		
        	}
        	 
		} while (flag==true);
         
         
         
         
	}

}
