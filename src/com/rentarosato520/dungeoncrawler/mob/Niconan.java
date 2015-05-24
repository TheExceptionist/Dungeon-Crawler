package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.item.Axe;
import com.rentarosato520.dungeoncrawler.room.Corridor;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;

public class Niconan extends Intellicreature{
	private int n = 0, sec = 0;
	private boolean isWalking = false;
	private Random r = new Random();
	private int regTime = 0;
	//Fox
	public Niconan(float x, float y, int w, int h, float weight, boolean isPlayer, Handler han){
		super(x, y, w, h, weight, isPlayer, han);
		//Set player health back to 90 later
		//For balancing now.
		if(isPlayer){
			health = 1000;	
		}else{
			health = 90;
		}
		maxHealth = health;
		attack = 5;
		speed = 7;
		abilities = new Abilities[3];
		abilities[0] = Abilities.quickfeet;
		abilities[1] = Abilities.sneakstep;
		abilities[2] = Abilities.wallclimb;
		
		
		if(!isPlayer){
			velX = speed;
			if(r.nextInt(2) == 0){
				velX = -speed;
			}
		}
		if(!isPlayer && r.nextInt(100) <= 20){
			activeItem = new Axe(x, y, 32*5, 32*5, 0.5f, han, "Throwing Axe", 50, this);
		}else{
			activeItem = new Axe(x, y, 32*5, 32*5, 0.5f, han, "Throwing Axe", 50, this);
		}
		
		if(activeItem != null){
			han.items.add(activeItem);
		}
	}
	
	public void tick(LinkedList<DungeonObject> object, CopyOnWriteArrayList<Entity> entity, LinkedList<Room> room, LinkedList<Corridor> corridor){
		super.tick(object, entity, room, corridor);
		if(!isPlayer){
			wander();
		}
		if(isPlayer && health < maxHealth){
			regen();
		}
	}
	
	public void render(Graphics g){
		if(facing == 0 && !isWalking){
			g.drawImage(Assets.player,(int) x,(int) y - 24, 64, 64, null);
		}
		if(facing == 1 && !isWalking){
			g.drawImage(Assets.playerR,(int) x,(int) y - 24, 64, 64, null);
		}
		if(velX != 0){
			isWalking = true;
			if(facing == 0){
				n++;
				if(n == 4){
					sec++;
					n = 0;
				}
				if(sec == 0){
					g.drawImage(Assets.player,(int) x,(int) y - 24, 64, 64, null);
				}
				if(sec == 1){
					g.drawImage(Assets.player1,(int) x,(int) y - 24, 64, 64, null);
				}
				if(sec == 2){
					g.drawImage(Assets.player2,(int) x,(int) y - 24, 64, 64, null);
				}
				if(sec == 3){
					g.drawImage(Assets.player3,(int) x,(int) y - 24, 64, 64, null);
					sec = 0;
				}
			}
			if(facing == 1){
				n++;
				if(n == 4){
					sec++;
					n = 0;
				}
				if(sec == 0){
					g.drawImage(Assets.playerR,(int) x,(int) y - 24, 64, 64, null);
				}
				if(sec == 1){
					g.drawImage(Assets.playerR1,(int) x,(int) y - 24, 64, 64, null);
				}
				if(sec == 2){
					g.drawImage(Assets.playerR2,(int) x,(int) y - 24, 64, 64, null);
				}
				if(sec == 3){
					g.drawImage(Assets.playerR3,(int) x,(int) y - 24, 64, 64, null);
					sec = 0;
				}
			}
		}else{
			isWalking = false;
		}
		super.render(g);
	}
	
	
}
