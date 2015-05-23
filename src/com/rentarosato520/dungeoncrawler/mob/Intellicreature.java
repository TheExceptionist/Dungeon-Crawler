package com.rentarosato520.dungeoncrawler.mob;

import com.rentarosato520.dungeoncrawler.Handler;

public class Intellicreature extends Mob{
	protected boolean isPlayer;
	public Intellicreature(float x, float y, int w, int h, float weight, boolean isPlayer, Handler han){
		super(x, y, w, h, weight, han);
		this.isPlayer = isPlayer;
	}
	public boolean isPlayer() {
		return isPlayer;
	}
	public void setPlayer(boolean isPlayer) {
		this.isPlayer = isPlayer;
	}
}
