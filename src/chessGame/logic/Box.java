package chessGame.logic;

import chessGame.logic.Board.Color;

class Box {
	private Piece piece;
	private Color color;
	
	public Box(Piece piece,Color color){
		this.piece=piece;
		this.color=color;
	}
	
	public String getChar(){
		return this.piece.toString();
	}
	

}
