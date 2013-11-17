package com.example.shapeme;

public class Board {
	public Square[][] squares;
	private int width;
	private int height;
	private int offset;
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		this.offset = 100;
		squares = new Square[width][height];
		initialize();
	}
	
	private void initialize() {
		/* Create the squares and set their positions on the screen. */
		for (int i = 0; i < this.width; ++i) 
			for (int j = 0; j < this.height; ++j)
				this.squares[i][j] = new Square(this.offset + i * Assets.emptySquare.getWidth(), this.offset + j * Assets.emptySquare.getWidth());
	}
	
	public int getWidth() {
		return (this.width);
	}
	
	public int getHeight() {
		return (this.height);
	}
}
