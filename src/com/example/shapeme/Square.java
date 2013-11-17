package com.example.shapeme;

import com.badlogic.androidgames.framework.Pixmap;

public class Square {
	private Pixmap pixmap;
	private int x;
	private int y;
	
	public Square(int x, int y) {
		this.x = x;
		this.y = y;
		pixmap = Assets.emptySquare;
	}
	
	public void nextState() {
		/* If the touched square is empty, fill it out. */
		if (this.pixmap == Assets.emptySquare) {
			this.pixmap = Assets.filledSquare;
			return;
		}
		
		/* If the touched square is filled, cross it out. */
		if (this.pixmap == Assets.filledSquare) {
			this.pixmap = Assets.crossedSquare;
			return;
		}
		
		/* If the touched square is crossed set it to empty. */
		if (this.pixmap == Assets.crossedSquare) {
			this.pixmap = Assets.emptySquare;
			return;
		}
	}
	
	public boolean isFilled() {
		/* Check if the square is filled. */
		return (this.pixmap == Assets.filledSquare);
	}
	
	public int getX() {
		return (this.x);
	}
	
	public int getY() {
		return (this.y);
	}
	
	public Pixmap getPixmap() {
		return (this.pixmap);
	}
}
