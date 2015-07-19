package com.rentarosato520.dungeoncrawler.surface;

import java.awt.Rectangle;
import java.util.Random;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;

public class SurfaceGen {
	private int w;
	private Handler han;
	private Random r = new Random();
	private int numRooms = r.nextInt(20)+5; 
	private int curRooms = 0;
	private int Room = r.nextInt(20)+8;
	private int lim = 0;
	
	public SurfaceGen(int w, Handler h){
		this.w = w * 3;
		this.han = h;
	}
	
	public void createSurface(){
		while(curRooms < numRooms){
				int gx = r.nextInt(w);
				int gy = r.nextInt(w);
				int gw = r.nextInt(w) + 50;
				
	
				boolean failed = false;
				
				if(curRooms > 0){
					for(Ground g : han.ground){
						if(g.getBounds().intersects(new Rectangle(gx, gy, gw, 32))){
							failed = true;
							break;
						}
					}
					
					if(!failed){
						han.addGround(new Ground(gx, gy, gw, /*r.nextInt(32)+*/32));
						curRooms++;
					}
				}else{
					han.addGround(new Ground(gx, gy, gw, /*r.nextInt(32)+*/32));
					curRooms++;
				}
			}
			while(lim < Room){
				Ground Spawn = han.ground.get(r.nextInt(han.ground.size()));
				
				han.addDObject(new Room(Spawn.x + r.nextInt(w), Spawn.y, r.nextInt(200)+500, r.nextInt(200)+500, han));
				
				lim++;
			}
	}
}
