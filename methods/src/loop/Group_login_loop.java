package loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Group_login_loop {

	public static void main(String[] args) throws Exception
	{
        System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        
        String userids[][]= {
        		{"hasvitn@gmail.com","hassu@05"},
        		{"kushith@gmail.com","kushu@14"},
        		{"venkatesh.perumal","venkat@02"},
        		{"askapriyanka@gmail.com","priyavenkat"}
        		  };
        for (int i = 0; i < userids.length; i++)
        {
        	String ids=userids[i][0];
           WebElement email=driver.findElement(By.id("email"));
           email.clear();
           email.sendKeys(ids);
           
           Thread.sleep(3000);
           String pass=userids[i][1];
           WebElement passw=driver.findElement(By.id("pass"));
           passw.clear();
           passw.sendKeys(pass);
          WebElement login=driver.findElement(By.xpath("//button[.='Log In']"));
          login.click();
          String log=driver.getTitle();
          Thread.sleep(5000);
          System.out.println(log);
           if(ExpectedConditions.titleContains("Facebook").apply(driver))
           {Thread.sleep(5000);
           driver.findElement(By.xpath("//i[contains(@class,'hu5pjgll lzf7d6o1 sp_T5iK7Jqp5KW sx_d73483')]")).click();
           driver.findElement(By.xpath("//span[.='Log Out']")).click();
           }
           driver.navigate().back();
          
			
		
			
		
			
		}
		}
        
        
	}


