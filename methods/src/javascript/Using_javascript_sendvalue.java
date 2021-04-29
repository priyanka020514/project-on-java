package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_javascript_sendvalue {

	public static void main(String[] args) 
	{
          System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://facebook.com");
          
         JavascriptExecutor java=((JavascriptExecutor)driver);
         java.executeScript("document.getElementById('email').value='askapriyanka@gmail.com'");
         java.executeScript("document.getElementById('pass').value='priyavenkat'");
         WebElement click=driver.findElement(By.xpath("//button[@name='login']"));
         java.executeScript("arguments[0].click()", click);
         		
	}

}
