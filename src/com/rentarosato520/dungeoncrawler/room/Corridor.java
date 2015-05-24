package com.rentarosato520.dungeoncrawler.room;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.mob.Entity;

public class Corridor extends RoomExtension{
	private int x1, y1;
	private int centerX, centerY;
	private Room r2;
	
	public Corridor(int x, int y, int w, int h, Room r, Room r2) {
		super(x, y, w, h, r);
		this.r2 = r2;
		r.corridor.add(this);
		r2.corridor.add(this);
		x1 = x + w;
		y1 = y + h;
		centerX = x + (w/2);
		centerY = y + (h/2);
	}

	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity){
	
	}
	
	public void render(Graphics g){
		for(int x = this.x; x < this.x + w; x+=32){
			for(int y = this.y; y < this.y + h; y+=32){
				g.drawImage(Assets.ground, x, y, 32, 32, null);
			}
		}
	}
}
