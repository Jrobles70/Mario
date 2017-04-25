import org.jibble.pircbot.*;
import java.awt.Robot;

public class getTwitchChat extends PircBot  {
	static Program prog = new Program();
	static Robot robot1;

	public void setRobot(Robot newRobot){
		robot1 = newRobot;
	}
	
	public getTwitchChat() {
		this.setName("HandyBotMan");
		this.isConnected();
		
	}
	
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		
		//prog.switchFocus(robot1);
		//this.sendMessage("#anton_zedlavski", "Shut your dirty mouth " + sender);

		if(message.equals("stop")){
			this.sendMessage("#yung_jrobes", "Disconnecting");
			this.disconnect();
		}
		if(message.equals("help")){
			//this.sendMessage("#yung_jrobes", "Wow, " + sender + " yous a stupid bitch");
			this.sendMessage("#yung_jrobes", "Type jump to jump and type right to go right. Thats all weve got right now. Cause were in alpha");

		}
		if(message.equals("jump")){
			this.sendMessage("#yung_jrobes", "Jumping");
			prog.switchFocus(robot1);
			prog.jump(robot1);
		}
		if(message.equals("pause")){
			this.sendMessage("#yung_jrobes", "Pausing");
			prog.switchFocus(robot1);
			prog.pause(robot1);
		}
		if(message.equals("right")){
			this.sendMessage("#yung_jrobes", "Going right");
			prog.switchFocus(robot1);
			prog.right(robot1);
		}

		}
	

	}

