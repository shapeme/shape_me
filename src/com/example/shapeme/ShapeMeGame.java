package com.example.shapeme;

import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.impl.AndroidGame;

public class ShapeMeGame extends AndroidGame{
	public Screen getStartScreen()
	{
		return new LoadingScreen(this);
	}
}
