package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;

public abstract class Entity {
	private Handler han;
	protected boolean canInteract;
	protected float x, y, velX, velY;
	protected int w, h;
	protected float weight;
	protected boolean falling = true, jumping;
	protected float MaxVel = 10;
	//Anything that the player interacts with goes here
	public Entity(float x, float y, int w, int h, float weight, Handler han){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.weight = weight;
		this.han = han;
	}
	
	public abstract void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity);
	
	public abstract void render(Graphics g);
	
	public abstract Rectangle getBounds();
	
	public void die(){
		han.addEntity(this);
	}

	public boolean isCanInteract() {
		return canInteract;
	}

	public void setCanInteract(boolean canInteract) {
		this.canInteract = canInteract;
	}

	public int getX() {
		return (int) x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return (int) y;
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

	public int getVelX() {
		return (int) velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return (int) velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isFalling() {
		return falling;
	}

	public void setFalling(boolean falling) {
		this.falling = falling;
	}

	public boolean isJumping() {
		return jumping;
	}

	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}
}
