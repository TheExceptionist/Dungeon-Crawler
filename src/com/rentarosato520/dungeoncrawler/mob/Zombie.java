package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.room.Corridor;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;
import com.rentarosato520.dungeoncrawler.surface.Ground;

public class Zombie extends Mob{
	private int n = 0, sec = 0;
	private Random r = new Random();

	public Zombie(float x, float y, int w, int h, float weight, Handler han) {
		super(x, y, w, h, weight, han);
		
		//System.out.println(x+" "+y+" "+velX+" "+velY);

		speed = 2;
		attack = 10;
		health = 700;
		
		velX = speed;
		if(r.nextInt(2) == 0){
			velX = -speed;
		}
		velY = 0;
	}
	
	public void tick(LinkedList<DungeonObject> object, CopyOnWriteArrayList<Entity> entity, LinkedList<Room> room, LinkedList<Corridor> corridor){
		super.tick(object, entity, room, corridor);
		velY = 0;
		
		regen();
		
		for(Entity e : entity){
			if(e.getBounds().intersects(getBounds())){
				((Mob) e).damage(attack*3);
			}
		}
		
		for(Ground g : han.ground){
			if(g.getLeft().intersects(getBounds()) || g.getRight().intersects(getBounds())){
				velX *= -1;
			}
		}

		x += velX;
	}
	
	public void render(Graphics g){
		if(velX != 0){
			if(facing == 0){
				n++;
				if(n == 4){
					sec++;
					n = 0;
				}
				if(sec == 0){
					g.drawImage(Assets.Zombie,(int) x,(int) y - 128, 128, 128, null);
				}
				if(sec == 1){
					g.drawImage(Assets.Zombie1,(int) x,(int) y - 128, 128, 128, null);
				}
				if(sec == 2){
					g.drawImage(Assets.Zombie2,(int) x,(int) y - 128, 128, 128, null);
				}
				if(sec == 3){
					g.drawImage(Assets.Zombie3,(int) x,(int) y - 128, 128, 128, null);
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
					g.drawImage(Assets.ZombieR,(int) x,(int) y - 128, 128, 128, null);
				}
				if(sec == 1){
					g.drawImage(Assets.ZombieR1,(int) x,(int) y - 128, 128, 128, null);
				}
				if(sec == 2){
					g.drawImage(Assets.ZombieR2,(int) x,(int) y - 128, 128, 128, null);
				}
				if(sec == 3){
					g.drawImage(Assets.ZombieR3,(int) x,(int) y - 128, 128, 128, null);
					sec = 0;
				}
			}
		}
	}
}
