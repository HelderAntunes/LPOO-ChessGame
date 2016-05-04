package chessGame.logic;

import java.util.ArrayList;

class King extends Piece{
	
	public King(Color color){
		super(color);
	}
	
	public King(Color color, Position position){
		super(color, position);
	}
	
	public String toString(){
		return "K";
	}
	
	public ArrayList<Position> getPossibleMoves(Box board[][]){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		return validPositions;
	}
}
