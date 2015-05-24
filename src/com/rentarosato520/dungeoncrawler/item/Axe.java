package com.rentarosato520.dungeoncrawler.item;

import java.awt.Graphics;
import java.awt.Graphics2D;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.mob.Entity;
import com.rentarosato520.dungeoncrawler.mob.Mob;
import com.rentarosato520.dungeoncrawler.surface.Ground;

public class Axe extends Item{
	private int n = 0, sec = 0;
	private boolean isThrown = false;
	
	public Axe(float x, float y, int w, int h, float weight, Handler han,
			String name, int Damage, Mob wielder) {
		super(x, y, w, h, weight, han, name, Damage, wielder);
	}
	
	public void render(Graphics g, Graphics2D g2d){
		x += velX;
		y += velY;
		
		if(!isThrown){
			x = wielder.getX();
			y = wielder.getY() - 10;
		}
		
		if(isThrown){
			for(Entity e : han.entity){
				if(e.getBounds().intersects(getBounds()) && e != wielder){
					((Mob) e).damage(damage);
					wielder = null;
					han.items.remove(this);
				}
			}
			for(Ground G : han.ground){
				if(G.getBounds().intersects(getBounds())){
					wielder = null;
					han.items.remove(this);
				}
			}
		}
		
		if(x < 0 - 500 || x > 0 + 1500 + 2000){
			han.items.remove(this);
		}
		
		if(y < 0 - 500 || y > 0 + 1500 + 500){
			han.items.remove(this);
		}
		
		if(wielder == null){
			han.items.remove(this);
		}
		
		if(velY <= 0 || velY > 0 && isThrown){
			sec++;
			if(sec == 10){
				velY++;
				sec = 0;
			}
		}
		
		g.drawImage(Assets.axe,(int) x,(int) y, 32, 32, null);
	}
	
	public void thrown(){
		velY = -3;
		if(wielder.getFacing() == 1){
			velX = 7;
		}else{
			velX = -7;
		}
		isThrown = true;
	}
}
