package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_move {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.naukri.com/");
         
         WebElement recurit_action=driver.findElement(By.xpath("(//a[contains(.,'Recruiters')])[1]"));
         new Actions(driver).moveToElement(recurit_action).perform();
         WebElement nakuri_recruit=driver.findElement(By.xpath("//li[.='Go to NaukriRecruiter']"));
         new Actions(driver).click(nakuri_recruit).perform();
       
	}

}
