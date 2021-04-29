package capture_screen;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Capture_full_page {

	public static void main(String[] args) throws Exception
	{
             System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.hdfcbank.com/agri");
             WebElement Element=driver.findElement(By.xpath("//h2[.='Kisan dhan vikas e-Kendra']"));
             new Actions(driver).moveToElement(Element).perform();
             new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
             
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String path="D:\\selenium_workspace\\methods\\screenshot\\img2.png";
            FileHandler.copy(src, new File(path));
             
	}

}
