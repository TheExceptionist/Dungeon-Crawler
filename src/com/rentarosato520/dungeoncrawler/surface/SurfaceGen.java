package com.rentarosato520.dungeoncrawler.surface;

import java.util.Random;

import com.rentarosato520.dungeoncrawler.Handler;

public class SurfaceGen {
	private int w;
	private Handler han;
	private Random r = new Random();
	private int numRooms = r.nextInt(20)+1; 
	private int curRooms = 0;
	
	public SurfaceGen(int w, Handler h){
		this.w = w;
		this.han = h;
	}
	
	public void createSurface(){
		while(curRooms < numRooms){
			System.out.println(curRooms);
			han.addGround(new Ground(r.nextInt(w), r.nextInt(w), w, 32));
			curRooms++;
		}
	}
}
