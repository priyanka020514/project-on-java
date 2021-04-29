package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser {

	public Chrome_browser() {
	}

	public static void main(String[] args) {
    
    System.setProperty("webdriver.chrome.Driver", "Drivers\\chromedriver.exe");
    ChromeDriver chrome=new ChromeDriver();
   
   chrome.get("http://google.co.in");
   System.out.println("chrome.gettitle()");
   chrome.close();
		
    
           
	}

	
}
