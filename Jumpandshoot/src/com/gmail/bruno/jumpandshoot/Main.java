package com.gmail.bruno.jumpandshoot;

import com.jme3.app.SimpleApplication;

/*
 * Main
 * 
 * Version 1.0
 *
 * 2012-05-27
 * 
 * Copyright � 2012, Bruno Gustav Lanevik. All rights reserved.
 */

public class Main extends SimpleApplication{
	private List<Entity entities> entity = new List<Entity>();
	private Render render;
	private Player player;
	public static void main(String[] args){
		Main app = new Main();
		app.start();
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		Entity.setActiveComponents();
		entity = Entity.getActiveComponents()
		render = new Render(entity);
	}

}
