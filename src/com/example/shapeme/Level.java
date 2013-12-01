package com.example.shapeme;

public class Level {
	private Board board;
	private int squareSize;
	private int topOffset;
	private int leftOffset;
	
	public Level(int width, int height) {
		this.squareSize = 1000 / (height + 5);
		this.leftOffset = (1300 - width * squareSize) / 2;
		this.topOffset = 40;
		this.board = new Board(width, height, squareSize, leftOffset, topOffset);
	}
	
	public int getBoardWidth() {
		return board.getWidth();
	}
	
	public int getBoardHeight() {
		return board.getHeight();
	}
	
	public Square getSquare(int x, int y)
	{
		return board.squares[x][y];
	}
	
	public int getSquareSize() {
		return squareSize;
	}
	
	public int getLeftOffset() {
		return this.leftOffset;
	}
	
	public int getTopOffset() {
		return this.topOffset;
	}
}
