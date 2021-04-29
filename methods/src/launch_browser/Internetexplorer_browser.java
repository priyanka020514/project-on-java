package launch_browser;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer_browser {

	public static void main(String[] args) {
       System.setProperty("webdriver.ie.driver","Drivers\\IEDriverServer.exe");
       
        InternetExplorerDriver ie=new InternetExplorerDriver();
        
		ie.get("https://www.facebook.com");
		     System.out.println(ie.getTitle());
		     ie.close();
		     
		     
		
		    
		
		
		
		
		
	}

}
