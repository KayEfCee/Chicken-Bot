package kayefcee.ChickenBot;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;



public class ChickenBot {
    public static JDA jda;
    public static String botPrefix = "ch!";
    
    // Main Method
    public static void main(String[] args) throws LoginException {
      jda =  new JDABuilder(AccountType.BOT).setToken("InsertTokenHere").buildAsync();
     jda.getPresence().setStatus(OnlineStatus.IDLE);
     jda.getPresence().setGame(Game.listening("annoying humans."));
     
     jda.addEventListener(new Commands());
     jda.addEventListener(new ClearCommand());
     jda.addEventListener(new MoreCommands());
     jda.addEventListener(new EvenMoreCommands());
    }
}

