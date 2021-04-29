package case_name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcommands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.cleartrip.com/");
		Driver.manage().window().maximize();
		String Pagetitle=Driver.getTitle();
		System.out.println(Pagetitle);
		String Expectedtitle="#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.";
		if(Pagetitle.equals(Expectedtitle))
			System.out.println("Test pass");
		else
			System.out.println("Test Fail");
		String Pageurl=Driver.getCurrentUrl();
		System.out.println(Pageurl);
		String ExpectedPageurl="https://www.cleartrip.com/";
		if(Pageurl.equals(ExpectedPageurl))
			System.out.println("page url test is pass");
		else
			System.out.println("pageurl test is failed");

		String PGsource=Driver.getPageSource();
		System.out.println(PGsource);
		String Windowid=Driver.getWindowHandle();
		System.out.println(Windowid);
	}

}
