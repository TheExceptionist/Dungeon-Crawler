package com.rentarosato520.dungeoncrawler.item;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.mob.Mob;

public class Item extends MobExtension{
	public String name = "";
	public int damage;
	protected Mob wielder;
	
	public Item(float x, float y, int w, int h, float weight, Handler han, String name, int Damage, Mob wielder){
		super(x, y, w, h, weight, han);
		this.name = name;
		this.damage = Damage;
		this.wielder = wielder;
	}
	
	public void render(Graphics g, Graphics2D g2d){
		
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x,(int) y, w, h);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Mob getWielder() {
		return wielder;
	}

	public void setWielder(Mob wielder) {
		this.wielder = wielder;
	}
}
