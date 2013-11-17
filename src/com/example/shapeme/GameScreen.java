package com.example.shapeme;

import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Input.TouchEvent;
import com.badlogic.androidgames.framework.Screen;

public class GameScreen extends Screen{
	private Board board;
	
	public GameScreen(Game game) {
		super(game);
		board = new Board(30, 20);
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
			for (int i = 0; i < board.getWidth(); ++i)
				for (int j = 0; j < board.getHeight(); ++j)
					if (currentEvent.type == TouchEvent.TOUCH_UP && this.inBounds(currentEvent, board.squares[i][j].getX(), board.squares[i][j].getY(), board.squares[i][j].getPixmap().getWidth(), board.squares[i][j].getPixmap().getHeight())) {
						/* Change the state for the touched square. */
						board.squares[i][j].nextState();
					}
		}
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		
		/* Draw the background. */
		g.drawPixmap(Assets.gameScreenBackground, 0, 0);

		
		/* Draw the squares. */
		for (int i = 0; i < board.getWidth(); ++i)
			for (int j = 0; j < board.getHeight(); ++j)
				g.drawPixmap(board.squares[i][j].getPixmap(), board.squares[i][j].getX(), board.squares[i][j].getY());
		
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
