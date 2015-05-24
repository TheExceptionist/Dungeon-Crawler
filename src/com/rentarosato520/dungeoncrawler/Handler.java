package com.rentarosato520.dungeoncrawler;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.item.Item;
import com.rentarosato520.dungeoncrawler.mob.Entity;
import com.rentarosato520.dungeoncrawler.room.Corridor;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;
import com.rentarosato520.dungeoncrawler.surface.Ground;

public class Handler {
	public CopyOnWriteArrayList<Entity> entity = new CopyOnWriteArrayList<Entity>();
	public CopyOnWriteArrayList<Item> items = new CopyOnWriteArrayList<Item>();
	public LinkedList<DungeonObject> object= new LinkedList<DungeonObject>();
	public LinkedList<Room> rooms = new LinkedList<Room>();
	public LinkedList<Corridor> corridor = new LinkedList<Corridor>();
	public LinkedList<Ground> ground = new LinkedList<Ground>();
	
	public void tick(){
		for(DungeonObject DO : object){
			DO.tick(object, entity);
		}
		for(Entity e : entity){
			e.tick(object, entity, rooms, corridor);
		}
	}
	
	public void render(Graphics g, Graphics2D g2d){
		for(DungeonObject DO : object){
			DO.render(g);
		}
		for(Entity e : entity){
			e.render(g);
		}
		for(Ground G : ground){
			G.render(g);
		}
		for(Item i : items){
			i.render(g, g2d);
		}
	}
	
	public void addDObject(DungeonObject DO){
		object.add(DO);
		
		if(DO instanceof Room){
			rooms.add((Room) DO);
		}
		if(DO instanceof Corridor){
			corridor.add((Corridor) DO);
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
	
	public void addGround(Ground g){
		ground.add(g);
	}
}
