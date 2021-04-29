package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_alert {

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/r.php");
	        JavascriptExecutor java=((JavascriptExecutor)driver);
	        java.executeScript("alert('login page displayed')");
	        Thread.sleep(5000);
	        driver.switchTo().alert().accept();
	       
	}

}
