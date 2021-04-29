package capture_screen;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_when_alert_present {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver web=new ChromeDriver();
        web.manage().window().maximize();
        web.get("http://demo.automationtesting.in/Alerts.html");
        web.manage().window().maximize();
       WebElement button=web.findElement(By.xpath("//button[@class='btn btn-danger']"));
       button.click();
      Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
      Robot rob=new Robot();
      BufferedImage img=rob.createScreenCapture(new Rectangle(screen));
      File src=new File("D:\\selenium_workspace\\methods\\screenshot\\img4.png");
      ImageIO.write(img, "PNG", src);
      
      
      
        
        
	}

}
