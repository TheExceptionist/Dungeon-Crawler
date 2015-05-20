package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;

public abstract class Entity {
	private Handler han;
	protected boolean canInteract;
	//Anything that the player interacts with goes here
	public Entity(Handler han){
		this.han = han;
	}
	
	public abstract void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity);
	
	public abstract void render(Graphics g);
	
	public abstract Rectangle getBounds();
	
	public void die(){
		han.addEntity(this);
	}
}
