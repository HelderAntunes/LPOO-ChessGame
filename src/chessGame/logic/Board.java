package chessGame.logic;

import java.util.ArrayList;


public class Board {
	
	public enum Color {WHITE, BLACK};
	
	private Box board[][] = new Box[8][8];
	private ArrayList<Piece> removed = new ArrayList<Piece>();
	
	
	public Board(){
	//torre preta 1
	Rook blackRook1 = new Rook(Color.BLACK);
	Box rook1B = new Box(blackRook1,Color.WHITE);
	board[0][0]=rook1B;
	
	}
	
	
	public boolean move(int sourceX,int sourceY,int destX,int destY){
		return true;
	}
	
	public boolean checkForCheck(){
		return true;
	}
	
	public void removePiece(int sourceX,int sourceY){
		
	}

}
