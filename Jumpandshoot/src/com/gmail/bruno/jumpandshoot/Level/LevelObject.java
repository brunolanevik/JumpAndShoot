package com.gmail.bruno.jumpandshoot.Level;

import com.jme3.scene.Geometry;

/*
 * LevelObject
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright © 2012, Bruno Gustav Lanevik. All rights reserved.
 */
public abstract class LevelObject extends Geometry {
	protected int x,y,z;
	protected float size;
	protected String texture;
	public LevelObject(int x,int y, int z, float size, String texture){
		this.x = x;
		this.y = y;
		this.z = z;
		this.size = size;
		this.texture = texture;
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
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
}
