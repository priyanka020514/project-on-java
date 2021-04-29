package keyboard_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_sendkeys {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/free-job-alerts");
        
       WebElement ind=driver.findElement(By.xpath("//input[@id='Sug_locsugg']"));
       Actions act=new Actions(driver);
       Thread.sleep(5000);
       act.sendKeys(ind,"HYD");
       act.pause(2000);
       act.sendKeys(Keys.ARROW_DOWN);
       act.sendKeys(Keys.ENTER).perform();
       
        
	}

}
