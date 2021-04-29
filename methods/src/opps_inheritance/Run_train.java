package opps_inheritance;

public class Run_train {

	public static void main(String[] args) throws Exception {
          Run_test run=new Run_test();
          run.Launch_browser("firefox", "https://www.cleartrip.com/trains", 20);
          run.Search_Trains();
          run.close_driver();
	}

}
