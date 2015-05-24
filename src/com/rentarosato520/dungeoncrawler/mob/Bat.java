package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.room.Corridor;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;

public class Bat extends Mob{
	private int n = 0, sec = 0;
	private int targetX, targetY;
	private Mob p;
	private int distX, distY;
	
	public Bat(float x, float y, int w, int h, float weight, Handler han, Mob p) {
		super(x, y, w, h, weight, han);
		this.p = p;
		this.attack = 3;
		
		velX = 2;
		velY = 2;
	}
	
	public void tick(LinkedList<DungeonObject> object, CopyOnWriteArrayList<Entity> entity, LinkedList<Room> room, LinkedList<Corridor> corridor){
		super.tick(object, entity, room, corridor);
		for(Entity e : entity){
			if(e instanceof Intellicreature){
				if(((Intellicreature) e).isPlayer()){
					targetX = (int) e.getX();
					targetY = (int) e.getY();
				}
			}
			if(e.getBounds().intersects(getBounds())){
				((Mob) e).damage(attack);
				targetX = 0;
				targetY = 0;
				velY = -50;
			}
		}
		
		falling = false;
		jumping = false;
		
		x += velX; 
		y += velY;
		
		distX = Math.abs((int)x - targetX);
		distY = Math.abs((int)y - targetY);
		
		velX = distX/2 + 3;
		velY = distY/2 + 3;
		
		if(x < targetX && velX <= 0){velX *= -1;}
		if(x > targetX && velX >= 0){velX *= -1;}
		if(y < targetY && velY <= 0){velY *= -1;}
		if(y > targetY && velY >= 0){velY *= -1;}
	}
	
	public void render(Graphics g){
		renderBat(g);
		
	}
	
	public void renderBat(Graphics g){
		n++;
		if(n == 1){
			sec++;
			n = 0;
		}
		
		if(sec == 0){
			g.drawImage(Assets.bat,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 1){
			g.drawImage(Assets.bat1,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 2){
			g.drawImage(Assets.bat2,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 3){
			g.drawImage(Assets.bat3,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 4){
			g.drawImage(Assets.bat4,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 5){
			g.drawImage(Assets.bat5,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 6){
			g.drawImage(Assets.bat6,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 7){
			g.drawImage(Assets.bat7,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 8){
			g.drawImage(Assets.bat8,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 9){
			g.drawImage(Assets.bat9,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 10){
			g.drawImage(Assets.bat10,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 11){
			g.drawImage(Assets.bat11,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 12){
			g.drawImage(Assets.bat12,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 13){
			g.drawImage(Assets.bat13,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 14){
			g.drawImage(Assets.bat14,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 15){
			g.drawImage(Assets.bat15,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 16){
			g.drawImage(Assets.bat16,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 17){
			g.drawImage(Assets.bat17,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 18){
			g.drawImage(Assets.bat18,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 19){
			g.drawImage(Assets.bat19,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 20){
			g.drawImage(Assets.bat20,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 21){
			g.drawImage(Assets.bat21,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 22){
			g.drawImage(Assets.bat22,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 23){
			g.drawImage(Assets.bat23,(int) x,(int) y, 64, 64, null);
		}
		if(sec == 24){
			g.drawImage(Assets.bat24,(int) x,(int) y, 64, 64, null);
			sec= 0;
		}
	}
}
