package com.trailmech.jeff.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class Player {
	
	public Vector2 position;
	public Vector2 velocity;
	
	public ArrayList<Vector2> histPos;
	
	public Player(float x,float y) {
		position = new Vector2(x,y);
		velocity = new Vector2();
		
		histPos = new ArrayList<Vector2>();
	}
	
	public void update() {
		position.add(velocity);
		
		Vector2 v = new Vector2(position.x,position.y);
		histPos.add(v);
		if(histPos.size() > 25) {
			histPos.remove(0);
		}
		//System.out.println(histPos.size());
	}
	
	public void render(ShapeRenderer shapeRenderer) {
		shapeRenderer.begin(ShapeType.Filled);
		shapeRenderer.ellipse(position.x, position.y, 50, 50);
		for(int i = histPos.size()-1;i > 0 ;i--) {
			shapeRenderer.ellipse(histPos.get(i).x, histPos.get(i).y, i, i);
		}
		shapeRenderer.end();
	}

}
