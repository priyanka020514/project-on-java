package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Next_page_records {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	        WebDriver driver=new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	        driver.navigate().to("https://www.icicidirect.com/equity/index/overview");
	        //next button inspected
	        WebElement next_click=driver.findElement(By.xpath("//a[@id='tblIdxMoment_next']"));
	        //declare boolean for conditon
	        boolean flag=false;
	        //do loop 
	        
	        do {
				//target table
	        	WebElement table=driver.findElement(By.xpath("//table[@id='tblIdxMoment']/tbody"));
	        	List<WebElement>rows=table.findElements(By.tagName("tr"));
	        	System.out.println("number of records in tale---"+rows.size());
	        	//for loop
	        	for (int i = 0; i < rows.size(); i++) 
	        	{
	        		//selecting row size
					String SName=rows.get(i).findElements(By.tagName("td")).get(0).getText();
					System.out.println("Print info--"+SName);
					
				}
	        	next_click=driver.findElement(By.xpath("//a[@id='tblIdxMoment_next']"));
	        	String next_btn_class=next_click.getAttribute("class");
	        	flag=next_btn_class.contains("disabled");
	        	if(flag==false)
	        	{
	        		next_click.click();
	        		System.out.println("next button clicked");
	        		
	        	}
	        	
			} while (flag==false);
	       
	}

}
