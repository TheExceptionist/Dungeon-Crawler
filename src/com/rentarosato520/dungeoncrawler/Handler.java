package com.rentarosato520.dungeoncrawler;

import java.awt.Graphics;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.mob.Entity;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;

public class Handler {
	public LinkedList<Entity> entity = new LinkedList<Entity>();
	public LinkedList<DungeonObject> object= new LinkedList<DungeonObject>();
	public LinkedList<Room> rooms = new LinkedList<Room>();
	
	public void tick(){
		for(DungeonObject DO : object){
			DO.tick(object, entity);
		}
		for(Entity e : entity){
			e.tick(object, entity);
		}
	}
	
	public void render(Graphics g){
		for(DungeonObject DO : object){
			DO.render(g);
		}
		for(Entity e : entity){
			e.render(g);
		}
	}
	
	public void addDObject(DungeonObject DO){
		object.add(DO);
		
		if(DO instanceof Room){
			rooms.add((Room) DO);
		}
	}
	
	public void removeDObject(DungeonObject DO){
		object.remove(DO);
	}	
	
	public void addEntity(Entity e){
		entity.add(e);
	}
	
	public void removeEntity(Entity e){
		entity.remove(e);
	}	
}
