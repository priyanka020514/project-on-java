package properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.util.Properties;

public class Property_output {

	public static void main(String[] args) 
	{
         Properties rep=new Properties();
         rep.setProperty("TV", "inches");
         rep.setProperty("SONY", "45");
         rep.setProperty("SAMSUNG", "55");
         rep.setProperty("LG", "50");
         FileOutputStream file;
		try {
			file = new FileOutputStream("src\\properties\\out.properties");
	         System.out.println("file created");
             rep.store(file, "TV_Detials");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
         
           
	}

}
