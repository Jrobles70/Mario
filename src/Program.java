import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Program {

	public void jump(Robot robot) {

		robot.keyPress(KeyEvent.VK_F);
		robot.delay(100);
		robot.keyRelease(KeyEvent.VK_F);
	}

	public void switchFocus(Robot robot) {

		robot.mouseMove(200, 10);
		robot.mousePress(KeyEvent.BUTTON1_MASK);
		robot.mouseRelease(KeyEvent.BUTTON1_MASK);
		robot.delay(1000);

		
		
	}

	public void pause(Robot robot) {

			robot.delay(100);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(200);
			robot.keyRelease(KeyEvent.VK_ENTER);

		
	}
	
	public void right(Robot robot) {
		robot.keyPress(KeyEvent.VK_C);
	
}
}
