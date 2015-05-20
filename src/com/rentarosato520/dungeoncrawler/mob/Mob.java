package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;

public class Mob extends Entity{
	public Mob(Handler han){
		super(han);
	}

	@Override
	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}
}
