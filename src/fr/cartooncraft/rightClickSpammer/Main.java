package fr.cartooncraft.rightClickSpammer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Main {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		while(true) {
			Thread.sleep(3000);
			r.mousePress(InputEvent.BUTTON3_MASK);
			r.mouseRelease(InputEvent.BUTTON3_MASK);
		}
	}
}
