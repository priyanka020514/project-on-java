package verfication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_getattribute {

	public static void main(String[] args) throws Exception
	{   
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		String act_title=driver.getTitle();
		System.out.println("Print the title"+act_title);
		
		String act_url=driver.getCurrentUrl();
		System.out.println("Print the url"+act_url);
		
		WebElement oneway_sbtn=driver.findElement(By.xpath("(//label[.='One Way'])"));
		oneway_sbtn.click();
		String oneway_sbtn_class=oneway_sbtn.getAttribute("class");
		Thread.sleep(5000);
		if(oneway_sbtn_class.equals("select-label"))
		{
			System.out.println("Verified oneway selection");
			
			WebElement ret_date=driver.findElement(By.xpath("(//input[@readonly='readonly'])[3]"));
			ret_date.click();
			Thread.sleep(4000);
			
			WebElement round_trip=driver.findElement(By.xpath("(//label[.='Round Trip'])"));
			String round_trip_class=round_trip.getAttribute("class");
			if(round_trip_class.equals("select-label"))
				System.out.println("Test Pass:Roundtrip selected");
			
			else
				System.out.println("Test fail: As round trip doesn't selected");
		}
				
		

	}

}
