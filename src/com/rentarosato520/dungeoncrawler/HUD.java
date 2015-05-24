package com.rentarosato520.dungeoncrawler;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Window;

import com.rentarosato520.dungeoncrawler.mob.Mob;

public class HUD {
	public static int health, preHealth, c; 
	private Handler h;
	private Mob p;
	public static boolean isLevelUp;
	
	public HUD(Handler h, Mob p){
		this.h = h;
		this.p = p;
	}
	
	public void tick(){

	}
	
	public void render(Graphics g){
		g.setColor(Color.red);
		g.setFont(new Font(null, Font.PLAIN, 30));
		g.drawString("Health: "+p.getHealth()+"/"+p.getMaxHealth(), 20, 30);
	}
}