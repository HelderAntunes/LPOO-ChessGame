package chessGame.logic;

import java.util.ArrayList;

class Horse extends Piece{
	
	public Horse(Color color){
		super(color);
	}
	
	public Horse(Color color, Position position){
		super(color, position);	
	}
	
	public String toString(){
		return "H";
	}
	
	public ArrayList<Position> getPossibleMoves(Box board[][]){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		return validPositions;
	}

}
