package com.example.shapeme;

public class Level {
	private Board board;
	private int squareSize;
	private int topOffset;
	private int leftOffset;
	private int width;
	private int height;
	public int[][] rightNumbers;
	public int[][] bottomNumbers;
	private boolean[][] filledSquares;
	
	public Level(int levelNumber){
		this.readData(levelNumber);
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
	
	public void readData(int levelNumber){
		switch (levelNumber) {
			case 1: {
				this.width = 15;
				this.height = 15;
				this.rightNumbers = new int[this.height][5];
				this.rightNumbers[0][0] = this.rightNumbers[1][0] = this.rightNumbers[14][0] = 15;
				this.rightNumbers[2][0] = this.rightNumbers[2][1] = 3;
				this.rightNumbers[3][0] = this.rightNumbers[3][1] = this.rightNumbers[4][0] = this.rightNumbers[4][1] = 2;
				this.rightNumbers[5][0] = this.rightNumbers[5][2] = 1; this.rightNumbers[5][1] = 7;
				this.rightNumbers[6][0] = this.rightNumbers[6][1] = this.rightNumbers[6][2] = this.rightNumbers[6][3] = 1;
				this.rightNumbers[7][0] = this.rightNumbers[7][3] = 1 ;this.rightNumbers[7][1] = this.rightNumbers[7][2] = 2;
				this.rightNumbers[8][0] = this.rightNumbers[8][2] = 4; this.rightNumbers[8][1] = 3;
				this.rightNumbers[9][0] = this.rightNumbers[9][2] = 2; this.rightNumbers[9][1] = 5;
				this.rightNumbers[10][0] = this.rightNumbers[10][2] = 2; this.rightNumbers[10][1] = 5;
				this.rightNumbers[11][0] = this.rightNumbers[11][2] = 2; this.rightNumbers[11][1] = 5;
				this.rightNumbers[12][0] = this.rightNumbers[12][2] = 2; this.rightNumbers[12][1] = 3;
				this.rightNumbers[13][0] = this.rightNumbers[13][1] = 2;

				this.bottomNumbers = new int[5][this.width];
				this.bottomNumbers[0][0] = this.bottomNumbers[0][14] = 15;
				this.bottomNumbers[0][1] = 5; this.bottomNumbers[1][1] = 7;
				this.bottomNumbers[0][2] = 3; this.bottomNumbers[1][2] = this.bottomNumbers[2][2] = 1;
				this.bottomNumbers[0][3] = this.bottomNumbers[1][3] = 2; this.bottomNumbers[2][3] = 1;
				this.bottomNumbers[0][4] = 2; this.bottomNumbers[1][4] = 3; this.bottomNumbers[2][4] = 1;
				this.bottomNumbers[0][5] = 2; this.bottomNumbers[1][5] = this.bottomNumbers[3][5] = 1; this.bottomNumbers[2][5] = 3;
				this.bottomNumbers[0][6] = 2; this.bottomNumbers[1][6] = this.bottomNumbers[3][6] = 1; this.bottomNumbers[2][6] = 5;
				this.bottomNumbers[0][7] = 2; this.bottomNumbers[1][7] = this.bottomNumbers[3][7] = 1; this.bottomNumbers[2][7] = 5;
				this.bottomNumbers[0][8] = 2; this.bottomNumbers[1][8] = this.bottomNumbers[3][8] = 1; this.bottomNumbers[2][8] = 5;
				this.bottomNumbers[0][9] = 2; this.bottomNumbers[1][9] = this.bottomNumbers[3][9] = 1; this.bottomNumbers[2][9] = 3;
				this.bottomNumbers[0][10] = 2; this.bottomNumbers[1][10] = 3; this.bottomNumbers[2][10] = 1;
				this.bottomNumbers[0][11] = this.bottomNumbers[1][11] = 2; this.bottomNumbers[2][11] = 1;
				this.bottomNumbers[0][12] = 3; this.bottomNumbers[1][12] = this.bottomNumbers[2][12] = 1;
				this.bottomNumbers[0][13] = 5; this.bottomNumbers[1][13] = 7;
				
				this.filledSquares = new boolean[this.height][this.width];
				for (int i = 0; i < this.width; ++i) {
					this.filledSquares[0][i] = this.filledSquares[1][i] = this.filledSquares[14][i] = true;
				}
				this.filledSquares[2][0] = this.filledSquares[2][1] = this.filledSquares[2][2] = this.filledSquares[2][12] = this.filledSquares[2][13] = this.filledSquares[2][14] = true;
				this.filledSquares[3][0] = this.filledSquares[3][1] = this.filledSquares[3][13] = this.filledSquares[3][14] = true;
				this.filledSquares[4][0] = this.filledSquares[4][1] = this.filledSquares[4][13] = this.filledSquares[4][14] = true;
				this.filledSquares[5][0] = this.filledSquares[5][14] = true;
				for (int i = 4; i < 11; ++i) {
					this.filledSquares[5][i] = true;
				}
				this.filledSquares[6][0] = this.filledSquares[6][4] = this.filledSquares[6][10] = this.filledSquares[6][14] = true;
				this.filledSquares[7][0] = this.filledSquares[7][3] = this.filledSquares[7][4] = this.filledSquares[7][10] = this.filledSquares[7][11] = this.filledSquares[7][14] = true;
				for (int i = 0; i < 4; ++i) {
					this.filledSquares[8][i] = this.filledSquares[8][14 - i] = true;
				}
				this.filledSquares[8][6] = this.filledSquares[8][7] = this.filledSquares[8][8] = true;
				for (int i = 9; i < 14; ++i) {
					this.filledSquares[i][0] = this.filledSquares[i][1] = this.filledSquares[i][13] = this.filledSquares[i][14] = true;
				}
				for (int i = 5; i < 10; ++i) {
					this.filledSquares[9][i] = this.filledSquares[10][i] = this.filledSquares[11][i] = true;
				}
				this.filledSquares[12][6] = this.filledSquares[12][7] = this.filledSquares[12][8] = true;
			}
		}
	}
	
	public boolean finished() {
		for (int i = 0; i < this.height; ++i){
			for (int j = 0; j < this.width; ++j) {
				if (this.filledSquares[i][j] && !this.board.squares[j][i].isFilled()) 
					return (false);
				if (!this.filledSquares[i][j] && this.board.squares[j][i].isFilled())
					return (false);
			}
		}
		return (true);
	}
}
