package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_text {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.hdfcbank.com/branch-atm-locator");
        Thread.sleep(5000);
        JavascriptExecutor java=((JavascriptExecutor)driver);
        WebElement img=driver.findElement(By.xpath("//span[.='WHAT ARE YOU LOOKING FOR?']"));
        java.executeScript("arguments[0].style.backgroundColor='red'", img);
        java.executeScript("arguments[0].style.fontColor='black'", img);
        
        
	}

}
