package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;

public class Mob extends Entity{
	protected int health, attack, speed;
	protected Abilities[] abilities;
	protected int numJumps = 0;
	//protected boolean collidingT = false, collidingB = false, collidingR = false, collidingL = false;
	//private Item ActiveItem
	public Mob(float x, float y, int w, int h, float weight, Handler han){
		super(x, y, w, h, weight, han);
	}

	@Override
	public void tick(LinkedList<DungeonObject> object, LinkedList<Entity> entity) {
		x += velX;
		y += velY;
		
		if(falling || jumping){
			velY += weight;
			
			if(velY > MaxVel || velX > MaxVel){
				velY = MaxVel;
			}
		}
		
		if(velX >= 0){
			jumping = false;
			falling = true;
		}
		
		ObjectCollision(object, entity);
	}

	@Override
	public void render(Graphics g) {
		
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) x,(int) y, w, h);
	}

	public void ObjectCollision(LinkedList<DungeonObject> object, LinkedList<Entity> entity){
		for(DungeonObject DO : object){
			if(DO.getBoundsLeft().intersects(getBounds())){velX = 0; x = DO.getX();}
			if(DO.getBoundsRight().intersects(getBounds())){velX = 0; x = DO.getX() + DO.getW() - w;}
			if(DO.getBoundsBottom().intersects(getBounds())){
				if(!jumping){
					velY = 0; y = DO.getY() + DO.getH() - h;
					numJumps = 0;
				}
			}
			if(DO.getBoundsTop().intersects(getBounds())){
				velY = 0;
				y = DO.getY();
			}
		}
	}
	//Mob commands
	public void jump(){
		velY = -10;
		jumping = true;
		numJumps++;
	}
	
	//For the Niconan
	public void dodge(){
		
	}
	
	public void crawl(){
		
	}
	
	public void dig(){
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Abilities[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Abilities[] abilities) {
		this.abilities = abilities;
	}

	public int getNumJumps() {
		return numJumps;
	}

	public void setNumJumps(int numJumps) {
		this.numJumps = numJumps;
	}
	
	
}
