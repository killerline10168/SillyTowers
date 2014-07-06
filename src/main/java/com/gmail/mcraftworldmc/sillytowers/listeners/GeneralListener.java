package com.gmail.mcraftworldmc.sillytowers.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.gmail.mcraftworldmc.sillytowers.Core;

public class GeneralListener implements Listener{
	private Core plugin;
	
	public GeneralListener(Core plugin){
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		
	}
}
