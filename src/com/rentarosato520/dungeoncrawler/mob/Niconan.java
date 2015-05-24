package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.room.Corridor;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;

public class Niconan extends Intellicreature{
	//Fox
	public Niconan(float x, float y, int w, int h, float weight, boolean isPlayer, Handler han){
		super(x, y, w, h, weight, isPlayer, han);
		
		health = 90;
		maxHealth = health;
		attack = 5;
		speed = 7;
		abilities = new Abilities[3];
		abilities[0] = Abilities.quickfeet;
		abilities[1] = Abilities.sneakstep;
		abilities[2] = Abilities.wallclimb;
	}
	
	public void tick(LinkedList<DungeonObject> object, CopyOnWriteArrayList<Entity> entity, LinkedList<Room> room, LinkedList<Corridor> corridor){
		super.tick(object, entity, room, corridor);
		if(!isPlayer){
			wander();
		}
	}
	
	public void render(Graphics g){
		g.drawImage(Assets.player,(int) x,(int) y - 24, 64, 64, null);
		super.render(g);
	}
}
