import java.awt.*;

public class Main {
	static getTwitchChat handy = new getTwitchChat();
	static Program prog = new Program();
	static Robot robot1;
	public static void main(String[] args) throws Exception {
		
		try {
			robot1 = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		handy.setRobot(robot1);
		
		getTwitchChat bot = new getTwitchChat();
		
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, "oauth:0y7fkb2vu7aj9xojlh6beivb0k51bt");
		bot.joinChannel("#yung_jrobes");
		bot.getName();
		bot.sendMessage("#yung_jrobes", "Type help if you need me to explain");
		
	}
	

	
}
