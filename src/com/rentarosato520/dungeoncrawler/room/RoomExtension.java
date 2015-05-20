package com.rentarosato520.dungeoncrawler.room;

import java.awt.Graphics;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.mob.Entity;

public class RoomExtension extends DungeonObject{
	protected Room r;
	public RoomExtension(int x, int y, int w, int h, Room r){
		super(x, y, w, h);
		this.r = r;
	}
	@Override
	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
