package com.rentarosato520.dungeoncrawler;

import java.util.Random;

import com.rentarosato520.dungeoncrawler.mob.Niconan;
import com.rentarosato520.dungeoncrawler.surface.Ground;

public class Spawner {
	private Handler h;
	private Random r = new Random();
	private int spawnTick = 0;
	private int spawnLim =  10;
	private int spawnAmount = r.nextInt(5)+1;
	
	public Spawner(Handler h){
		this.h = h;
	}
	
	public void tick(){
		Spawn();
	}
	
	public void Spawn(){
		spawnTick++;
		if(spawnTick == spawnLim){
			for(int i = 0; i < spawnAmount; i++){
				for(Ground g : h.ground){
					if(r.nextInt(5) <= 3){
						//h.addEntity();
					}else{
						h.addEntity(new Niconan(g.x + r.nextInt(g.w), g.y, 32, 32, 0.5f, false, h));
					}
				}
			}
			spawnTick = 0;
			spawnLim =  r.nextInt(300)+200;
		}
	}
}
