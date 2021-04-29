package verfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_get_url {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		String act_url=driver.getCurrentUrl();
		String exp_url="https://www.facebook.com/";
		if(act_url.contains(exp_url))
		{
			System.out.println("page url verified");
			WebElement det1=driver.findElement(By.id("email"));
			det1.clear();
			det1.sendKeys("venkatesh.perumala@gmail.com");
		}
		else
			System.out.println("Page url mismatch");
		driver.close();
		
		
	}

}
