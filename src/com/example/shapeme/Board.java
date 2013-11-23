package com.example.shapeme;

public class Board {
	public Square[][] squares;
	private int width;
	private int height;
	private int topOffset;
	private int leftOffset;
	
	public Board(int width, int height, int squareSize, int leftOffset, int topOffset) {
		this.width = width;
		this.height = height;
		this.leftOffset = leftOffset;
		this.topOffset = topOffset;
		squares = new Square[width][height];
		initialize(squareSize);
	}
	
	private void initialize(int squareSize) {
		/* Create the squares and set their positions on the screen. */
		for (int i = 0; i < this.width; ++i) 
			for (int j = 0; j < this.height; ++j)
				this.squares[i][j] = new Square(this.leftOffset + i * squareSize, this.topOffset + j * squareSize);
	}
	
	public int getWidth() {
		return (this.width);
	}
	
	public int getHeight() {
		return (this.height);
	}
}
