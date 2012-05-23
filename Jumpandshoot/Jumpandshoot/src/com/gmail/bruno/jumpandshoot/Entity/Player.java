package com.gmail.bruno.jumpandshoot.Entity;

public class Player extends Entity{
	protected String ip, name;
	protected int damageModifier;
	public Player(int x, int y, int z, int health, int damage, float size, String ip, String name) {
		super(x, y, z, health, damage, size);
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
