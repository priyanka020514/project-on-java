package webdriver.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First_element {

	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("More options:")).click();
		Thread.sleep(4000);
		Select  Classtype= new Select(driver.findElement(By.id("Class")));
	    Classtype.selectByIndex(3);
		Classtype.selectByIndex(0);
		Classtype.selectByIndex(1);
		String OptionName=Classtype.getFirstSelectedOption().getText();
		 System.out.println("Print Class Type"+OptionName);
		
		 if(OptionName.equals("Business"))
		 
		 {
			 System.out.println("Testcase Pass:Required class type selected");
			 
		 }
		 else
		 {
			 System.out.println("Test case fail:Class type does not match the requirement");
		 }
		 
		 Thread.sleep(5000);
		 
		 driver.close();
			 
		 
	}
}


