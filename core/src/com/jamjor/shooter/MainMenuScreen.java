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
public class MainMenuScreen implements Screen {
    private Game game;

    private SpriteBatch spriteBatch;

    private BitmapFont playButton, exitButton;

    MainMenuScreen(Game g) {
        game = g;
    }
    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        playButton = new BitmapFont();
        playButton.setColor(Color.BLACK);
        playButton.setScale(4);
        exitButton = new BitmapFont();
        exitButton.setColor(Color.BLACK);
        exitButton.setScale(4);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        spriteBatch.begin();
        playButton.draw(spriteBatch, "Play", 500, 900);
        exitButton.draw(spriteBatch, "Exit", 500, 800);
        spriteBatch.end();

        if(Gdx.input.justTouched())
            game.setScreen(new GameScreen(game));
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
    }
}
