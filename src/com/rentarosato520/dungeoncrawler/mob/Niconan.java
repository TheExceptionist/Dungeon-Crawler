package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;

public class Niconan extends Intellicreature{
	//Fox
	public Niconan(float x, float y, int w, int h, float weight, boolean isPlayer, Handler han){
		super(x, y, w, h, weight, isPlayer, han);
		
		health = 90;
		attack = 5;
		speed = 7;
		abilities = new Abilities[3];
		abilities[0] = Abilities.quickfeet;
		abilities[1] = Abilities.sneakstep;
		abilities[2] = Abilities.wallclimb;
	}
	
	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity){
		super.tick(object, entity);
	}
	
	public void render(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect((int) x,(int) y, w, h);
	}
}
