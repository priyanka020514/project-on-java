package keyboard_action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_keyaction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/selectable/");
        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        
        new Actions(driver).keyDown(Keys.CONTROL).perform();
        
        driver.findElement(By.xpath("//li[.='Item 1']")).click();
        driver.findElement(By.xpath("//li[.='Item 4']")).click();
        driver.findElement(By.xpath("//li[.='Item 7']")).click();
        
        new Actions(driver).keyUp(Keys.CONTROL).perform();
        
        
        
	}

}
