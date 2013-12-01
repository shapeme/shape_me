package com.example.shapeme;

import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Input.TouchEvent;
import com.badlogic.androidgames.framework.Screen;

public class MainMenuScreen extends Screen {
	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		/* Get the touch events for the current screen. */
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		
		for (int index = 0; index < touchEvents.size(); ++index) {
			TouchEvent currentEvent = touchEvents.get(index);
			
			/* Check if the start game button was pressed. */
			if (currentEvent.type == TouchEvent.TOUCH_UP && this.inBounds(currentEvent, 760, 340, Assets.startButton.getWidth(), Assets.startButton.getHeight())) {
				game.setScreen(new GameScreen(game, 1));
			}
			
			/* Check if the tutorial button was pressed. */
			if (currentEvent.type == TouchEvent.TOUCH_UP && this.inBounds(currentEvent, 760, 490, Assets.tutorialButton.getWidth(), Assets.tutorialButton.getHeight())) {
				game.setScreen(new TutorialScreen(game));
			}
			
			/* Check if the settings button was pressed. */
			if (currentEvent.type == TouchEvent.TOUCH_UP && this.inBounds(currentEvent, 760, 640, Assets.settingsButton.getWidth(), Assets.settingsButton.getHeight())) {
				game.setScreen(new SettingsScreen(game));
			}
		}
		
		
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		
		/* Draw the background. */
		g.drawPixmap(Assets.mainMenuBackground, 0, 0);
		
		/* Draw the buttons. */
		g.drawPixmap(Assets.startButton, 760, 340);
		g.drawPixmap(Assets.tutorialButton, 760, 490);
		g.drawPixmap(Assets.settingsButton, 760, 640);
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
