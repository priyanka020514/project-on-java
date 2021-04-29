package capture_screen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Date_Formate_capture {

	public static void main(String[] args) throws Exception
	{
              System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.get("https://www.hdfcbank.com/");
              driver.manage().window().maximize();
              Date date=new Date();
              SimpleDateFormat df= new SimpleDateFormat("YYYY-MMM-EEE-dd-hh-mm-ss");
              String time=df.format(date);
              
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            
            FileHandler.copy(src, new File("D:\\selenium_workspace\\methods\\screenshot\\image"+time+"png"));
            
            
            
            /*
    		 * Date formatters:-->
    		 * 
    		 * 		yyyy =>    year   [2021]
    		 * 		  yy =>    year   [21]
    		 * 		  MM =>    Month  [01-12]
    		 * 		MMM  =>    Month  [Jan -Dec]
    		 * 		EEE  =>    week   [sun -sat]
    		 * 		  dd =>    date   [01-31]
    		 * 		  hh =>    hour   [01-24]
    		 * 		  mm =>    minute [01-60]
    		 * 		  ss =>    Seconds[01-60]
    		 * 		
    		 */



            
            
	}

}
