package com.rentarosato520.dungeoncrawler.room;

import java.awt.Graphics;

import com.rentarosato520.dungeoncrawler.assets.Assets;

public class Torch extends DungeonObject{
	private int n = 0, sec = 0;

	public Torch(int x, int y, int w, int h) {
		super(x, y, w, h);
		
	}
	
	public void render(Graphics g){
		n++;
		if(n == 2){
			sec++;
			n = 0;
		}
		if(sec == 0){
			g.drawImage(Assets.torch, x, y, 128, 128, null);
		}
		if(sec == 1){
			g.drawImage(Assets.torch1, x, y, 128, 128, null);
		}
		if(sec == 2){
			g.drawImage(Assets.torch2, x, y, 128, 128, null);
		}
		if(sec == 3){
			g.drawImage(Assets.torch3, x, y, 128, 128, null);
			sec = 0;
		}
	}
}
