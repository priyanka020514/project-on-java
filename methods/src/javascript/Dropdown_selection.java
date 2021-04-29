package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_selection {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");
        JavascriptExecutor java=((JavascriptExecutor)driver);
        
        java.executeScript("document.getElementById('day').value='5'");
        java.executeScript("document.getElementById('month').selectedIndex='7'");
        java.executeScript("document.getElementById('year').selectedIndex='9'");
        WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        java.executeScript("arguments[0].click()", radio);
	}

}
