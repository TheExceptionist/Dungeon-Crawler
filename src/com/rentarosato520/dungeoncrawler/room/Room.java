package com.rentarosato520.dungeoncrawler.room;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.GameMain;
import com.rentarosato520.dungeoncrawler.genDungeon.DungeonGen;
import com.rentarosato520.dungeoncrawler.mob.Entity;

public class Room extends DungeonObject{	
	public int x1, y1;
	public int centerX, centerY;
	public static int numRooms = 0;
	
	public Room(int x, int y, int w, int h){
		super(x, y, w, h);
		centerX = (x + w) / 2; 
		centerY = (y + h) / 2;
		x1 = x + w;
		y1 = y + h;
		numRooms++;
	}

	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity) {
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, w, h);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public static int getNumRooms() {
		return numRooms;
	}

	public static void setNumRooms(int numRooms) {
		Room.numRooms = numRooms;
	}
}
