package com.rentarosato520.dungeoncrawler.room;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.mob.Entity;

public class Room extends DungeonObject{	
	public int x1, y1;
	public int centerX, centerY;
	public static int numRooms = 0;
	public int numCorridors = 0, maxCorridor = r.nextInt(3) + 1;
	
	private Handler han;
	
	public Room(int x, int y, int w, int h, Handler han){
		super(x, y, w, h);
		this.han = han;
		
		centerX = (x + w) / 2; 
		centerY = (y + h) / 2;
		x1 = x + w;
		y1 = y + h;
		
		numRooms++;
		
		genCorriders();
	}

	private void genCorriders() {
		if(han.rooms.size() > 5){
			while(numCorridors < maxCorridor){
				System.out.println(numCorridors+" "+maxCorridor);
				Room room = han.rooms.get(r.nextInt(han.rooms.size()));
				
				if(room.numCorridors >= room.maxCorridor){break;}
				
				int destX = Math.abs(x - room.x);
				int destY = Math.abs(y - room.y);
				int dx = x - r.nextInt(destX)+5;
				int CorridorW = 50;
				
				if(room.x < x){
					han.addDObject(new Corridor(dx, y + r.nextInt(h), destX, CorridorW, this, room));
					if(room.y < y){
						han.addDObject(new Corridor(dx, room.y + room.h, CorridorW, destY, this, room));
					}else if(room.y > y + h){
						han.addDObject(new Corridor(dx, room.y, CorridorW, destY, this, room));
					}else{
						han.addDObject(new Corridor(x - destX, room.y, destX, CorridorW, this, room));
					}
				}else if(room.x > x + w){
					han.addDObject(new Corridor(x + w, y + r.nextInt(h), destX, CorridorW, this, room));
					if(room.y < y){
						han.addDObject(new Corridor(x + w + destX, room.y + room.h, CorridorW, destY, this, room));
					}else if(room.y > y + h){
						han.addDObject(new Corridor(x + w + destX, room.y, CorridorW, destY, this, room));
					}else{
						han.addDObject(new Corridor(x - destX, room.y, destX, CorridorW, this, room));
					}
				}else{
					if(room.y < y){
						han.addDObject(new Corridor(x + r.nextInt(w), room.y, CorridorW, destY, this, room));
					}else if(room.y > y + h){
						han.addDObject(new Corridor(x + r.nextInt(w), room.y - destY, CorridorW, destY, this, room));
					}
				}
				
				room.numCorridors++;
				numCorridors++;
			}
		}
	}

	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity) {
		super.tick(object, entity);
	}

	public void render(Graphics g) {
		super.render(g);
		g.setColor(Color.red);
		g.fillRect(x, y, w, h);
		g.setColor(Color.BLUE);
		//g.drawRect(x + w, y, w/14, h);
		//g.drawRect(x - w/14, y, w/14, h);
		//g.drawRect(x + w/25, y - h/15, w, h/14);
		//g.drawRect(x + w/25, y + h, w, h/14);
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
