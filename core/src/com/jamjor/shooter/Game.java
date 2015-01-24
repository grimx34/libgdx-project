package com.jamjor.shooter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
	Texture img;
	float x = 300;
	private int imgWidth;


	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("ship.png");
		imgWidth = img.getHeight();

		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor((float)213/255, (float)38/255, (float)181/255, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x-imgWidth, 200);
		batch.end();
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		x = screenX;
		if (x < (imgWidth/2)) {
			x = (imgWidth/2);
		}
		if(x > Gdx.graphics.getWidth()-(imgWidth/2)){
				x = Gdx.graphics.getWidth()-(imgWidth/2);
			}
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

}
