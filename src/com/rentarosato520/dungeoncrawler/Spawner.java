package com.rentarosato520.dungeoncrawler;

public class Spawner {
	private Handler h;
	
	public Spawner(Handler h){
		this.h = h;
	}
	
	public void Spawn(){
		for(int i= 0; i < h.ground.size(); i++){
			//h.addEntity(new Niconan());
		}
	}
}
