package explicitwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility_options {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
	       opt.addArguments("start-maximized");
	    
	               System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	               WebDriver driver=new ChromeDriver(opt);
	               driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	               driver.get("http://www.cleartrip.com");
	               Thread.sleep(5000);
	              WebElement link=driver.findElement(By.xpath("//strong[contains(.,'More options:')]"));
	               WebDriverWait wait=new WebDriverWait(driver, 50);
	               link.click();
	               WebElement locator=driver.findElement(By.xpath("//select[@id='Class']"));
	               wait.until(ExpectedConditions.visibilityOf(locator));
	               System.out.println("visible at webpage");
	               By select=By.xpath("//input[@name='airline']");
	               wait.until(ExpectedConditions.visibilityOfElementLocated(select));
	               System.out.println("preferred airlines displayed");
	               
	}

}
