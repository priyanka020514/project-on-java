package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_inside_table {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.icicidirect.com/equity/index/overview");
        
        WebElement next=driver.findElement(By.xpath("//a[@id='tblIdxMoment_next']"));
        boolean flag=false;
        boolean status=false;
        
        do 
        {
        	WebElement table=driver.findElement(By.xpath("//table[@id='tblIdxMoment']/tbody"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			
			for (int i = 0; i < rows.size(); i++) 
			{
				String textrow=rows.get(i).getText();
				if(textrow.contains("Nifty 100 Liq 15"))
				{
					List<WebElement>cell=rows.get(i).findElements(By.tagName("td"));
					WebElement celldata=cell.get(0);
					celldata.findElement(By.tagName("a")).click();
					status=true;
					break;
				}
					if(status==true)
					{
						break;
						
					
					
				}
					next=driver.findElement(By.xpath("//a[@id='tblIdxMoment_next']"));
					String nextclass=next.getAttribute("class");
					flag=nextclass.contains("disabled");
					if(flag==false)
					{
						next.click();
						System.out.println("next button click");
						
					}
				
			}	
		} while (flag==false);
        System.out.println("status found"+status);
        
        if(status==true)
        {
        	WebElement indextable=driver.findElement(By.xpath("//table[@id='tblIndexConst']/tbody"));
        	System.out.println("Print table data"+indextable);
        }
	
	
	}
}

