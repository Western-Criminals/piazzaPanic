package com.westerncriminals.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class PiazzaPanic extends ApplicationAdapter {
	SpriteBatch batch;
	private OrthographicCamera camera;
	Texture chef;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		chef = new Texture("oneMan.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(chef, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		chef.dispose();
	}
}
