
package kayefcee.ChickenBot;

import java.util.Random;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MoreCommands extends ListenerAdapter {

	
	
String[] magicChickenResponses = {
		"Yes.",
		"No.",
		"Maybe some day.",
		"Most likely.",
		"Of course.",
		"Of course not.",
		"Possibly.",
		"Try asking again later.",
		"Sure."
		
};
	
	
	
	
	
String[] memeImages =  {
		"https://preview.redd.it/mbhic07pgd931.jpg?width=640&crop=smart&auto=webp&s=2384d3459c5c3966055c885feed56624c3e7ea15",
			"https://preview.redd.it/0t0wk68czc931.jpg?width=640&crop=smart&auto=webp&s=5eb1ba0fdd746fdbe99899d1d2a551c9f8eb97d1",
			"https://external-preview.redd.it/vh1Hm8Wa8XOTsqflNPJG6z9q8_Q02bRf1SuHeaclp-8.jpg?auto=webp&s=9561e94f862ca152b62cf930c5abfeb9e54ca57b",
			"https://i.redd.it/1hyyygnjbc931.jpg",
			"https://preview.redd.it/cbe9the8ic931.jpg?width=640&crop=smart&auto=webp&s=fe3e45014f1b3c9e9b6850108614a8804969211e",
			"https://preview.redd.it/yf5pon7r5c931.jpg?width=640&crop=smart&auto=webp&s=8c1ccc8149c38c430f60e138abb77e1e304007d2",
			"https://preview.redd.it/0ej4y9xj2c931.jpg?width=640&crop=smart&auto=webp&s=5478da090c553fc9e6747c6523ab651e07cdd71c",
			"https://preview.redd.it/d5ebj9gguc931.jpg?width=640&crop=smart&auto=webp&s=e95a1292aa5f991affeec9d03132db0931bfcfde",
			"https://preview.redd.it/fymw67gruc931.jpg?width=640&crop=smart&auto=webp&s=89424b7db311b8be1558e6fac4877b1cd02dd615",
			"https://i.redd.it/hpirgk2ehc931.png",
			"https://preview.redd.it/mp3e1o7e0e931.jpg?width=640&crop=smart&auto=webp&s=54734bff1ed177b3b339b0317bff8da2364cf032",
			"https://preview.redd.it/qwg7jm1mnc931.jpg?width=640&crop=smart&auto=webp&s=d5b26f0041a98f6e0f1b6c96142039c246dab179",
			"https://preview.redd.it/kx7tzbo7md931.png?width=640&crop=smart&auto=webp&s=dad387fc976faea8ba9b4ef84606db3c4b248e58",
			"https://preview.redd.it/9kzkazfysc931.jpg?width=640&crop=smart&auto=webp&s=9aa37ab9307a18c62fcb21e4fa2f5a59ca5fc333",
			"https://preview.redd.it/4pabpnrbuc931.jpg?width=640&crop=smart&auto=webp&s=26f59133348fc0201d6fead0a8d7479f7719978f",
			"https://preview.redd.it/vd6yed1qsa931.jpg?width=640&crop=smart&auto=webp&s=c1b82cfb185d1c4236c47e8eb9e1c12f4edd9a1d",
			"https://preview.redd.it/avlgh0q8qc931.jpg?width=640&crop=smart&auto=webp&s=004e76c4060fb73600751cf029e8048fe93946ea",
			"https://preview.redd.it/al5m5qxi9b931.jpg?width=640&crop=smart&auto=webp&s=d1a2b4e5b00244443ab5e9527a84573a4572dd09",
			"https://preview.redd.it/kymokms4oa931.jpg?width=640&crop=smart&auto=webp&s=26d389df594ef8336a8a6670d37f83032c786a39",
			"https://preview.redd.it/kix77cdwwb931.jpg?width=640&crop=smart&auto=webp&s=259bb8a57c47fbab2fcc157d53c275c74eeabea6",
			"https://preview.redd.it/lz6t9viqtd931.jpg?width=640&crop=smart&auto=webp&s=fc901b0e0fd7752e574b6a4feefef176dc009d4c",
			"https://preview.redd.it/aiig0pxmed931.jpg?width=640&crop=smart&auto=webp&s=49f3606d2667b916bc172d3b7add5026909d0a49",
			"https://preview.redd.it/ccv3fkwh9b931.jpg?width=640&crop=smart&auto=webp&s=a5e2731816d238472bc8cc8c332a946a8095802c",
			"https://preview.redd.it/0ubm01ii4e931.jpg?width=640&crop=smart&auto=webp&s=26425acda07d641d1680de98785b8824ab9b3fb5",
			"https://preview.redd.it/m8qizq6fvb931.jpg?width=640&crop=smart&auto=webp&s=eb6ff5701e48791cd36a0fedeb36079eafe89b44",
			"https://preview.redd.it/vilwdd82yb931.jpg?width=640&crop=smart&auto=webp&s=05383a55be65198f72c22869061b567043038617",
			"https://preview.redd.it/bpmfxrr76c931.jpg?width=640&crop=smart&auto=webp&s=6a2187f57ffb7f6669b82e89ab069b4d0d25fdaf",
			"https://preview.redd.it/ds20rtoewb931.jpg?width=640&crop=smart&auto=webp&s=9025f6bd8b17a0e869cd330de4aaef04eef929c8",
			"https://i.redd.it/ah52x1pu3c931.jpg",
			"https://external-preview.redd.it/Hvxutrsxyh45GPZ6sHrR7Pou6hFbY9qESOX5qq27MF0.jpg?width=640&crop=smart&auto=webp&s=531fe651514f9a6e1dd303b77ed1547532ce1752",
			"https://preview.redd.it/wb08ylb07a931.jpg?width=640&crop=smart&auto=webp&s=2fd57a739cdabb39c30d0907917d4e504379818f",
			"https://preview.redd.it/m0ckd8x4jc931.jpg?width=640&crop=smart&auto=webp&s=8707e3e58d9b40995c71d83073a1db05d91cc6a4",
			"https://preview.redd.it/2at5jfoaob931.jpg?width=640&crop=smart&auto=webp&s=0a7955ede5ed74523787eca43aadffecd0df25f6",
			"https://preview.redd.it/j2prpi50rd931.jpg?width=640&crop=smart&auto=webp&s=098996b53a22eff77ba39d582999eab1520a75b5",
			"https://preview.redd.it/vccmjyz9be931.jpg?width=640&crop=smart&auto=webp&s=0de5400f53b1161915a9b2c75bdcac1e2a196720",
			"https://i.redd.it/qfje054y0a931.jpg",
			"https://preview.redd.it/xb4tt2agr9931.jpg?width=640&crop=smart&auto=webp&s=70d6fe2a191e4d024dc24b96e76203222de2c9c6",
			"https://preview.redd.it/6dnfy5race931.jpg?width=640&crop=smart&auto=webp&s=4f07a506df870067405ea2aec4117ff89bc9dfe6",
			"https://preview.redd.it/8pjyrndkh9931.jpg?width=640&crop=smart&auto=webp&s=d53b8200e199956fd0d6dbbf5323455db93b5ed9",
			"https://preview.redd.it/7mkqi0rude931.jpg?width=640&crop=smart&auto=webp&s=cbb421a84607ee3a3fce11df14cbda51625c8d45",
			"https://preview.redd.it/ym2lk5o15b931.jpg?width=640&crop=smart&auto=webp&s=cb2be34141f897c14d84a9983f2498cda36a0008",
			"https://preview.redd.it/cwm2x0y08c931.jpg?width=640&crop=smart&auto=webp&s=384f85f73dc5d4c1068aa0137695312d8f1a3807",
			"https://preview.redd.it/kwfauneeee931.jpg?width=640&crop=smart&auto=webp&s=2ca651d8d26fad7eb9184d43fa45923acf0824a6",
			"https://preview.redd.it/batrl2w0bd931.jpg?width=640&crop=smart&auto=webp&s=266bf56c1e0c90dca2bdb79f434940e895f8f855", // meh
			"https://preview.redd.it/2un0k5gb19931.png?width=640&crop=smart&auto=webp&s=c33ffb24a33c8de0dad012699a9829f0ee53303a",
			"https://preview.redd.it/co2vlgnxq9931.jpg?width=640&crop=smart&auto=webp&s=9a5beb25420c2340e55af8e528563111bf91651f",
			"https://preview.redd.it/1ek8atkth9931.jpg?width=640&crop=smart&auto=webp&s=9436191e488fe634792875e38df240c83c9af2a3",
			"https://i.redd.it/t0n18njnxc931.jpg",
			"https://preview.redd.it/totajlnenc931.jpg?width=640&crop=smart&auto=webp&s=8de858661ad68dd235d99129ba3bc187bba55dd4",
			"https://preview.redd.it/imz9isgg5b931.jpg?width=640&crop=smart&auto=webp&s=f308360b32b0ed9f1c3d0d4a332c22fd7d6b749a",
			"https://preview.redd.it/uiaaqfqnod931.jpg?width=640&crop=smart&auto=webp&s=c7cb82bd13fbc6f163a14376c7fb4b0bf5d899c2",
			"https://i.redd.it/y43iicgbgc931.jpg",
			"https://i.redd.it/yqx6icqo0b931.jpg",
			"https://preview.redd.it/lncdfrn8lc931.jpg?width=640&crop=smart&auto=webp&s=5f1aa55fbaa30170d6628751d994f0a1d37f048e",
			"https://preview.redd.it/vzrdg2zupd931.jpg?width=640&crop=smart&auto=webp&s=a48faa740a64e21f31ff47b3c9f725e3a66bac42",
			"https://preview.redd.it/z2f3lem1sc931.png?width=640&crop=smart&auto=webp&s=53f314054d9be3f519adc2aaadcaee4807d851d2",
			"https://i.redd.it/jl31jp2u5e931.jpg",
			"https://preview.redd.it/i78ffwsg7e931.jpg?width=640&crop=smart&auto=webp&s=767388866952b79a65f41bd0c9d9dcccabfbb009",
			"https://preview.redd.it/tvxfy3mk4e931.jpg?width=640&crop=smart&auto=webp&s=d96011e081ebf1ff7cae9b3919cda92dee92c8ee",
			"https://preview.redd.it/1a8wa4d659931.jpg?width=640&crop=smart&auto=webp&s=aaa6bda629acc6718722a579534552787c459fd5",
			"https://i.gyazo.com/d4c206a4e3b5912aeb6cbd2d7fc4b636.png",
			"https://i.gyazo.com/1b5cff2e445b96746b8be1742303ad37.png"
			
	};
	
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
	
	    
	    
		 if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "mc")) {
			if (args.length < 2) {
				EmbedBuilder error = new EmbedBuilder();
				
				error.setColor(0xff2923);
				error.setTitle("🚨Chicken Bot needs to know what you asked!!!🚨");
				error.setDescription("You need to specify your yes or no question to ask chicken bot.");
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(error.build()).queue();
				error.clear();
			} else {
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(magicChickenResponses[new Random().nextInt(magicChickenResponses.length)]).queue();
			}
		}
		 // Looks for ch!meme, then randomly returns caption and image.
		if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "meme")) {
			EmbedBuilder memes = new EmbedBuilder();
			memes.setColor(0x448bfc);
			memes.setImage(memeImages[new Random().nextInt(memeImages.length)]);
			memes.setFooter("Images originally from r/memes", "https://d.newsweek.com/en/full/1144653/reddit.png?w=1600&h=1600&l=50&t=40&q=88&f=cf7ea53bb74b2eea62ab5868c1f1ef13");
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(memes.build()).queue();
			memes.clear();
		}
		
		// TODO finish ch!ship command
		if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "ship")) {
			if (args.length < 3) {
				EmbedBuilder error = new EmbedBuilder();
				error.setColor(0xff2923);
		       error.setTitle("🚨Chicken Bot can't ship one or no people!🚨");
				error.setDescription("You need to specify two people for Chicken Bot to ship!");
			    
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(error.build()).queue();
				error.clear();
				
			}
		}
		// Looks for ch!pinfo then gives info about person who executed command.
		if (args[0].equalsIgnoreCase(ChickenBot.botPrefix + "userinfo")) {
			if (args.length < 2) {
			EmbedBuilder userinfo = new EmbedBuilder();
			userinfo.setColor(0x42f46b);
			userinfo.setTitle("Info about " + event.getAuthor().getName());
			userinfo.addField("Online Status", " " + event.getMember().getOnlineStatus(), false);
			userinfo.addField("Nickname", " " + event.getMember().getNickname(), false);
			userinfo.addField("Tag", " "  + event.getAuthor().getAsTag(), false);
			userinfo.addField("ID", " " + event.getAuthor().getId(), false);
			userinfo.addField("Date Created", " " + event.getAuthor().getCreationTime().getMonthValue() + "/" + event.getAuthor().getCreationTime().getDayOfMonth() + "/" + event.getAuthor().getCreationTime().getYear(), false);
			userinfo.setImage(event.getAuthor().getAvatarUrl());
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(userinfo.build()).queue();
			userinfo.clear();
			} else if (args.length == 2) {
				EmbedBuilder userinfo = new EmbedBuilder();
				userinfo.setColor(0x42f46b);
				userinfo.setTitle("Info about " + event.getMessage().getMentionedMembers().get(0).getUser().getName());
				userinfo.addField("Online Status", " " + event.getMessage().getMentionedMembers().get(0).getOnlineStatus(), false);
				userinfo.addField("Nickname", " " + event.getMessage().getMentionedMembers().get(0).getNickname(), false);
				userinfo.addField("Tag", " "  + event.getMessage().getMentionedMembers().get(0).getUser().getAsTag(), false);
				userinfo.addField("ID", " " + event.getMessage().getMentionedMembers().get(0).getUser().getId(), false);
				userinfo.addField("Date Created", " " + event.getMessage().getMentionedMembers().get(0).getUser().getCreationTime().getMonthValue() + "/" + event.getMessage().getMentionedMembers().get(0).getUser().getCreationTime().getDayOfMonth() + "/" + event.getMessage().getMentionedMembers().get(0).getUser().getCreationTime().getYear() , false);
				userinfo.setImage(event.getMessage().getMentionedMembers().get(0).getUser().getAvatarUrl());
				
				event.getChannel().sendTyping().queue();
				event.getChannel().sendMessage(userinfo.build()).queue();
				userinfo.clear();
			}
		}
		
		}
}