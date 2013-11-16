package com.example.shapeme;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Graphics.PixmapFormat;
import com.badlogic.androidgames.framework.Screen;

public class LoadingScreen extends Screen{
	public LoadingScreen(Game game)	{
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		
		/* Load assets. */
		Assets.background = g.newPixmap("background.png", PixmapFormat.ARGB4444);
		/* Set the main menu screen. */
		game.setScreen(new MainMenuScreen(game));
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	
}
