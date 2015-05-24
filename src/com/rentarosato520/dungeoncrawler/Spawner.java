package com.rentarosato520.dungeoncrawler;

import java.util.Random;

import com.rentarosato520.dungeoncrawler.mob.Bat;
import com.rentarosato520.dungeoncrawler.mob.DragonBoss;
import com.rentarosato520.dungeoncrawler.mob.Mob;
import com.rentarosato520.dungeoncrawler.mob.Niconan;
import com.rentarosato520.dungeoncrawler.mob.Zombie;
import com.rentarosato520.dungeoncrawler.surface.Ground;

public class Spawner {
	private Handler h;
	private Random r = new Random();
	private Mob p;
	private int spawnTick = 0;
	private int spawnLim =  10;
	private int spawnAmount = r.nextInt(5)+1;
	private int dragonChance = r.nextInt(100);
	private int batChance = r.nextInt(100);
	private int zombieChance = r.nextInt(100);
	
	public Spawner(Handler h){
		this.h = h;
	}
	
	public void tick(){
		Spawn();
	}
	
	public void Spawn(){
		spawnTick++;
		if(spawnTick == spawnLim && h.entity.size() < 50){
			for(int i = 0; i < spawnAmount; i++){
				for(Ground g : h.ground){
					if(r.nextInt(10) <= 5){
						h.addEntity(new Niconan(g.x + r.nextInt(g.w), g.y - 23, 32, 32, 0.5f, false, h));
					}
					if(dragonChance <= 45){
						h.addEntity(new DragonBoss(g.x + r.nextInt(g.w), g.y + 123, 32, 32, 2.5f, h));
						break;
					}
					if(zombieChance <= 65){

						h.addEntity(new Zombie(g.x + r.nextInt(g.w), g.y - 23, 32, 32, 1.5f, h));
						break;
					}
					if(batChance <= 55){
						h.addEntity(new Bat(g.x + r.nextInt(g.w), g.y - 23, 32, 32, 0.0f, h, p));
						break;
					}
				}
			}
			spawnTick = 0;
			spawnLim =  r.nextInt(300)+200;
			dragonChance = r.nextInt(100);
			batChance = r.nextInt(100);
			zombieChance = r.nextInt(100);
		}
	}
}
