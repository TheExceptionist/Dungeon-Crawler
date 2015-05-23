package com.rentarosato520.dungeoncrawler.util;

import com.rentarosato520.dungeoncrawler.GameMain;
import com.rentarosato520.dungeoncrawler.mob.Entity;

public class Camera {
	private int x, y, velX, velY;
	
	public Camera(int x, int y){
		this.x = x;
		this.y = y;
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
	
	public void tick(Entity p){
		x = -p.getX() + GameMain.screenSize.width/2 - 60;
		y = -p.getY() + GameMain.screenSize.height/2 - 40;
	}
}
