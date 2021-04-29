package explicitwaits;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows_number {

	public static void main(String[] args) throws Exception
	{
		 ChromeOptions opt=new ChromeOptions();
	       opt.addArguments("start-maximized");
	    
	               System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	               WebDriver driver=new ChromeDriver(opt);
	               driver.get("https://www.hdfcbank.com/");
	               driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	               WebElement click=driver.findElement(By.xpath("(//span[contains(@class,'social-title')])[49]"));
	               click.click();
	               Robot rob=new Robot();
	               rob.setAutoDelay(5000);
	               rob.mouseMove(626, 296);
	               rob.mousePress(InputEvent.BUTTON1_MASK);
	               rob.mouseRelease(InputEvent.BUTTON1_MASK);
	             
	               
	               new WebDriverWait(driver, 100).until(ExpectedConditions.numberOfWindowsToBe(2));
	               System.out.println("Two windows presented");
	               
	    
	}

}
