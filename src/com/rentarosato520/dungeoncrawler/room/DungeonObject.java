package com.rentarosato520.dungeoncrawler.room;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;

import com.rentarosato520.dungeoncrawler.mob.Entity;

public abstract class DungeonObject {
	public static final Random r = new Random();
	protected int x, y, w, h;
	
	public DungeonObject(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public abstract void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity);
	
	public abstract void render(Graphics g);
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, w, h);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
}
