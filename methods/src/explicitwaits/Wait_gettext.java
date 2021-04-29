package explicitwaits;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_gettext {

	public static void main(String[] args)
	
	{  ChromeOptions opt=new ChromeOptions();
       opt.addArguments("start-maximized");
    
               System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
               WebDriver driver=new ChromeDriver(opt);
               driver.get("https://www.facebook.com");
               
               WebElement email=driver.findElement(By.cssSelector("input[id='email']"));
               email.clear();
               email.sendKeys("askapriyanka@gmail.com");
               By location=By.id("email");
               WebDriverWait wait=new WebDriverWait(driver, 50);
               wait.until(ExpectedConditions.attributeToBe(location, "data-testid", "royal_email"));
               System.out.println("text displayed");
               
               
        
             
             
	}

}
