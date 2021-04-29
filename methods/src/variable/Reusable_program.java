package variable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_program 
{
	WebDriver driver=null;
	String Driver_path=null;
	String url=null;
	String username=null;
	String password=null;
	
	public void launch_chrome()
	{
		System.setProperty("webdriver.chrome.driver",Driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		public void user_login() 
		{
			WebElement email=driver.findElement(Reusable_method.login_email);
			email.clear();
			email.sendKeys(username);
			
			driver.findElement(Reusable_method.next_button).click();
			WebElement passw=driver.findElement(Reusable_method.login_password);
			passw.clear();
			passw.sendKeys(password);
			driver.findElement(Reusable_method.next_password).click();
			
		}

}
