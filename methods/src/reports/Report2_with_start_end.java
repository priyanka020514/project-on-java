package reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report2_with_start_end {

	public static void main(String[] args) {
            String reportpath="D:\\selenium_workspace\\methods\\Reports\\result3.html";
            ExtentReports report=new ExtentReports(reportpath, true);
            
            ExtentTest test1=report.startTest("TC_valid_login");
                 test1.log(LogStatus.INFO, "browser launched");
                 test1.log(LogStatus.INFO, "launch url");
                 test1.log(LogStatus.INFO, "facebook.com");
                 test1.log(LogStatus.INFO, "valid email");
                 test1.log(LogStatus.INFO, "valid password");
                 test1.log(LogStatus.INFO, "click login");
                 test1.log(LogStatus.PASS, "click logout");
                 
                 report.endTest(test1);
                 
                 ExtentTest test2=report.startTest("TC_invalid_login");
                 test2.log(LogStatus.INFO, "browser launched");
                 test2.log(LogStatus.INFO, "launch url");
                 test2.log(LogStatus.INFO, "facebook.com");
                 test2.log(LogStatus.INFO, "invalid email");
                 test2.log(LogStatus.INFO, "error message display");
                 test2.log(LogStatus.FAIL, "click login");
                 
                 report.endTest(test2);
                 
                ExtentTest login=report.startTest("Logins");
                
                report.endTest(login);
                
                login.appendChild(test1).appendChild(test2);
                 
                 report.flush();
                 
                 
	}

}
