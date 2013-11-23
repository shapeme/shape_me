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
		Assets.mainMenuBackground = g.newPixmap("mainMenuBackground.png", PixmapFormat.ARGB4444);
		Assets.gameScreenBackground = g.newPixmap("gameScreenBackground.png", PixmapFormat.ARGB4444);
		Assets.tutorialScreenBackground = g.newPixmap("tutorialScreenBackground.png", PixmapFormat.ARGB4444);
		Assets.settingsScreenBackground = g.newPixmap("settingsScreenBackground.png", PixmapFormat.ARGB4444);
		Assets.startButton = g.newPixmap("startGameButton.png", PixmapFormat.ARGB4444);
		Assets.tutorialButton = g.newPixmap("tutorialButton.png", PixmapFormat.ARGB4444);
		Assets.settingsButton = g.newPixmap("settingsButton.png", PixmapFormat.ARGB4444);
		Assets.backButton = g.newPixmap("backButton.png", PixmapFormat.ARGB4444);
		Assets.emptySquare = g.newPixmap("emptySquare.png", PixmapFormat.ARGB4444);
		Assets.crossedSquare = g.newPixmap("crossedSquare.png", PixmapFormat.ARGB4444);
		Assets.filledSquare = g.newPixmap("filledSquare.png", PixmapFormat.ARGB4444);
		Assets.numberSquare = g.newPixmap("numberSquare.png", PixmapFormat.ARGB4444);
		
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
