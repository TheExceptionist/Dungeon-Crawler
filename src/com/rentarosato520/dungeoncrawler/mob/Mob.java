package com.rentarosato520.dungeoncrawler.mob;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rentarosato520.dungeoncrawler.Handler;
import com.rentarosato520.dungeoncrawler.assets.Assets;
import com.rentarosato520.dungeoncrawler.room.Corridor;
import com.rentarosato520.dungeoncrawler.room.DungeonObject;
import com.rentarosato520.dungeoncrawler.room.Room;
import com.rentarosato520.dungeoncrawler.surface.Ground;

public class Mob extends Entity{
	protected int health, maxHealth, attack, speed;
	protected Abilities[] abilities;
	protected int numJumps = 0;
	protected boolean shouldCollide = true;
	protected boolean damageOnContact = true;
	protected boolean canKnockback = true;
	protected Rectangle mask = new Rectangle((int) x,(int) y, w, h); 
	protected int destX = -1, destY = -1;
	protected boolean isDecay = false;
	protected int decayTime = 0, decay = 0;
	private Random ran = new Random();
	protected int sec = 0;
	private int n = 0;
	//protected boolean collidingT = false, collidingB = false, collidingR = false, collidingL = false;
	//private Item ActiveItem
	public Mob(float x, float y, int w, int h, float weight, Handler han){
		super(x, y, w, h, weight, han);
	}

	@Override
	public void tick(LinkedList<DungeonObject> object, CopyOnWriteArrayList<Entity> entity, LinkedList<Room> room, LinkedList<Corridor> corridor) {
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
		
		if(x < 0 - 500 || x > 0 + 1500 + 1500){
			han.removeEntity(this);
		}
		
		if(y < 0 - 500 || y > 0 + 1500 + 500){
			han.removeEntity(this);
		}
		
		if(isDecay && decayTime >= 0){
			decayTime--;
			decay++;
			if(decay == 20){
				health--;
				decay = 0;
			}
		}
		
		SurfaceCollision(han.ground);
		mobCollision();
		//ObjectCollision(object, entity, room, corridor);
	}

	public void render(Graphics g) {
		if(health <= 0){
			die(g);
			health = 0;
		}
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int) x,(int) y, w, h);
	}
	
	public void die(Graphics g){
		n++;
		if(n == 6){
			sec++;
			n = 0;
		}
		if(sec == 1){
			g.drawImage(Assets.Exp, (int)x,(int) y - 24, 64, 64, null);
		}
		if(sec == 2){
			g.drawImage(Assets.Exp1, (int)x,(int) y - 24, 64, 64, null);
		}
		if(sec == 3){
			g.drawImage(Assets.Exp2, (int)x,(int) y - 24, 64, 64, null);
		}
		if(sec == 4){
			g.drawImage(Assets.Exp3, (int)x,(int) y - 24, 64, 64, null);
		}
		if(sec == 5){
			g.drawImage(Assets.Exp4, (int)x,(int) y - 24, 64, 64, null);
			han.entity.remove(this);
		}
		System.out.println(sec);
	}
	
	public void wander(){
		if(destX == -1){
			for(Ground g : han.ground){
				if(g.getBounds().intersects(getBounds())){
					destX = g.x + ran.nextInt(g.w);
				}
			}
		}
		if(x < destX){velX = speed;}
		if(x > destX){velX = -speed;}
		if(x == destX){destX = -1;}
		//if(y < destY){velY = speed;}
		//if(y < destY){velY = speed;}
	}
	
	public void damage(int amount){
		health -= amount;
		if(canKnockback){
			knockback();
		}
	}
	
	public void damage(int amount, boolean decay, int decayTime){
		health -= amount;
		isDecay = decay;
		this.decayTime = decayTime;
		
		if(canKnockback){
			knockback();
		}
	}
	
	public void knockback(){
		velY = -10;
		velX *= -1;
	}
	
	public void mobCollision(){
		for(Entity e : han.entity){
			if(e.getBounds().intersects(getBounds()) && e != this){
				if(((Mob) e).damageOnContact){
					((Mob) e).damage(attack);
				}
				if(damageOnContact){
					damage(((Mob) e).attack);
				}
			}
		}
	}
	
	public void SurfaceCollision(LinkedList<Ground> ground){
		for(Ground g : ground){
			if(g.getBounds().intersects(getBounds())){
				//if(!jumping){
					velY = 0; 
					y = g.getBounds().y + g.getBounds().height - h * 2;
					numJumps = 0;
				//}
				falling = false;
			}else{
				falling = true;
			}
		}
	}

	public void ObjectCollision(LinkedList<DungeonObject> object, LinkedList<Entity> entity, LinkedList<Room> room, LinkedList<Corridor> corridor){
		/*for(DungeonObject DO : object){
			if(DO.getWallTop().intersects(getBounds())){
				velY = 0; 
				y = DO.getBounds().y + h;
			}
			if(DO.getWallBottom().intersects(getBounds())){
				velY = 0;
				y = DO.getY() + DO.getH() - h;
				numJumps = 0;
			}
			if(DO.getWallLeft().intersects(getBounds())){
				velX = 0;
				x = DO.getX() + DO.getW() - w;
			}
			if(DO.getWallRight().intersects(getBounds())){
				velX = 0;
				x = DO.getX();
			}
		}*/
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

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public boolean isShouldCollide() {
		return shouldCollide;
	}

	public void setShouldCollide(boolean shouldCollide) {
		this.shouldCollide = shouldCollide;
	}

	public boolean isDamageOnContact() {
		return damageOnContact;
	}

	public void setDamageOnContact(boolean damageOnContact) {
		this.damageOnContact = damageOnContact;
	}

	public boolean isCanKnockback() {
		return canKnockback;
	}

	public void setCanKnockback(boolean canKnockback) {
		this.canKnockback = canKnockback;
	}

	public int getDestX() {
		return destX;
	}

	public void setDestX(int destX) {
		this.destX = destX;
	}

	public int getDestY() {
		return destY;
	}

	public void setDestY(int destY) {
		this.destY = destY;
	}
	
	
}
