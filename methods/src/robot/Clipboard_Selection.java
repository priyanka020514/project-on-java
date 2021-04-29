package robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Clipboard_Selection {

	public static void main(String[] args) throws Exception
	{
		//Run Notepad executable file [This action open notepad file]
           Runtime.getRuntime().exec("notepad.exe");
           Thread.sleep(5000);
           //Text to copy
           String text="Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms. You can use multiple programming languages like Java, C#, Python etc to create Selenium Test Scripts. Testing done using the Selenium testing tool is usually referred to as Selenium Testing.\r\n" + 
           		"\r\n";
         //Copy required string
           StringSelection Ctext=new StringSelection(text);
         //Enable Default system clipboard
         Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
         //save clipboard
         clip.setContents(Ctext, Ctext);
       //Create object for robot
         Robot rob=new Robot();
         rob.setAutoDelay(2000);
         rob.keyPress(KeyEvent.VK_CONTROL);
         rob.keyPress(KeyEvent.VK_V);
         //save
         rob.keyPress(KeyEvent.VK_S);
         
         //save content into path
        String Spath="D:\\selenium_workspace\\methods\\src\\robot\\sel.txt";
        StringSelection Stext=new StringSelection(Spath);
        clip.setContents(Stext, Stext);
        
        //Press cntrl+V to paste Selected String
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        rob.keyPress(KeyEvent.VK_ENTER);
        //release
        rob.keyRelease(KeyEvent.VK_CONTROL);
        
         
           
           
           
	}

}
