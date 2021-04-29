package verfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_get_title {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		String act_title=driver.getTitle();
		String Exp_title="Facebook – log in or sign up";
		
		if(act_title.equalsIgnoreCase(Exp_title))
		{
			System.out.println("Page title verified");
			WebElement det=driver.findElement(By.id("email"));
			det.clear();
			det.sendKeys("askapriyanka@gmail.com");
		}
		else
			System.out.println("Page title mismatch");
		driver.close();

	}

}
