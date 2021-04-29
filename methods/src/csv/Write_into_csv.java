package csv;

import java.io.FileWriter;

import com.opencsv.CSVWriter;


public class Write_into_csv {

	public static void main(String[] args) throws Exception {
                 FileWriter file=new FileWriter("src\\csv\\output.csv");
                 System.out.println("file created");
                 
                 CSVWriter write=new CSVWriter(file);
                 
                 String entry1[]= {"Products","Price"};
                 write.writeNext(entry1);
                 System.out.println("data store");
                 
                 String entry2[]= {"Samsung","25000"};
                 write.writeNext(entry2);
                 
                 String entry3[]= {"Oppo","15000"};
                 write.writeNext(entry3);
                 
                 String entry4[]= {"Oneplus","35000"};
                 write.writeNext(entry4);
                 //To save data
                 write.close();
	}

}
