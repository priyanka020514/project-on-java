package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target_row {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.icicidirect.com/equity/sector-overview");
        //Target table
        driver.findElement(By.xpath("(//i[contains(@class,'topgle_icon')])[2]")).click();
        WebElement table=driver.findElement(By.xpath("//table[@id='tbl_sector1']/tbody"));
       List<WebElement>rows=table.findElements(By.tagName("tr"));
       System.out.println("Available records---"+rows.size());
       for (int i = 0; i < rows.size(); i++)
       {
		 WebElement single=rows.get(i);
		 String textrow=single.getText();
		 if(textrow.contains("TCS")) {
			List<WebElement>rowdata=single.findElements(By.tagName("td"));
			String name=rowdata.get(0).getText();
			String capital=rowdata.get(1).getText();
			System.out.println(name+" "+capital);
			
			 
		 }
		 
	}
        
	}

}
