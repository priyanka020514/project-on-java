package capture_screen;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Capture_with_folder {

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.hdfcbank.com/");
         driver.manage().window().maximize();
         Date date=new Date();
         SimpleDateFormat df= new SimpleDateFormat("YYYY/MMM/EEE/dd-hh-mm-ss");
         String time=df.format(date);
         
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src, new File("screenshot\\"+time+"image.png"));
       
       
       
	}

}
