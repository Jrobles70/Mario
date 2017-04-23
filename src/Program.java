import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Program {

	private Robot robot;

	public void jump() {

		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		robot.keyPress(KeyEvent.VK_F);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_F);
	}

	public void switchFocus() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_TAB);
			r.delay(500);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}

	public void pause() {
		try {
			Robot p = new Robot();
			p.delay(500);
			p.keyPress(KeyEvent.VK_P);
			p.delay(200);
			p.keyRelease(KeyEvent.VK_P);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
}
