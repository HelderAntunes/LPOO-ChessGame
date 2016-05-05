package chessGame.logic;

import java.util.ArrayList;

class King extends Piece{
	
	King(Color color){
		super(color);
	}
	
	King(Color color, Position position){
		super(color, position);
	}
	
	public String toString(){
		return "K";
	}
	
	ArrayList<Position> getPossibleMoves(Box board[][]){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		return validPositions;
	}
}
