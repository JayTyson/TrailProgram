package com.trailmech.jeff;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.trailmech.jeff.worldmanagers.WorldController;
import com.trailmech.jeff.worldmanagers.WorldRenderer;

public class TrailGame implements ApplicationListener {
	
	public WorldController worldController;
	public WorldRenderer worldRenderer;
	
	@Override
	public void create() {		
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {	
		worldController.updateWorld();
		Gdx.gl.glClearColor(1, 1, 0.345f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		worldRenderer.renderWorld();
		System.out.println(Gdx.graphics.getFramesPerSecond());
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
