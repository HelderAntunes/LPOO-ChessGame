package chessGame.logic;

import java.util.ArrayList;

public class ChessGame {
	
	private Board board;
	private Player playerWhite;
	private Player playerBlack;
	
	
	public ChessGame(char[][] board){
		this.board = new Board(board);
		this.playerBlack = new Player(Color.BLACK);
		this.playerWhite = new Player(Color.WHITE);
	}
	
	public ArrayList<Position> getPossibleMoves(Position position){
		return board.getPossibleMoves(position);
	}
	
	/**
	 * Move a piece in initial position to a new position.
	 * The function return false when there isn't a piece in initial position, 
	 * the player try move a opponent piece, or the move is invalid
	 * 
	 * @param player
	 * @param iniPosition initial position
	 * @param endPosition end position
	 * @return true if the move was successful , false otherwise.
	 */
	public boolean move(Player player, Position iniPosition, Position endPosition){
		
		if(board.getBox(iniPosition).isEmpty() == true)
			return false;
		
		if(player.getColor() != board.getBox(iniPosition).getPiece().getColor())
			return false;
		
		ArrayList<Position> possibleMoves = getPossibleMoves(iniPosition);
		for(int i = 0;i < possibleMoves.size();i++){
			if(possibleMoves.get(i).equals(endPosition)){
				board.move(iniPosition, endPosition);
				return true;
			}
		}
		
		return false;
	}
	
	public char[][] getBoard(){
		return board.getBoard();
	}
}
