package com.rentarosato520.dungeoncrawler.room;

import java.awt.Color;
import java.awt.Graphics;

public class Corridor extends RoomExtension{
	private int x1, y1;
	private int centerX, centerY;
	private Room r2;
	
	public Corridor(int x, int y, int w, int h, Room r, Room r2) {
		super(x, y, w, h, r);
		this.r2 = r2;
		x1 = x + w;
		y1 = y + h;
		centerX = x + (w/2);
		centerY = y + (h/2);
	}

	public void tick(){
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.GREEN);
		g.fillRect(x, y, w, h);
	}
}
