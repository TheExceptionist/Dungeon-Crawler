package com.rentarosato520.dungeoncrawler.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.rentarosato520.dungeoncrawler.GameMain;
import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.item.Axe;
import com.rentarosato520.dungeoncrawler.mob.Entity;
import com.rentarosato520.dungeoncrawler.mob.Intellicreature;

public class Input implements KeyListener{
	private Handler h;
	private boolean[] keys = new boolean[4];
	
	public Input(GameMain game, Handler h){
		game.addKeyListener(this);
		this.h = h;
	
		for(int i = 0; i < keys.length; i++){
			keys[i] = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		for(Entity en : h.entity){
			if(en instanceof Intellicreature){
				Intellicreature p = (Intellicreature) en;
				if(p.isPlayer()){
					if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
						if(p.getNumJumps() < 2){
							p.jump(); keys[0] = true;
						}
					}
					if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){p.setVelY(p.getSpeed()); keys[1] = true;}
					if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){p.setVelX(p.getSpeed()); keys[2] = true;}
					if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){p.setVelX(-p.getSpeed()); keys[3] = true;}
					
					if(e.getKeyCode() == KeyEvent.VK_SPACE){if(p.getActiveItem() != null){((Axe) p.getActiveItem()).thrown();}}
					if(e.getKeyCode() == KeyEvent.VK_SHIFT){p.isAttack = true;}
				}
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_R){GameMain.respawn();}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		for(Entity en : h.entity){
			if(en instanceof Intellicreature){
				Intellicreature p = (Intellicreature) en;
				if(p.isPlayer()){
					if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){keys[0] = false;}
					if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S){keys[1] = false;}
					if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D){keys[2] = false;}
					if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A){keys[3] = false;}
					
					if(e.getKeyCode() == KeyEvent.VK_SHIFT){p.isAttack = false;}
					
					if(keys[0] && keys[1]){p.setVelY(0);}
					if(!keys[0] && !keys[1]){p.setVelY(0);}
					if(keys[2] && keys[3]){p.setVelX(0);}
					if(!keys[2] && !keys[3]){p.setVelX(0);}
				}
			}
		}
	}

}
