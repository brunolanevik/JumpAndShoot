package com.gmail.bruno.jumpandshoot.Entity;

import com.jme3.scene.Geometry;

/*Super object for entities*/
public abstract class Entity extends Geometry{
	protected float size, health, damage;
	protected String texture;
	public Entity(float x, float y, float z, float health, float damage, float size, String texture){
		this.health = health;
		this.damage = damage;
		this.setLocalTranslation(x, y, z);
		this.scale(size);
		this.size = size;
		this.texture = texture;
	}
	@Override
	public void setLocalTranslation(float x, float y, float z) {
		// TODO Auto-generated method stub
		super.setLocalTranslation(x, y, z);
	}
	public float getHealth() {
		return health;
	}
	public void setHealth(float health) {
		this.health = health;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
}
