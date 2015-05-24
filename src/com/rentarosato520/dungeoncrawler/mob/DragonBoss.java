package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;

import com.rentarosato520.dungeoncrawler.Handler;

public class DragonBoss extends Mob{
	public DragonBoss(float x, float y, int w, int h, float weight, Handler han) {
		super(x, y, w, h, weight, han);
		
		health = 1000;
		maxHealth = health;
		attack = 20;
	}

	public void tick(){
		
	}
	
	public void render(Graphics g){
		
	}
	
	public void flameBreath(){
		
	}
}
