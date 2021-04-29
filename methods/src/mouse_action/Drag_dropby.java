package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_dropby {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
        
       WebElement drag=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
       
       new Actions(driver).dragAndDropBy(drag, 150, 0).perform();
       
       WebElement drag1=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[3]"));
       new Actions(driver).dragAndDropBy(drag1, -100, 0).perform();
        
	}

}
