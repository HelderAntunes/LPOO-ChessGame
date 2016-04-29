package chessGame.logic;

import java.util.ArrayList;

public class Board {
	
	private Box board[][] = new Box[8][8];
	private ArrayList<Piece> removed = new ArrayList<Piece>();
	
	
	public boolean move(int sourceX,int sourceY,int destX,int destY){
		return true;
	}
	
	public boolean checkForCheck(){
		return true;
	}
	
	public void removePiece(int sourceX,int sourceY){
		
	}

}
