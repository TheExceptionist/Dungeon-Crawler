package com.rentarosato520.dungeoncrawler;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.rentarosato520.dungeoncrawler.genDungeon.DungeonGen;
import com.rentarosato520.dungeoncrawler.util.Camera;

public class GameMain extends Canvas implements Runnable{
	public static final String name = "Dungeon Crawler";
	public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	private boolean running = false;
	private Handler h = new Handler();
	private DungeonGen gen = new DungeonGen(300, 300, 16, h);
	private Camera cam = new Camera(0, 0);
	
	public GameMain(){
		gen.createDungeon();
	}
	
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double delta = 0;
		double amountOfTicks = 60.0;
		double ns = 1000000000.0 / amountOfTicks;
		long timer = System.currentTimeMillis();
		int frames = 0;
		
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			if(running){
				render();
				frames++;
				
				if(System.currentTimeMillis() - timer > 1000){
					timer += 1000;
					frames = 0;
				}
			}
		}
		stop();
	}
	
	public void start(){
		running = true;
		//Creates a thread with this as the runnable
		new Thread(this).start();
	}
	
	public void stop(){
		running = false;
	}
	
	public void tick(){
		h.tick();
	}
	
	public void render(){
		if(getWidth() == 0 || getHeight() == 0){
			return;
		}
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			//Creates BufferStrategies if there are none
			try{
				createBufferStrategy(3);
			}catch(Exception e){
				e.printStackTrace();
			}
			requestFocus();
			return;
		}
		//Gets the graphic
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, screenSize.width, screenSize.height);
		//Allows the handler to render all of the objects
		h.render(g);
		//Gets rid of the graphics g
		g.dispose();
		//Shows the buffers
		bs.show();
	}
	
	public static void main(String[] args){
		GameMain game = new GameMain();
		JFrame window = new JFrame();
		
		game.setMaximumSize(screenSize);
		game.setMinimumSize(screenSize);
		game.setPreferredSize(screenSize);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(screenSize.width, screenSize.height);
		window.setResizable(true);
		window.setVisible(true);
		window.setTitle(GameMain.name);
		window.setLocationRelativeTo(null);
		window.add(game);
		
		game.start();
	}
}
