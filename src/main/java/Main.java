import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;


public class Main {

    private static final String TOKEN = "YOUR_DISCORD_BOT_API_KEY";
    private static final String API_KEY = "YOUR_WEATHER_API_KEY";

    public static String getApiKey(){
        return API_KEY;
    }

    // Build a Bot
    public static void main(String[] args) throws LoginException {

        JDA jda = JDABuilder.createDefault(TOKEN)
                  .enableIntents(GatewayIntent.GUILD_MEMBERS)
                  .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                  .build();
        jda.addEventListener(new Listeners());
        jda.addEventListener(new SlashCommand());
    }
}
