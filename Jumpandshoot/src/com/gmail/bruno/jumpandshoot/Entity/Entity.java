package com.gmail.bruno.jumpandshoot.Entity;

/*
 * Entity
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright © 2012, Bruno Gustav Lanevik. All rights reserved.
 */

import com.jme3.scene.Spatial;

/*Super object for entities*/
public abstract class Entity extends Spatial{
	protected float size, health, damage, posX, posY,  posZ;
	protected String texture;
	public Entity(){

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
