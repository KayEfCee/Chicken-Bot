// Commands Class
package kayefcee.ChickenBot;


import java.util.List;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	// Waits for message to be sent, then executes method.
    public void onGuildMessageReceived(GuildMessageReceivedEvent event ) {
    	String[] args = event.getMessage().getContentRaw().split("\\s+");
    	
    	// Looks for ch!greet and ignores caps
    	if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "greet")) {

    		// Sends typing message then sends message.
    		event.getChannel().sendTyping().queue();
    		event.getChannel().sendMessage("Hey there! I'm Chicken Bot!").queue();
    	}
    	 // Looks for ch!info then creates embed
    	if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "info")) {
    		EmbedBuilder info = new EmbedBuilder();
    		info.setTitle("🐓 Chicken Bot Information🐣");
    		info.setDescription("Created especially for Discord hack week! An entertainment bot for the whole family! Unless...."
    		+ " it's just you and you have no family. Also if your dad left to buy something at the gas station and hasn't returned in 15 years..");
    		
    		info.addField("Date Created", "Created on June 24, 2019", false);
    		info.addField("Language", "Created using Java in Eclipse", false);
    		info.addField("Version",  "1.5.0", false);
    		info.setThumbnail("https://cdn.discordapp.com/avatars/592514373898076170/a54fe8ce76929aa25c861c152c0c55df.jpg?size=2048");
    		info.setColor(0x429ef4);
    		info.setFooter("Programmed and created by KayEfCee#7545", "https://cdn.discordapp.com/avatars/459901085931536395/1a971ea38913983219783276254eec26.jpg?size=2048");
    		
    		event.getChannel().sendTyping().queue();
    		event.getChannel().sendMessage(info.build()).queue();
    		info.clear();
    	}
    	 
    	   // Looks for ch!help and sends all commands 
    	if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "help")) {
	 		
    		
    		event.getChannel().sendTyping().queue();
    		event.getChannel().sendMessage("So far, all commands are: ch!greet, ch!info, ch!clear (number), ch!say (message), ch!dog, ch!mc (yes or no question.), ch!meme, ch!userinfo (@mention [optional]), and ch!mute (@mention). KayEfCee is working her hardest to keep this bot up to date and add more commands and features! Thank you for using Chicken Bot!").queue();
    	}
    	
    	    // Looks for ch!say then says second argument
          if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "say")) {
        	  
			if (args.length < 2) {
     			 EmbedBuilder using = new EmbedBuilder();
     			using.setColor(0xff2923);
  				using.setTitle("🚨Chicken Bot can't speak for itself!🚨");
  				using.setDescription("You need to specify the message on what to say!");
  				event.getChannel().sendTyping().queue();
  				event.getChannel().sendMessage(using.build()).queue();
  				event.getChannel().sendTyping().queue();
  				event.getChannel().sendMessage("Correct usage: ch!say (message)").queue();
  				using.clear();
  				
     		 } else {
     			  try {
     				  
     			  // From this message to end of .java file, there are purposeful errors to continue if, else, try and catch train.
     			event.getChannel().sendMessage("c").queue();
     			List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt("2")).complete();
    			event.getChannel().deleteMessages(messages).queue();
    			event.getChannel().sendTyping().queue();
    			event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9] + " " + args[10]).queue();
     			  

     			  
     			  } catch (java.lang.ArrayIndexOutOfBoundsException a) {
     				  if (a.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds")) {
     					  
     					
     	    			event.getChannel().sendTyping().queue();
     	    			event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8] + " " + args[9]).queue();
     	    			
     				  } else {
     				       try {
     				    	  
      	    			event.getChannel().sendTyping().queue();
      	    			event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7] + " " + args[8]).queue();
      	    			
     				       } catch (java.lang.ArrayIndexOutOfBoundsException b) {
     				    	  if (b.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
     				    		  
      				    		
      	     	    
      				    	  }  else {
      				    		  try {
      				    			event.getChannel().sendTyping().queue();
         	     	    			 event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6] + " " + args[7]).queue();
      				    		  } catch(java.lang.ArrayIndexOutOfBoundsException c) {
      				    			if (c.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      				    				
      				    			} else {
      				    				try {
      				    					event.getChannel().sendTyping().queue();
      	         	     	    			 event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5] + " " + args[6]).queue();
      				    				} catch(java.lang.ArrayIndexOutOfBoundsException d) {
      				    					if (d.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      				    						
      				    					} else {
      				    						try {
      				    							event.getChannel().sendTyping().queue();
      	      	         	     	    			 event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4] + " " + args[5]).queue();
      				    						} catch(java.lang.ArrayIndexOutOfBoundsException e) {
      				    							if (e.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      				    								
      				    							} else {
      			      				    				try {
      			      				    					event.getChannel().sendTyping().queue();
      			      	         	     	    			 event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3] + " " + args[4]).queue();
      			      				    				} catch(java.lang.ArrayIndexOutOfBoundsException f) {
      			      				    					if (f.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      			      				    						
      			      				    					} else {
      			            				    				try {
      			            				    					event.getChannel().sendTyping().queue();
      			            	         	     	    			 event.getChannel().sendMessage(args[1] + " " + args[2] + " " + args[3]).queue();
      			            				    				} catch(java.lang.ArrayIndexOutOfBoundsException g) {
      			            				    					if (g.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      			            				    						
      			            				    					} else {
      			            				    						try {
      	      			            				    					event.getChannel().sendTyping().queue();
      	      			            	         	     	    			 event.getChannel().sendMessage(args[1] + " " + args[2]).queue();
      	      			            				    				} catch(java.lang.ArrayIndexOutOfBoundsException h) {
      	      			            				    					if (h.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      	      			            				    						
      	      			            				    					} else {
      	      			            				    					  try {
      	        			            				    					event.getChannel().sendTyping().queue();
      	        			            	         	     	    			 event.getChannel().sendMessage(args[1]).queue();
      	        			            				    				} catch(java.lang.ArrayIndexOutOfBoundsException i) {
      	        			            				    					if (i.toString().startsWith("java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds")) {
      	        			            				    						
      	        			            				    					}
      	      			            				    					}
      			            				    					}
      			            				    	
      			            				    				}
      				    						}
      				    					}
      				    				}
      				    			}
      				    		  }
      				    	  }
      				    		
     				    	  }
     				    	  
     				       }
     				  }

     			  }
    			}
     		 
     			  }
      		
      			 
      		 
			   
    		
    	
    		
    	}
          }
    }
}
    }
}
