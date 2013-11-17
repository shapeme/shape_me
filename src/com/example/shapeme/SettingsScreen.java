package com.example.shapeme;

import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.Input.TouchEvent;

public class SettingsScreen extends Screen{

	public SettingsScreen(Game game) {
		super(game);
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
		}
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		
		/* Draw the background. */
		g.drawPixmap(Assets.settingsScreenBackground, 0, 0);
		
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
