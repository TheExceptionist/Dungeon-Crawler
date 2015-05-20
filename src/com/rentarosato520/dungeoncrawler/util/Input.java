package com.rentarosato520.dungeoncrawler.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.rentarosato520.dungeoncrawler.GameMain;

public class Input implements KeyListener{
	public Input(GameMain game){
		game.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
