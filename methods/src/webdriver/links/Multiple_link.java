package webdriver.links;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_link {

	public static void main(String[] args) throws Exception {
		
         System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://v1.hdfcbank.com/branch-atm-locator/?lat=17.3720183&long=78.5327318&shared=1");
         driver.manage().window().maximize();
        boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
        System.out.println("Dropdown Multiple Selection State is---->"+flag);
	    ((JavascriptExecutor)driver).executeScript
	    ("document.getElementById('customState').setAttribute('multiple','multiple')");
	    Thread.sleep(5000);
	     boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
	     System.out.println("Dropdown Multiple Selection State is--->"+flag1);
	     if(flag1=true)
	     {
	    	Select dropdown=new Select(driver.findElement(By.id("customState")));
	    	dropdown.deselectAll();
	    	dropdown.selectByValue("andhra-pradesh");
	    	dropdown.selectByVisibleText("Delhi");
            dropdown.selectByIndex(11);
	     }
	     else
	     {
	    	 System.out.println("Dropdown is not a Multiple Selection type");
	     }

	}
}