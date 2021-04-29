package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Specific_row_cell {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.navigate().to("https://www.icicidirect.com/equity/index/overview");
     
        WebElement table=driver.findElement(By.xpath("//table[@id='tblIdxMoment']/tbody"));
        List<WebElement>rows=table.findElements(By.tagName("tr"));
        System.out.println(rows.size());
        
        WebElement row3=rows.get(3);
        List<WebElement>info=row3.findElements(By.tagName("td"));
       String index=info.get(0).getText();
       String comp=info.get(1).getText();
       String advance=info.get(2).getText();
       System.out.println(index+"\t"+comp+"\t"+advance);
       
        
	}

}
