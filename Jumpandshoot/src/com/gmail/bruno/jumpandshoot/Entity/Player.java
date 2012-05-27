package com.gmail.bruno.jumpandshoot.Entity;

import com.gmail.bruno.jumpandshoot.Weapons.Weapon;

/*
 * Player
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright © 2012, Bruno Gustav Lanevik. All rights reserved.
 */
public class Player extends Entity{
	protected String ip, name;
	protected int damageModifier;
	public Player(float x, float y, float z, int health, int damage, float size, String ip, String name, String texture, Weapon[] weapon) {
		super(x, y, z, health, damage, size, texture);
		this.name = name;
		this.ip = ip;
		// TODO Auto-generated constructor stub
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
