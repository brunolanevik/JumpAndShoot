package com.gmail.bruno.jumpandshoot.Entity;

public abstract class Projectile extends Entity {
	public Projectile(int x, int y, int z, int health, int damage, float size) {
		super(x, y, z, health, damage, size);
		// TODO Auto-generated constructor stub
	}

	protected boolean isMelee;
	
}
