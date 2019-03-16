package com.trailmech.jeff.worldmanagers;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class WorldRenderer {
	
	private OrthographicCamera camera;
	public ShapeRenderer shapeRenderer;
	
	public WorldController worldController;
	
	
	
	public WorldRenderer(WorldController worldController) {
		this.worldController = worldController;
		camera = new OrthographicCamera();
		camera.setToOrtho(false);
		camera.update();
		shapeRenderer = new ShapeRenderer();
		
		
	}
	
	public void renderWorld() {
		shapeRenderer.setProjectionMatrix(camera.combined);
		shapeRenderer.setColor(Color.RED);
		worldController.player.render(shapeRenderer);	
	}

}
