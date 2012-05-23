package com.gmail.bruno.jumpandshoot.Weapons;

public abstract class Weapon {
	protected int damageModifier, bulletSpread, charge;
	protected String path;
	protected boolean isChargeable;
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
	
}
