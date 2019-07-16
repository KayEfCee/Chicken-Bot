package kayefcee.ChickenBot;






import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EvenMoreCommands extends ListenerAdapter {
	

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
	 
		if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "mute")) {
			Member mutingPlayer = event.getMember();
			Member mutedPlayer = event.getMessage().getMentionedMembers().get(0);
			Role mutedRole = event.getGuild().getRoleById("598691211922112553");
			Role moderator = event.getGuild().getRoleById("598641782665904161");		
			
			if (args.length < 3 && args.length > 1) {
				
			
			
			if (!mutingPlayer.getRoles().contains(moderator)) {
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage("You fool! You don't have permission to do that!").queue();
			} else {
				
				if (!mutedPlayer.getRoles().contains(moderator)) {
				      if (!mutedPlayer.getRoles().contains(mutedRole)) {
				    	 // Mute user 
				    	 event.getChannel().sendTyping().queue();
				    	 event.getChannel().sendMessage("Successfully muted " + args[1] + "!").queue();
				    	 event.getGuild().getController().addRolesToMember(mutedPlayer, mutedRole).complete();
				    	 
				      } else {
				    	  // Unmute user
				    	  event.getChannel().sendTyping().queue();
					    	 event.getChannel().sendMessage("Successfully unmuted " + args[1] + "!").queue();
					    	 event.getGuild().getController().removeRolesFromMember(mutedPlayer, mutedRole).complete();
				      }
					
				} else {
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage("You cannot mute this player! They are a moderator too!").queue();
				
				}
			}
			
		} 
			if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "calculator")) {
				
				
				
			}
			
				
			
					
			 
			
			
		
		}
}
	}
