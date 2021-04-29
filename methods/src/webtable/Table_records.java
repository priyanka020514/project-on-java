package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_records {

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
        
        //target row
       List<WebElement>rows= table.findElements(By.tagName("tr"));
       System.out.println("Print row size...."+rows.size());
       for (int i = 0; i < rows.size(); i++)
       {
		WebElement allrows=rows.get(i);
		//target list of cell
		List<WebElement>singlecell=allrows.findElements(By.tagName("td"));
		//target first second and third
		
		String name=singlecell.get(0).getText();
		String Sharecap=singlecell.get(1).getText();
		String ltp=singlecell.get(2).getText();
		System.out.println(name+"  "+Sharecap+"    "+ltp);
	}
        
        
	}

}
