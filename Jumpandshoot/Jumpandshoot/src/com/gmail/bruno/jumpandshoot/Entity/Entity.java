package com.gmail.bruno.jumpandshoot.Entity;

public abstract class Entity {
	protected int x,y,z,health,damage;
	protected float size;
	public Entity(int x, int y, int z, int health, int damage, float size){
		this.x = x;
		this.y = y;
		this.z = z;
		this.health = health;
		this.damage = damage;
		this.size = size;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
}
