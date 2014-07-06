package com.gmail.mcraftworldmc.sillytowers.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Messenger {
	
	private Messenger(){}
	
	public static String colorize(String s){
		return ChatColor.translateAlternateColorCodes('&', s);
	}
	
	public static List<String> colorize(String... s){
		List<String> t = Arrays.asList(s);
		List<String> to = new ArrayList<>();
		for(String str : t){
			to.add(colorize(str));
		}
		return to;
	}
	
	public static void msg(CommandSender sender, String s){
		sender.sendMessage(s);
	}
	
	public static void msg(CommandSender sender, List<String> l){
		for(String s : l)
			sender.sendMessage(s);
	}
	
}
