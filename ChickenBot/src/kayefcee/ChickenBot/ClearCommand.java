package kayefcee.ChickenBot;




import java.util.List;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ClearCommand extends ListenerAdapter {
     public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
    	 String[] args = event.getMessage().getContentRaw().split("\\s+");
    	 
    	 if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "clear")) {
    		 if (args.length < 2) {
    			 EmbedBuilder using = new EmbedBuilder();
    			using.setColor(0xff2923);
 				using.setTitle("🚨Chicken Bot needs the numbers!🚨");
 				using.setDescription("You need to specify the amount to delete!");
 				event.getChannel().sendTyping().queue();
 				event.getChannel().sendMessage(using.build()).queue();
 				using.clear();
    		 } else {
    			 try {
    				 List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
    	    			event.getChannel().deleteMessages(messages).queue();
    	    			
    	    			// Correctly Runs then mentions who did it and how many messages were removed.
    	 
    	 				event.getChannel().sendTyping().queue();
    	 				event.getChannel().sendMessage("✅Chicken Bot has successfully deleted " + args[1] + " messages by " + event.getMember().getUser().getAsMention() + "!✅").queue();
    	    				
    			 }
    			 catch (IllegalArgumentException a) {
    				if (a.toString().startsWith("java.lang.IllegalArgumentException: Message retrieval")) {
    				
    				  // If too many messages 
    				EmbedBuilder error = new EmbedBuilder();
    				error.setColor(0xff2923);
    				error.setTitle("🚨 Chicken Bot is too weak!🚨");
    				error.setDescription("Only 1-100 messages can be deleted!");
    				event.getChannel().sendTyping().queue();
    				event.getChannel().sendMessage(error.build()).queue();
    			  error.clear();
    	
    			 } else {
    			    	// If Message is invalid 
    			    	EmbedBuilder error = new EmbedBuilder();
    			    	error.setColor(0xff2923);
        				error.setTitle("🚨Chicken Bot doesn't know what that means!🚨");
        				error.setDescription("This error appears when you typed an invalid integer (decimals), enter 1 message to clear (which is useless since I would only delete the ch!clear message), or didn't specify your number correctly! Correct usage: ch!clear (number)");
        				event.getChannel().sendTyping().queue();
        				event.getChannel().sendMessage(error.build()).queue();
        				
        				
    			 }
    		 }
    		 
    		 
    	 
    	 }
     }
}

	
	}
