package launch_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_browser {

	public Firefox_browser() {
		
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.geckodriver.driver","Drivers\\geckodriver.exe");
		
		FirefoxDriver fire=new FirefoxDriver();
		
		fire.get("https://github.com/sunilreddyg");
		
		System.out.println(fire.getTitle());
		
		fire.close();
        
         
	}

}
