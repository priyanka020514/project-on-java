package capture_screen;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_capture {

	public static void main(String[] args) 
	{
             System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https://www.facebook.com");
             driver.manage().window().maximize();
             
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String path="D:\\selenium_workspace\\methods\\screenshot\\img.png";
            try {
				FileHandler.copy(src, new File(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
