package reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Report1_normal {

	public static void main(String[] args) 
	{
          String reportpath="D:\\selenium_workspace\\methods\\Reports\\result1.html";
          ExtentReports report=new ExtentReports(reportpath, true);
          
          report.flush();
	}

}
