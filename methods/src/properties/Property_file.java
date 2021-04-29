package properties;

import java.io.FileInputStream;
import java.util.Properties;


public class Property_file {

	public static void main(String[] args) throws Exception {
      FileInputStream file=new FileInputStream("src\\properties\\facebook.properties");
      System.out.println("file created");
      
      Properties repository=new Properties();
      repository.load(file);
      
     String url=repository.getProperty("URL");
     System.out.println(url);
      
     String email=repository.getProperty("EMAIL");
     System.out.println(email);
     
     String pass=repository.getProperty("PASSWORD");
     System.out.println(pass);
	}

}
