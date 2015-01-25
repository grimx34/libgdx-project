package com.jamjor.shooter;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Jamahl on 24/01/2015.
 */
public class SplshScreen implements Screen {
    private SpriteBatch spriteBatch;
    private BitmapFont splsh;
    private Game game;

    SplshScreen(Game g){
        game = g;
    }

    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        splsh = new BitmapFont();
        splsh.setColor(Color.BLACK);
        splsh.setScale(4);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        splsh.draw(spriteBatch, "A JamJor Games Production", 200,950);
        spriteBatch.end();

        if(Gdx.input.justTouched())
            game.setScreen(new MainMenuScreen(game));
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
        dispose();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        splsh.dispose();
    }
}
