package csv;


import java.io.FileReader;
import java.util.Iterator;

import com.opencsv.CSVReader;

public class Read_with_iterator {

	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("D:\\selenium_workspace\\methods\\src\\csv\\details.csv");
        System.out.println("file created");
        //get file into csv
        CSVReader read=new CSVReader(file);
       //iterator
        Iterator<String[]> itr=read.iterator();
        while (itr.hasNext()) {
        	String record[]=itr.next();
        	System.out.println(record[0]+""+record[1]);
			
			
		}
        
	}

}
