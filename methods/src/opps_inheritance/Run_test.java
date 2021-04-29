package opps_inheritance;



public class Run_test extends Reusable_keywords_webelement_inheritance 
{

	 public void Launch_browser(String browser, String url, int time_in_sec)
     {
    	 launch_browser(browser);
    	 create_webpage(url);
    	 implicitly_wait(time_in_sec);
    	 explicitly_wait(time_in_sec);
     }
     public void Search_Trains() throws Exception 
     {
    	 Page_cleartrip_trains sf_trains=new Page_cleartrip_trains(driver);
    	 sf_trains.search_trains();
    	 sf_trains.verify_title();
    	 
     }
	public void close_driver()
	{
		driver.close();
	}
}
