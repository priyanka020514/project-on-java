package robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Robot_into {

	public static void main(String[] args) throws Exception
	{
         
            Runtime.getRuntime().exec("notepad.exe");
            Thread.sleep(5000);
            Robot rob=new Robot();
            rob.setAutoDelay(1000);
            rob.keyPress(KeyEvent.VK_H);
            rob.keyPress(KeyEvent.VK_A);
            rob.keyPress(KeyEvent.VK_S);
            rob.keyPress(KeyEvent.VK_V);
            rob.keyPress(KeyEvent.VK_I);
            rob.keyPress(KeyEvent.VK_T);
            rob.keyPress(KeyEvent.VK_H);
            rob.keyPress(KeyEvent.VK_SPACE);
            rob.keyPress(KeyEvent.VK_K);
            rob.keyPress(KeyEvent.VK_U);
            rob.keyPress(KeyEvent.VK_S);
            rob.keyPress(KeyEvent.VK_H);
            rob.keyPress(KeyEvent.VK_I);
            rob.keyPress(KeyEvent.VK_T);
            rob.keyPress(KeyEvent.VK_H);
	}

}
