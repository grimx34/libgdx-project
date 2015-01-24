package com.jamjor.shooter;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Jamahl on 24/01/2015.
 */
public class GameScreen implements Screen, InputProcessor {
    private Game game;

    private BitmapFont timeText;

    private SpriteBatch spriteBatch;
    private Texture player;

    private int playerX;

    private float time;

    private int i;

    GameScreen(Game g) {
        game = g;
    }
    @Override
    public void show() {
        i = 0;
        time = 0;
        spriteBatch = new SpriteBatch();
        player = new Texture("ship.png");
        playerX = 300;


        timeText = new BitmapFont();
        timeText.setColor(Color.BLACK);
        timeText.setScale(4);

        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        spriteBatch.draw(player, playerX, 200);
        timeText.draw(spriteBatch, Float.toString(1f/time), 600, 100);
        spriteBatch.end();

        if(i > 1000)
            game.setScreen(new GameScreen(game));

        time = time * 0.9f + delta * 0.1f;

        i++;
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

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

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

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        playerX = screenX;
        if(playerX < 125){
            playerX = 125;
        }
        if(playerX > Gdx.graphics.getWidth()-125){
            playerX = Gdx.graphics.getWidth()-125;
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
}
