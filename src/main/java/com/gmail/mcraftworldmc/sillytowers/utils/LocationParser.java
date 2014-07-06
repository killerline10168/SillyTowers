package com.gmail.mcraftworldmc.sillytowers.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationParser {
	
	private LocationParser(){}
	
	public static Location parseLocation(String s){
		String[] sl = s.split(",");
		if(sl.length < 4){
			throw new ArrayIndexOutOfBoundsException("Not enough arguments to parse String to Location Received: " + s.length() + ", Where it should be 4");
		}
		return new Location(Bukkit.getWorld(sl[0]), Double.parseDouble(sl[1]), Double.parseDouble(sl[2]), Double.parseDouble(sl[3]));
	}
	
	public static Location parseLocationYP(String s){
		String[] sl = s.split(",");
		if(sl.length < 6){
			throw new ArrayIndexOutOfBoundsException("Not enough arguments to parse String to Location with Yaw/Pitch Received: " + s.length() + ", Where it should be 6");
		}
		Location l = LocationParser.parseLocation(s);
		l.setYaw(Float.parseFloat(sl[4]));
		l.setPitch(Float.parseFloat(sl[5]));
		return l;
	}
	
	public static String parseLocationToString(Location l){
		return (l.getWorld().getName() + "," + l.getX() + "," + l.getY() + "," + l.getZ());
	}
	
	public static String parseLocationToStringWithYP(Location l){
		return (l.getWorld().getName() + "," + l.getX() + "," + l.getY() + "," + l.getZ() + "," + l.getYaw() + "," + l.getPitch());
	}
}
