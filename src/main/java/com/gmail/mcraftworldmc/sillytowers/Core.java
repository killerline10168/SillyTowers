package com.gmail.mcraftworldmc.sillytowers;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.mcraftworldmc.sillytowers.listeners.GeneralListener;
import com.gmail.mcraftworldmc.sillytowers.mechanics.SillyTowerGame;

public class Core extends JavaPlugin{
	private SillyTowerGame game;
	
	@Override
	public void onEnable(){
		game = new SillyTowerGame(this);
		new GeneralListener(this);
		saveDefaultConfig();
	}
	
	public SillyTowerGame getGame(){
		return game;
	}
}
