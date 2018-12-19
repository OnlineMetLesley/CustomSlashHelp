package me.OnlineMetlesley.com.CustomSlashHelp;

import java.util.List;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	FileConfiguration config = this.getConfig();
	Server getserver = this.getServer();
	
	public static Plugin instance;
	    public Main() { } // make your constructor private, so the only war
	                              // to access "application" is through singleton pattern

	    public Plugin getInstance() {
	        return instance;
	      }
	    
	    List<String> help1 = getConfig().getStringList("Help.Help1.Lines");
	    List<String> help2 = getConfig().getStringList("Help.Help2.Lines");
	    List<String> help3 = getConfig().getStringList("Help.Help3.Lines");
	    List<String> help4 = getConfig().getStringList("Help.Help4.Lines");
	    List<String> help5 = getConfig().getStringList("Help.Help5.Lines");
	@Override
	public void onEnable() {
		this.getCommand("help").setExecutor(new Commands());
		instance = this;
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        // All you have to do is adding this line in your onEnable method:
        @SuppressWarnings("unused")
		MetricsLite metrics = new MetricsLite(this);
	}

	public void onDisable() {
	}	
}
