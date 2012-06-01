package com.gmail.bruno.jumpandshoot.Entity;

/*
 * Entity
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright � 2012, Bruno Gustav Lanevik. All rights reserved.
 */

import com.jme3.scene.Spatial;

/*Super object for entities*/
public abstract class Entity{
	protected float size, health, damage, posX, posY,  posZ;
	protected String texture;
	protected boolean isOp;
	protected Arrow projectile;
	protected Spatial model;
	protected Weapon weapon;
	public Entity(){
		weapon = new Weapon("Unarmed");
		
	}
	public float getHealth() {
		return health;
	}
	public void setHealth(float health) {
		this.health = health;
	}
	public float getDamage() {
		return damage + weapon.damage();
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
	public void setSpatial(Spatial s){
		this.model = s;
	}
	public Spatial getSpatial(){
		return spatial;
	}
	public void onKilled(){
		
	}
	public void onShoot(){
		
	}
	public void setWeapon(Weapon weapon){
		this.weapon = weapon
	}
	public Weapon getWeapon(){
		return weapon;
	}
	public boolean isOp(){
		return isOp;
	}
	public boolean isOp(boolean isOp){
		return this.isOp = isOp;
	}
}
