package com.rentarosato520.dungeoncrawler.assets;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage player;
	public static BufferedImage ground, brickWall;
	public static BufferedImage Zombie, Zombie1, Zombie2, Zombie3;
	public static BufferedImage Exp, Exp1, Exp2, Exp3, Exp4;
	
	public static void load(){
		SpriteLoader load = new SpriteLoader();
		Sprite Player = new Sprite(load.load("/FoxCharacter.png"));
		Sprite Ground = new Sprite(load.load("/DungeonWall.png"));
		Sprite zom = new Sprite(load.load("/Zombie.png"));
		Sprite brick = new Sprite(load.load("/DungeonWall2.png"));
		Sprite ex = new Sprite(load.load("/Explosion.png"));
		
		
		player = Player.crop(0, 0, 32, 32, 32, 32);
		ground = Ground.crop(0, 0, 32, 32, 32, 32);
		
		brickWall = brick.crop(0, 0, 32, 32, 32, 32);
		
		Exp = ex.crop(0, 0, 32, 32, 32, 32);
		Exp1 = ex.crop(1, 0, 32, 32, 32, 32);
		Exp2 = ex.crop(2, 0, 32, 32, 32, 32);
		Exp3 = ex.crop(3, 0, 32, 32, 32, 32);
		Exp4 = ex.crop(4, 0, 32, 32, 32, 32);
		
		Zombie = zom.crop(0, 0, 32, 32, 32, 32);
		Zombie1 = zom.crop(1, 0, 32, 32, 32, 32);
		Zombie2 = zom.crop(2, 0, 32, 32, 32, 32);
		Zombie3 = zom.crop(3, 0, 32, 32, 32, 32);
	}
}
