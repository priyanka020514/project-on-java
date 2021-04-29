package robot;


import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_browser {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in current system
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe"); 
      //browser initiation command
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        
        Robot rob=new Robot();
        rob.mouseMove(1053, 699);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(5000);
        rob.setAutoDelay(5000);
        rob.mouseMove(394, 232);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);
       
	}

}
