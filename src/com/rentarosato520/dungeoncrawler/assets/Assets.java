package com.rentarosato520.dungeoncrawler.assets;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage player, player1, player2, player3;
	public static BufferedImage playerR, playerR1, playerR2, playerR3;
	public static BufferedImage ground, brickWall;
	public static BufferedImage axe, dun, Slash, Slash1;
	public static BufferedImage torch, torch1, torch2, torch3;
	public static BufferedImage Zombie, Zombie1, Zombie2, Zombie3;
	public static BufferedImage ZombieR, ZombieR1, ZombieR2, ZombieR3;
	public static BufferedImage Exp, Exp1, Exp2, Exp3, Exp4;
	public static BufferedImage Dragon, Dragon1, Dragon2, Dragon3, Dragon4, Dragon5, Dragon6, Dragon7, Dragon8, Dragon9, Dragon10, Dragon11, Dragon12, Dragon13, Dragon14, Dragon15, Dragon16, Dragon17, Dragon18, Dragon19;
	public static BufferedImage Dragon20, Dragon21, Dragon22, Dragon23, Dragon24, Dragon25, Dragon26, Dragon27, Dragon28, Dragon29, Dragon30, Dragon31, Dragon32, Dragon33, Dragon34, Dragon35, Dragon36, Dragon37, Dragon38, Dragon39;
	public static BufferedImage Dragon40, Dragon41, Dragon42;
	public static BufferedImage bat, bat1, bat2, bat3, bat4, bat5, bat6, bat7, bat8, bat9, bat10, bat11, bat12, bat13, bat14, bat15, bat16, bat17, bat18, bat19, bat20, bat21, bat22, bat23, bat24;
	
	public static void load(){
		SpriteLoader load = new SpriteLoader();
		Sprite Player = new Sprite(load.load("/Fox.png"));
		Sprite Ground = new Sprite(load.load("/DungeonWall.png"));
		Sprite zom = new Sprite(load.load("/Zombie.png"));
		Sprite zom1 = new Sprite(load.load("/Zombie1.png"));
		Sprite brick = new Sprite(load.load("/DungeonWall2.png"));
		Sprite ex = new Sprite(load.load("/Explosion.png"));
		Sprite drag = new Sprite(load.load("/Dragon.png"));
		Sprite pr = new Sprite(load.load("/Fox1.png"));
		Sprite ax = new Sprite(load.load("/BattleAxe.png"));
		Sprite ba = new Sprite(load.load("/Bat.png"));
		Sprite tor = new Sprite(load.load("/Torch.png"));
		Sprite d = new Sprite(load.load("/DungeonWall3.png"));
		Sprite s = new Sprite(load.load("/pixel.png"));
		
		Slash = s.crop(0, 0, 32, 32, 32, 32);
		Slash1 = s.crop(1, 0, 32, 32, 32, 32);
		
		dun = d.crop(0, 0, 32, 32, 32, 32);
		
		torch = tor.crop(0, 0, 32, 32, 32, 32);
		torch1 = tor.crop(1, 0, 32, 32, 32, 32);
		torch2 = tor.crop(2, 0, 32, 32, 32, 32);
		torch3 = tor.crop(3, 0, 32, 32, 32, 32);
		
		bat = ba.crop(0, 0, 32, 32, 32, 32);
		bat1 = ba.crop(1, 0, 32, 32, 32, 32);
		bat2 = ba.crop(2, 0, 32, 32, 32, 32);
		bat3 = ba.crop(3, 0, 32, 32, 32, 32);
		bat4 = ba.crop(4, 0, 32, 32, 32, 32);
		bat5 = ba.crop(5, 0, 32, 32, 32, 32);
		bat6 = ba.crop(6, 0, 32, 32, 32, 32);
		bat7 = ba.crop(7, 0, 32, 32, 32, 32);
		bat8 = ba.crop(8, 0, 32, 32, 32, 32);
		bat9 = ba.crop(9, 0, 32, 32, 32, 32);
		bat10 = ba.crop(10, 0, 32, 32, 32, 32);
		bat11 = ba.crop(11, 0, 32, 32, 32, 32);
		bat12 = ba.crop(12, 0, 32, 32, 32, 32);
		bat13 = ba.crop(13, 0, 32, 32, 32, 32);
		bat14 = ba.crop(14, 0, 32, 32, 32, 32);
		bat15 = ba.crop(15, 0, 32, 32, 32, 32);
		bat16 = ba.crop(16, 0, 32, 32, 32, 32);
		bat17 = ba.crop(17, 0, 32, 32, 32, 32);
		bat18 = ba.crop(18, 0, 32, 32, 32, 32);
		bat19 = ba.crop(19, 0, 32, 32, 32, 32);
		bat20 = ba.crop(20, 0, 32, 32, 32, 32);
		bat21 = ba.crop(21, 0, 32, 32, 32, 32);
		bat22 = ba.crop(22, 0, 32, 32, 32, 32);
		bat23 = ba.crop(23, 0, 32, 32, 32, 32);
		bat24 = ba.crop(24, 0, 32, 32, 32, 32);
		
		axe = ax.crop(0, 0, 32, 32, 32, 32);
		
		player = Player.crop(0, 0, 32, 32, 32, 32);
		player1 = Player.crop(1, 0, 32, 32, 32, 32);
		player2 = Player.crop(2, 0, 32, 32, 32, 32);
		player3 = Player.crop(3, 0, 32, 32, 32, 32);
		
		playerR = pr.crop(0, 0, 32, 32, 32, 32);
		playerR1 = pr.crop(1, 0, 32, 32, 32, 32);
		playerR2 = pr.crop(2, 0, 32, 32, 32, 32);
		playerR3 = pr.crop(3, 0, 32, 32, 32, 32);
		
		ground = Ground.crop(0, 0, 32, 32, 32, 32);
		
		brickWall = brick.crop(0, 0, 32, 32, 32, 32);
		
		Exp = ex.crop(0, 0, 32, 32, 32, 32);
		Exp1 = ex.crop(1, 0, 32, 32, 32, 32);
		Exp2 = ex.crop(2, 0, 32, 32, 32, 32);
		Exp3 = ex.crop(3, 0, 32, 32, 32, 32);
		Exp4 = ex.crop(4, 0, 32, 32, 32, 32);
		
		ZombieR = zom1.crop(0, 0, 32, 32, 32, 32);
		ZombieR1 = zom1.crop(1, 0, 32, 32, 32, 32);
		ZombieR2 = zom1.crop(2, 0, 32, 32, 32, 32);
		ZombieR3 = zom1.crop(3, 0, 32, 32, 32, 32);
		
		Zombie = zom.crop(0, 0, 32, 32, 32, 32);
		Zombie1 = zom.crop(1, 0, 32, 32, 32, 32);
		Zombie2 = zom.crop(2, 0, 32, 32, 32, 32);
		Zombie3 = zom.crop(3, 0, 32, 32, 32, 32);
		
		Dragon = drag.crop(0, 0, 100, 100, 100, 100);
		Dragon1 = drag.crop(1, 0, 100, 100, 100, 100);
		Dragon2 = drag.crop(2, 0, 100, 100, 100, 100);
		Dragon3 = drag.crop(3, 0, 100, 100, 100, 100);
		
		Dragon4 = drag.crop(4, 0, 100, 100, 100, 100);
		Dragon5 = drag.crop(5, 0, 100, 100, 100, 100);
		Dragon6 = drag.crop(6, 0, 100, 100, 100, 100);
		Dragon7 = drag.crop(7, 0, 100, 100, 100, 100);
		
		Dragon8 = drag.crop(8, 0, 100, 100, 100, 100);
		Dragon9 = drag.crop(9, 0, 100, 100, 100, 100);
		Dragon10 = drag.crop(10, 0, 100, 100, 100, 100);
		Dragon11 = drag.crop(11, 0, 100, 100, 100, 100);
		
		Dragon12 = drag.crop(12, 0, 100, 100, 100, 100);
		Dragon13 = drag.crop(13, 0, 100, 100, 100, 100);
		Dragon14 = drag.crop(14, 0, 100, 100, 100, 100);
		Dragon15 = drag.crop(15, 0, 100, 100, 100, 100);
		
		Dragon16 = drag.crop(16, 0, 100, 100, 100, 100);
		Dragon17 = drag.crop(17, 0, 100, 100, 100, 100);
		Dragon18 = drag.crop(18, 0, 100, 100, 100, 100);
		Dragon19 = drag.crop(19, 0, 100, 100, 100, 100);
		
		Dragon20 = drag.crop(20, 0, 100, 100, 100, 100);
		Dragon21 = drag.crop(21, 0, 100, 100, 100, 100);
		Dragon22 = drag.crop(22, 0, 100, 100, 100, 100);
		Dragon23 = drag.crop(23, 0, 100, 100, 100, 100);
		
		Dragon24 = drag.crop(24, 0, 100, 100, 100, 100);
		Dragon25 = drag.crop(25, 0, 100, 100, 100, 100);
		Dragon26 = drag.crop(26, 0, 100, 100, 100, 100);
		Dragon27 = drag.crop(27, 0, 100, 100, 100, 100);
		
		Dragon28 = drag.crop(28, 0, 100, 100, 100, 100);
		Dragon29 = drag.crop(29, 0, 100, 100, 100, 100);
		Dragon30 = drag.crop(30, 0, 100, 100, 100, 100);
		Dragon31 = drag.crop(31, 0, 100, 100, 100, 100);
		
		Dragon32 = drag.crop(32, 0, 100, 100, 100, 100);
		Dragon33 = drag.crop(33, 0, 100, 100, 100, 100);
		Dragon34 = drag.crop(34, 0, 100, 100, 100, 100);
		Dragon35 = drag.crop(35, 0, 100, 100, 100, 100);
		
		Dragon36 = drag.crop(36, 0, 100, 100, 100, 100);
		Dragon37 = drag.crop(37, 0, 100, 100, 100, 100);
		Dragon38 = drag.crop(38, 0, 100, 100, 100, 100);
		Dragon39 = drag.crop(39, 0, 100, 100, 100, 100);
		
		Dragon40 = drag.crop(40, 0, 100, 100, 100, 100);
		Dragon41 = drag.crop(41, 0, 100, 100, 100, 100);
		Dragon42 = drag.crop(42, 0, 100, 100, 100, 100);
	}
}
