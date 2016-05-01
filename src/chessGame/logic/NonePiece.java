package chessGame.logic;

import chessGame.logic.Board.Color;

public class NonePiece extends Piece{
	
	public NonePiece(Color color){
		super(color);
	}
	
	public String toString(){
		return "N";
	}

}
