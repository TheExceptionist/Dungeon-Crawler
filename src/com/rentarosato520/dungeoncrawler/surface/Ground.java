package com.rentarosato520.dungeoncrawler.surface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

import com.rentarosato520.dungeoncrawler.assets.Assets;

public class Ground {
	public int x, y, w, h;
	
	public Ground(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public void render(Graphics g){
		for(int x = this.x; x < this.x + w; x+=64){
			g.drawImage(Assets.ground,(int) x,(int) y - 24, 64, 64, null);
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
