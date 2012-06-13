package com.gmail.bruno.jumpandshoot.Entity;

import java.util.Queue;

import com.gmail.bruno.jumpandshoot.Weapons.Weapon;
import com.jme3.bounding.BoundingVolume;
import com.jme3.collision.Collidable;
import com.jme3.collision.CollisionResults;
import com.jme3.collision.UnsupportedCollisionException;
import com.jme3.scene.SceneGraphVisitor;
import com.jme3.scene.Spatial;

/*
 * Player
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright � 2012, Bruno Gustav Lanevik. All rights reserved.
 */
public class Player extends Entity{
	protected String ip, name;
	protected boolean status;
	protected int damageModifier;
	public Player() {

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
	@Override
	public int collideWith(Collidable arg0, CollisionResults arg1)
			throws UnsupportedCollisionException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	protected void breadthFirstTraversal(SceneGraphVisitor arg0,
			Queue<Spatial> arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Spatial deepClone() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void depthFirstTraversal(SceneGraphVisitor visitor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getTriangleCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getVertexCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setModelBound(BoundingVolume modelBound) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateModelBound() {
		// TODO Auto-generated method stub
		
	}
	public boolean isOnline(boolean status){
		this.status = status;
		return this.status;
	}
	public boolean isOnline(){
		return this.status;
	}
	public boolean kick(){
		return false;
	}
}
