package chessGame.logic;

import java.util.ArrayList;

class Piece {
	
	protected Color color;
	protected Position position;
	
	public Piece(Color color, Position position){
		this.color = color;
		this.position = position;
	};
	
	public Piece(Color color){
		this.color = color;
	}
	
	public String toString(){
		return " ";
	}
	
	public Color getColor(){
		return color;
	}
	
	public ArrayList<Position> getPossibleMoves(Box board[][]){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		return validPositions;
	}
}
