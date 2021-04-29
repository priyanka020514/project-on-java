package robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_move {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in current system
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
      //browser initiation command
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        
        WebElement upload=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
        upload.click();
        
        String path="C:\\Users\\USER\\Desktop\\364623_H-1B_-__CV_.docx";
        StringSelection upload_path=new StringSelection(path);
       Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
       clip.setContents(upload_path, upload_path);
       
       Thread.sleep(5000);
      //Create object for robot
        Robot rob=new Robot();
        //press ctrl+v to slect the string
        rob.setAutoDelay(2000);
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_V);
        Thread.sleep(5000);
        rob.keyPress(KeyEvent.VK_ENTER);
        //release
        rob.keyRelease(KeyEvent.VK_CONTROL);
        
   
	}

}
