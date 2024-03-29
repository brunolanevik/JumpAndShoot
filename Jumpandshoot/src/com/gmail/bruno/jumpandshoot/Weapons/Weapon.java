package com.gmail.bruno.jumpandshoot.Weapons;

import com.jme3.scene.Geometry;

/*
 * Weapon
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright � 2012, Bruno Gustav Lanevik. All rights reserved.
 */

public abstract class Weapon{
	protected int damageModifier, bulletSpread, charge, explosiveRad;
	protected Arrow projectile;
	protected Spatial model;
	protected String name;
	protected String path;
	
	protected boolean isChargeable;
	protected boolean isLumens;
	protected boolean isExplosive
	public Weapon(int damageModifier, int bulletSpread, int charge, String path, boolean isChargeable){
		this.damageModifier = damageModifier;
		this.bulletSpread = bulletSpread;
		this.charge = charge;
		this.path = path;
		this.isChargeable = isChargeable;
	}
	public int getDamageModifier() {
		return damageModifier;
	}
	public void setDamageModifier(int damageModifier) {
		this.damageModifier = damageModifier;
	}
	public int getBulletSpread() {
		return bulletSpread;
	}
	public void setBulletSpread(int bulletSpread) {
		this.bulletSpread = bulletSpread;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isChargeable() {
		return isChargeable;
	}
	public void setChargeable(boolean isChargeable) {
		this.isChargeable = isChargeable;
	}
	public void setSpatial(Spatial s){
		this.model = s;
	}
	public Spatial getSpatial(){
		return model;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setProjectile(Arrow projectile){
		this.projectile = projectile;
	}
	public Arrow getProjectile(){
		return projectile;
	}
	public boolean isLumensWeapon(){
		return isLumens;
	}
	public boolean isLumensWeapon(boolean isLumens){
		return this.isLumens = isLumens;
	}
	public boolean isExplosive(boolean isExplosive){
		this.isExplosive = isExplosive
		return this.isExplosive;
	}
	public boolean isExplosive(){
		return this.isExplosive;
	}
}
