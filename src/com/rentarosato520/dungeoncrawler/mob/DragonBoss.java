package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;

public class DragonBoss extends Mob{
	private int n = 0, sec = 0;
	private boolean breathfire = false;
	
	public DragonBoss(float x, float y, int w, int h, float weight, Handler han) {
		super(x, y, w, h, weight, han);
		
		health = 500;
		maxHealth = health;
		attack = 20;
	}

	public void tick(){
		
	}
	
	public void render(Graphics g){
		renderDragon(g);
		//g.setColor(Color.RED);
		//g.drawRect((int)x + 40,(int) y + 250, 32, 32);
	}
	
	public void renderDragon(Graphics g){
		n++;
		if(n == 4){
			sec++;
			n = 0;
		}
		if(sec == 0){
			g.drawImage(Assets.Dragon,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 1){
			g.drawImage(Assets.Dragon1,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 2){
			g.drawImage(Assets.Dragon2,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 3){
			g.drawImage(Assets.Dragon3,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 4){
			g.drawImage(Assets.Dragon4,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 5){
			g.drawImage(Assets.Dragon5,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 6){
			g.drawImage(Assets.Dragon6,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 7){
			g.drawImage(Assets.Dragon7,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 8){
			g.drawImage(Assets.Dragon8,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 9){
			g.drawImage(Assets.Dragon9,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 10){
			g.drawImage(Assets.Dragon10,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 11){
			g.drawImage(Assets.Dragon11,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 12){
			g.drawImage(Assets.Dragon12,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 13){
			g.drawImage(Assets.Dragon13,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 14){
			g.drawImage(Assets.Dragon14,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 15){
			g.drawImage(Assets.Dragon15,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 16){
			g.drawImage(Assets.Dragon16,(int) x,(int) y, 64*5, 64*5, null);
			breathfire = true;
		}
		if(sec == 17){
			g.drawImage(Assets.Dragon17,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 18){
			g.drawImage(Assets.Dragon18,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 19){
			g.drawImage(Assets.Dragon19,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 20){
			g.drawImage(Assets.Dragon20,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 21){
			g.drawImage(Assets.Dragon21,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 22){
			g.drawImage(Assets.Dragon22,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 23){
			g.drawImage(Assets.Dragon23,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 24){
			g.drawImage(Assets.Dragon24,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 25){
			g.drawImage(Assets.Dragon25,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 26){
			g.drawImage(Assets.Dragon26,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 27){
			g.drawImage(Assets.Dragon27,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 28){
			g.drawImage(Assets.Dragon28,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 29){
			g.drawImage(Assets.Dragon29,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 30){
			g.drawImage(Assets.Dragon30,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 31){
			g.drawImage(Assets.Dragon31,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 32){
			g.drawImage(Assets.Dragon32,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 33){
			g.drawImage(Assets.Dragon33,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 34){
			g.drawImage(Assets.Dragon34,(int) x,(int) y, 64*5, 64*5, null);
			breathfire= false;
		}
		if(sec == 35){
			g.drawImage(Assets.Dragon35,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 36){
			g.drawImage(Assets.Dragon36,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 37){
			g.drawImage(Assets.Dragon37,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 38){
			g.drawImage(Assets.Dragon38,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 39){
			g.drawImage(Assets.Dragon39,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 40){
			g.drawImage(Assets.Dragon40,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 41){
			g.drawImage(Assets.Dragon41,(int) x,(int) y, 64*5, 64*5, null);
		}
		if(sec == 42){
			g.drawImage(Assets.Dragon42,(int) x,(int) y, 64*5, 64*5, null);
			sec = 0;
		}
	}
	
	public Rectangle flameRect(){
		return new Rectangle((int)x,(int) y, w, h);
	}
	
	public void flameBreath(){
		if(breathfire){
			for(Entity e : han.entity){
				if(e.getBounds().intersects(flameRect())){
					((Mob) e).damage(10, true, 10);
				}
			}
		}
	}
}
