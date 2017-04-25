
public class config {
	public static void main(String[] args) throws Exception {
		
		getTwitchChat bot = new getTwitchChat();
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv", 6667, "oauth:ej3wf2c1r0f9f9u3w4cidj4ywtrgdr");
		bot.joinChannel("#yung_jrobes");
		bot.getName();
		
		bot.sendMessage("#yung_jrobes", "Hello fellow Humans");
		
	}
	
}
