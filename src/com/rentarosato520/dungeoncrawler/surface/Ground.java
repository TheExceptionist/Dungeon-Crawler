package com.rentarosato520.dungeoncrawler.surface;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.util.Random;

import com.rentarosato520.dungeoncrawler.assets.Assets;

public class Ground {
	public int x, y, w, h;
	private Random r = new Random();
	private int style;
	private int type;
	
	public Ground(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
		style = r.nextInt(100);
		type = r.nextInt(4);
	}
	
	public void render(Graphics g){
		if(style >= 15){
			for(int x = this.x; x < this.x + w; x+=64){
				g.drawImage(Assets.dun,(int) x,(int) y - 24, 64, h, null);
				//g.drawRect(x, y - 24, w, h);
			}
		}else{
			for(int x = this.x; x < this.x + w; x+=64){
				g.drawImage(Assets.ground,(int) x,(int) y - 24, 64, h, null);
				//g.drawRect(x, y - 24, w, h);
			}
		}
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y - 24, w, h);
	}
	
	public Line2D getLeft(){
		return new Line2D.Float(x, y- 50, x, y + h * 2);
	}
	
	public Line2D getRight(){
		return new Line2D.Float(x + w, y- 50, x+w, y + h * 2);
	}
}
