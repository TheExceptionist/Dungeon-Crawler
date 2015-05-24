package com.rentarosato520.dungeoncrawler.room;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.mob.Entity;

public class DungeonObject {
	public static final Random r = new Random();
	protected int x, y, w, h;
	//protected boolean collidingT, collidingB, collidingL, collidingR;
	
	public DungeonObject(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public void tick(LinkedList<DungeonObject> object, CopyOnWriteArrayList<Entity> entity){
		
	}
	
	public void render(Graphics g){
		g.setColor(Color.blue);
		g.drawLine(x, y, x+w, y);
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, w, h);
	}
	
	/*public Rectangle getBoundsTop(){
		return new Rectangle(x, y - h/20, w, h/20);
	}
	
	public Rectangle getBoundsLeft(){
		return new Rectangle(x - w/20, y, w/20, h);
	}
	
	public Rectangle getBoundsRight(){
		return new Rectangle(x + w, y, w/14, h);
	}
	
	public Rectangle getBoundsBottom(){
		return new Rectangle(x, y + h, w, h/14);
	}*/
	
	/*public Line2D getWallTop(){
		return new Line2D.Float(x, y, x+w, y);
	}
	
	public Line2D getWallBottom(){
		return new Line2D.Float(x, y+h, x+w, y+h);
	}
	
	public Line2D getWallRight(){
		return new Line2D.Float(x, y+h, x+w, y+h);
	}
	
	public Line2D getWall(){
		return new Line2D.Float(x, y+h, x+w, y+h);
	}*/
	
	//public Line2D line = new Line2D.Float(p1, p2);
	
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

	/*public boolean isCollidingT() {
		return collidingT;
	}

	public void setCollidingT(boolean collidingT) {
		this.collidingT = collidingT;
	}

	public boolean isCollidingB() {
		return collidingB;
	}

	public void setCollidingB(boolean collidingB) {
		this.collidingB = collidingB;
	}

	public boolean isCollidingL() {
		return collidingL;
	}

	public void setCollidingL(boolean collidingL) {
		this.collidingL = collidingL;
	}

	public boolean isCollidingR() {
		return collidingR;
	}

	public void setCollidingR(boolean collidingR) {
		this.collidingR = collidingR;
	}*/
}
