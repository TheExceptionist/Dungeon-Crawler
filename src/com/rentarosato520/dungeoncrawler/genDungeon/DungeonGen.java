package com.rentarosato520.dungeoncrawler.genDungeon;

import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;

public class DungeonGen {
	public static final Random ran = new Random();
	public static int w, h, tileSize;
	private Handler han;
	private int numRooms = ran.nextInt(20) + 10;
	
	public DungeonGen(int w, int h, int tileSize, Handler han){
		this.w = w;
		this.h = h;
		this.han = han;
		this.tileSize = tileSize;
	}
	
	public void createDungeon(){
			//Generates Map
			while(Room.getNumRooms() < numRooms){
				int ww = (ran.nextInt(15) + 5) * 16;
				int hh = (ran.nextInt(15) + 5) * 16;
				int x = ran.nextInt(w * 3);
				int y = ran.nextInt(h * 3);
				
				boolean failed = false;
				
				if(Room.getNumRooms() > 0){
					for(DungeonObject r : han.object){
						if(r instanceof Room && r.getBounds().intersects(new Rectangle(x, y, ww, hh))){
							failed = true;
							break;
						}
					}
					
					if(!failed){
						han.addDObject(new Room(x, y, ww, hh, han));
					}
				}else{
					han.addDObject(new Room(x, y, ww, hh, han));
				}
				//System.out.println("Hello");
				//System.out.println("Rooms: "+Room.getNumRooms()+" "+numRooms);
				//Add room
			}
	}

	public static DungeonObject getSpawnRoom(LinkedList<DungeonObject> DO){
		int choice = ran.nextInt(DO.size());
		return DO.get(choice);
	}
}
