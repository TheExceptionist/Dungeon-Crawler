package com.rentarosato520.dungeoncrawler.assets;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage player;
	public static BufferedImage ground, brickWall;
	public static BufferedImage Zombie, Zombie1, Zombie2, Zombie3;
	public static BufferedImage Exp, Exp1, Exp2, Exp3, Exp4;
	public static BufferedImage Dragon, Dragon1, Dragon2, Dragon3, Dragon4, Dragon5, Dragon6, Dragon7, Dragon8, Dragon9, Dragon10, Dragon11, Dragon12, Dragon13, Dragon14, Dragon15, Dragon16, Dragon17, Dragon18, Dragon19;
	public static BufferedImage Dragon20, Dragon21, Dragon22, Dragon23, Dragon24, Dragon25, Dragon26, Dragon27, Dragon28, Dragon29, Dragon30, Dragon31, Dragon32, Dragon33, Dragon34, Dragon35, Dragon36, Dragon37, Dragon38, Dragon39;
	public static BufferedImage Dragon40, Dragon41, Dragon42;
	
	public static void load(){
		SpriteLoader load = new SpriteLoader();
		Sprite Player = new Sprite(load.load("/FoxCharacter.png"));
		Sprite Ground = new Sprite(load.load("/DungeonWall.png"));
		Sprite zom = new Sprite(load.load("/Zombie.png"));
		Sprite brick = new Sprite(load.load("/DungeonWall2.png"));
		Sprite ex = new Sprite(load.load("/Explosion.png"));
		Sprite drag = new Sprite(load.load("/Dragon.png"));
		
		
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
		
		Dragon = drag.crop(0, 0, 32, 32, 32, 32);
		Dragon1 = drag.crop(1, 0, 32, 32, 32, 32);
		Dragon2 = drag.crop(2, 0, 32, 32, 32, 32);
		Dragon3 = drag.crop(3, 0, 32, 32, 32, 32);
		
		Dragon4 = drag.crop(4, 0, 32, 32, 32, 32);
		Dragon5 = drag.crop(5, 0, 32, 32, 32, 32);
		Dragon6 = drag.crop(6, 0, 32, 32, 32, 32);
		Dragon7 = drag.crop(7, 0, 32, 32, 32, 32);
		
		Dragon8 = drag.crop(8, 0, 32, 32, 32, 32);
		Dragon9 = drag.crop(9, 0, 32, 32, 32, 32);
		Dragon10 = drag.crop(10, 0, 32, 32, 32, 32);
		Dragon11 = drag.crop(11, 0, 32, 32, 32, 32);
		
		Dragon12 = drag.crop(12, 0, 32, 32, 32, 32);
		Dragon13 = drag.crop(13, 0, 32, 32, 32, 32);
		Dragon14 = drag.crop(14, 0, 32, 32, 32, 32);
		Dragon15 = drag.crop(15, 0, 32, 32, 32, 32);
		
		Dragon16 = drag.crop(16, 0, 32, 32, 32, 32);
		Dragon17 = drag.crop(17, 0, 32, 32, 32, 32);
		Dragon18 = drag.crop(18, 0, 32, 32, 32, 32);
		Dragon19 = drag.crop(19, 0, 32, 32, 32, 32);
		
		Dragon20 = drag.crop(20, 0, 32, 32, 32, 32);
		Dragon21 = drag.crop(21, 0, 32, 32, 32, 32);
		Dragon22 = drag.crop(22, 0, 32, 32, 32, 32);
		Dragon23 = drag.crop(23, 0, 32, 32, 32, 32);
		
		Dragon24 = drag.crop(24, 0, 32, 32, 32, 32);
		Dragon25 = drag.crop(25, 0, 32, 32, 32, 32);
		Dragon26 = drag.crop(26, 0, 32, 32, 32, 32);
		Dragon27 = drag.crop(27, 0, 32, 32, 32, 32);
		
		Dragon28 = drag.crop(28, 0, 32, 32, 32, 32);
		Dragon29 = drag.crop(29, 0, 32, 32, 32, 32);
		Dragon30 = drag.crop(30, 0, 32, 32, 32, 32);
		Dragon31 = drag.crop(31, 0, 32, 32, 32, 32);
		
		Dragon32 = drag.crop(32, 0, 32, 32, 32, 32);
		Dragon33 = drag.crop(33, 0, 32, 32, 32, 32);
		Dragon34 = drag.crop(34, 0, 32, 32, 32, 32);
		Dragon35 = drag.crop(35, 0, 32, 32, 32, 32);
		
		Dragon36 = drag.crop(36, 0, 32, 32, 32, 32);
		Dragon37 = drag.crop(37, 0, 32, 32, 32, 32);
		Dragon38 = drag.crop(38, 0, 32, 32, 32, 32);
		Dragon39 = drag.crop(39, 0, 32, 32, 32, 32);
		
		Dragon40 = drag.crop(40, 0, 32, 32, 32, 32);
		Dragon41 = drag.crop(41, 0, 32, 32, 32, 32);
		Dragon42 = drag.crop(42, 0, 32, 32, 32, 32);
	}
}
