package chessGame.logic;

import chessGame.logic.Board.Color;

abstract class Piece {
	
	private Color color;
	
	public Piece(Color color){
		this.color=color;
	};
	
	public String toString(){
		return "";
	}
}
