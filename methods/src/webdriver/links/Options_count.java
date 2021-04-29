package webdriver.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options_count {

	public static void main(String[] args) {
             System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
             driver.manage().window().maximize();
             new Select(driver.findElement(By.id("customState"))).selectByIndex(35);
             Select city=new Select(driver.findElement(By.id("customCity")));
             int count=city.getOptions().size();
           if(count > 3)
           {
        	   System.out.println("Tesecase Pass:Has the state contains four cities");
           }
           else
           {
        	   System.out.println("Testcase Fail:State may contain morethen four cities");
           }
             driver.close();
             
	}

}
