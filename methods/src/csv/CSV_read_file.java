package csv;


import java.io.FileReader;

import com.opencsv.CSVReader;

public class CSV_read_file {

	public static void main(String[] args) throws Exception {
              FileReader file=new FileReader("D:\\selenium_workspace\\methods\\src\\csv\\details.csv");
              System.out.println("file created");
              //get file into csv
              CSVReader read=new CSVReader(file);
             String head[]=read.readNext();
              System.out.println(head[0]+" "+head[1]);
             String entry1[]=read.readNext();
             System.out.println(entry1[0]+"/t"+entry1[1]);
            
             String entries[];
             while ((entries=read.readNext())!=null)
             {
            	 
				System.out.println(entries[0]+""+entries[1]);
			}
				
			}
				
			
	}


