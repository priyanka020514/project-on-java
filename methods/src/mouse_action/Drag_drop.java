package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws Exception
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://marcojakob.github.io/dart-dnd/basic/");
         
         WebElement im1=driver.findElement(By.xpath("(//img[@src='images/document.png'])[1]"));
         WebElement im2=driver.findElement(By.xpath("(//img[@src='images/document.png'])[2]"));
         WebElement im3=driver.findElement(By.xpath("(//img[@src='images/document.png'])[3]"));
         WebElement im4=driver.findElement(By.xpath("(//img[@src='images/document.png'])[4]"));
         
         WebElement bin=driver.findElement(By.xpath("//div[@class='trash']"));
       Actions act=new Actions(driver);
       act.dragAndDrop(im1, bin).perform();
       Thread.sleep(5000);
       act.dragAndDrop(im2, bin).perform();
       Thread.sleep(2000);
       act.clickAndHold(im3).moveToElement(bin).release().perform();
       Thread.sleep(2000);
       act.clickAndHold(im4).moveToElement(bin).release().perform();
       
         
       
	}

}
