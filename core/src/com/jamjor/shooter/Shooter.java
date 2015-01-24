package com.jamjor.shooter;

import com.badlogic.gdx.Game;

public class Shooter extends Game {

	MainMenuScreen mainMenuScreen;
	GameScreen gameScreen;
	SplshScreen splashScreen;

	@Override
	public void create () {
		mainMenuScreen = new MainMenuScreen(this);
		gameScreen = new GameScreen(this);
		splashScreen = new SplshScreen(this);
		setScreen(splashScreen);
	}

}
