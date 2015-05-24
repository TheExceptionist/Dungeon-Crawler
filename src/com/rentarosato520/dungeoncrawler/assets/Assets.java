package com.rentarosato520.dungeoncrawler.assets;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage player;
	public static BufferedImage ground;
	
	public static void load(){
		SpriteLoader load = new SpriteLoader();
		Sprite Player = new Sprite(load.load("/FoxCharacter.png"));
		Sprite Ground = new Sprite(load.load("/DungeonWall.png"));
		
		player = Player.crop(0, 0, 32, 32, 32, 32);
		ground = Ground.crop(0, 0, 32, 32, 32, 32);
	}
}
