package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_selection {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.hdfcbank.com/branch-atm-locator");
        JavascriptExecutor java=((JavascriptExecutor)driver);
        java.executeScript("document.getElementById('amenity_category_order_types50').checked='checked'");
        WebElement check=driver.findElement(By.xpath("//label[.='Retail Loan Branch']"));
        java.executeScript("arguments[0].click()",check);
        java.executeScript("arguments[0].scrollIntoView(true)", check);
        
        
	}

}
