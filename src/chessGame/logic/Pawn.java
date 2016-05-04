package chessGame.logic;

import java.util.ArrayList;

class Pawn extends Piece{

	public Pawn(Color color){
		super(color);
	}

	public Pawn(Color color, Position position){
		super(color, position);
	}

	public String toString(){
		return "P";
	}

	public ArrayList<Position> getPossibleMoves(Box board[][]){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		return validPositions;
	}

}
