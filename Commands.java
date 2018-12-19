package me.OnlineMetlesley.com.CustomSlashHelp;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor{
	public Plugin instance;

	public Commands() {
		// TODO Auto-generated constructor stub
	}


	public void function() {
		Main plugin = (Main) Main.instance;
		plugin.getServer();
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("help") && sender instanceof Player){
			if (args.length == 0) {
				for(String help : Main.instance.getConfig().getStringList("Help.Help1.Lines")) {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', help.replace("%player%", player.getName())));
				}
			}
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("1")) {
					for(String help : Main.instance.getConfig().getStringList("Help.Help1.Lines")) {
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', help.replace("%player%", player.getName())));
						player.playSound(player.getLocation(), Sound.valueOf(Main.instance.getConfig().getString("Help.Help1.Sound").toUpperCase()), 10F, 100F);
					}
					return false;
				} else if (args[0].equalsIgnoreCase("2")) {
					for(String help2 : Main.instance.getConfig().getStringList("Help.Help2.Lines")) {
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', help2.replace("%player%", player.getName())));
						player.playSound(player.getLocation(), Sound.valueOf(Main.instance.getConfig().getString("Help.Help2.Sound").toUpperCase()), 10F, 100F);
					}
					return false;
				} else if (args[0].equalsIgnoreCase("3")) {
					for(String help3 : Main.instance.getConfig().getStringList("Help.Help3.Lines")) {
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', help3.replace("%player%", player.getName())));
						player.playSound(player.getLocation(), Sound.valueOf(Main.instance.getConfig().getString("Help.Help3.Sound").toUpperCase()), 10F, 100F);
					}
					return false;
				} else if (args[0].equalsIgnoreCase("4")) {
					for(String help4 : Main.instance.getConfig().getStringList("Help.Help4.Lines")) {
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', help4.replace("%player%", player.getName())));
						player.playSound(player.getLocation(), Sound.valueOf(Main.instance.getConfig().getString("Help.Help4.Sound").toUpperCase()), 10F, 100F);
					}
					return false;
				} else if (args[0].equalsIgnoreCase("5")) {
					for(String help5 : Main.instance.getConfig().getStringList("Help.Help5.Lines")) {
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', help5.replace("%player%", player.getName())));
						player.playSound(player.getLocation(), Sound.valueOf(Main.instance.getConfig().getString("Help.Help5.Sound").toUpperCase()), 10F, 100F);
					}
					return false;
				}
			}
		}
		return false;
	}
}
