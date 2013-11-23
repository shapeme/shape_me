package com.example.shapeme;

import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Input.TouchEvent;
import com.badlogic.androidgames.framework.Screen;

public class GameScreen extends Screen{
	private Level level;
	public GameScreen(Game game) {
		super(game);
		level = new Level(20, 13);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		/* Get the touch events. */
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		
		for (int index = 0; index < touchEvents.size(); ++index) {
			TouchEvent currentEvent = touchEvents.get(index);
			
			/* Check if the back button was pressed. */
			if (currentEvent.type == TouchEvent.TOUCH_UP && this.inBounds(currentEvent, 1700, 900, Assets.backButton.getWidth(), Assets.backButton.getHeight())) {
				game.setScreen(new MainMenuScreen(game));
			}
			
			/* Check if one of the squares was touched. */
			for (int i = 0; i < level.getBoardWidth(); ++i)
				for (int j = 0; j < level.getBoardHeight(); ++j)
					if (currentEvent.type == TouchEvent.TOUCH_DOWN && this.inBounds(currentEvent, level.getSquare(i, j).getX(), level.getSquare(i, j).getY(), level.getSquare(i, j).getPixmap().getWidth(), level.getSquare(i, j).getPixmap().getHeight())) {
						/* Change the state for the touched square. */
						level.getSquare(i, j).nextState();
					}
		}
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		
		/* Draw the background. */
		g.drawPixmap(Assets.gameScreenBackground, 0, 0);

		
		/* Draw the play board squares. */
		for (int i = 0; i < level.getBoardWidth(); ++i)
			for (int j = 0; j < level.getBoardHeight(); ++j)
				g.drawScaledPixmap(level.getSquare(i, j).getPixmap(), level.getSquare(i, j).getX(), level.getSquare(i, j).getY(), level.getSquareSize(), level.getSquareSize());
		
		/* Draw the number squares. */
		
		/* Under the board. */
		int x = level.getLeftOffset();
		int y = level.getSquare(0, level.getBoardHeight() - 1).getY() + level.getSquareSize();
		for (int i = 0; i < level.getBoardWidth(); ++i) {
			for (int j = 0; j < 5; ++j)
				g.drawScaledPixmap(Assets.numberSquare, i * level.getSquareSize() + x, y + j * level.getSquareSize(), level.getSquareSize(), level.getSquareSize());
		}
		for (int i = 0; i < level.getBoardWidth(); ++i)
			for (int j = 0; j < 5; ++j)
				g.drawText("5", x + 10 + i * level.getSquareSize(), y  + (int)(level.getSquareSize() / 1.3) + level.getSquareSize() * j, level.getSquareSize() - 10);

		
		/* To the right of the board. */
		x = level.getSquare(level.getBoardWidth() - 1, 0).getX() + level.getSquareSize();
		y = level.getTopOffset();
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < level.getBoardHeight(); ++j)
				g.drawScaledPixmap(Assets.numberSquare, i * level.getSquareSize() + x, y + j * level.getSquareSize(), level.getSquareSize(), level.getSquareSize());
		}
		
		for (int i = 0; i < 5; ++i)
			for (int j = 0; j < level.getBoardHeight(); ++j)
				g.drawText("5", x + 10 + i * level.getSquareSize(), y  + (int)(level.getSquareSize() / 1.3) + level.getSquareSize() * j, level.getSquareSize() - 10);
		
		/* Draw the empty squares in the right bottom corner of the board. */
		x = level.getSquare(level.getBoardWidth() - 1, 0).getX() + level.getSquareSize();
		y = level.getSquare(0, level.getBoardHeight() - 1).getY() + level.getSquareSize();
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j)
				g.drawScaledPixmap(Assets.emptySquare, i * level.getSquareSize() + x, y + j * level.getSquareSize(), level.getSquareSize(), level.getSquareSize());
		}
		
		
		
		/* Draw the buttons. */
		g.drawPixmap(Assets.backButton, 1700, 900);
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
