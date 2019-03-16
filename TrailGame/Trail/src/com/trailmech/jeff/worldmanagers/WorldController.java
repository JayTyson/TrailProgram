package com.trailmech.jeff.worldmanagers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.trailmech.jeff.objects.Player;

public class WorldController {
	
	public Player player;
	
	public WorldController() {
		init();
	}
	
	public void init() {
		player = new Player(100,100);
	}
	
	public void updateWorld() {
		handleInput();
		player.update();
	}
	
	public void handleInput() {
		if(Gdx.input.isKeyPressed(Keys.SPACE)) {
			player.velocity.x = 1.5f;
			player.velocity.y = 1.5f;
		} else if(!Gdx.input.isKeyPressed(Keys.SPACE)) {
			player.velocity.x = 0;
			player.velocity.y = 0;
		}
	}

}
