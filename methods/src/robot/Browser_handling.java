package robot;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_handling {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in current system
             System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
           //browser initiation command
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.cleartrip.com");
             Thread.sleep(5000);
           //Create object for robot
             Robot rob=new Robot();
           //Move mouse cursor to location 
             rob.mouseMove(1261, 690);
           //Press mouse left click
           rob.mousePress(InputEvent.BUTTON1_MASK);
           rob.mouseRelease(InputEvent.BUTTON1_MASK);
           Thread.sleep(5000);
           rob.mouseMove(309, 164);
           rob.mousePress(InputEvent.BUTTON1_MASK);
           rob.mouseRelease(InputEvent.BUTTON1_MASK);
           
           //mouse scroll
           rob.mouseWheel(200);
           
	}

}
