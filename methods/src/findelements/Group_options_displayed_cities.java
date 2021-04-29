package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Group_options_displayed_cities {

	public static void main(String[] args) throws Exception 
	{
         System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.navigate().to("https://v1.hdfcbank.com/branch-atm-locator");
         String Exp_cities[]= {
        		 "Please select state first",
        		 "Port Blair",
        		  "Amalapuram",
        		  "Naharlagun",
        		  "Biswanath Chariali",
        		  "Aurangabad",
        		  "Chandigarh",
        		  "Baikunthpur",
        		  "Naroli",
        		  "kushith",
        		  "New Delhi"
         };
       WebElement Select_state=driver.findElement(By.id("customState"));
      List<WebElement>state=Select_state.findElements(By.tagName("option"));
      
      for (int i = 0; i <=10; i++)
      {
		WebElement eachstate=state.get(i);
		String statename=eachstate.getText();
		System.out.println(statename);
		eachstate.click();
		Thread.sleep(5000);
		WebElement eachcity=driver.findElement(By.id("customCity"));
		String cityname=eachcity.getText();
		System.out.println(cityname);
		
		if(cityname.contains(Exp_cities[i]))
		{
			new Select(eachcity).selectByVisibleText(Exp_cities[i]);
			System.out.println("state--"+statename+"Expected cities--"+Exp_cities[i]);
		}
			else
			{
			    System.out.println("Expected city not displayed--"+Exp_cities[i]);	
			}
			
		
	}
	}

}
