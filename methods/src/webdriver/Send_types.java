package webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_types {

	public static void main(String[] args) throws Exception {
     System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://facebook.com");
		
		driver.manage().window().fullscreen();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("askapriyanka@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("priyavenkat",Keys.ENTER);
		
		
		
		driver.close();
      
      
	}

}
