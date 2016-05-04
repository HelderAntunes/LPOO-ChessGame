package chessGame.logic;

import java.util.ArrayList;

public class ChessGame {
	
	private Board board;
	private Player player1;
	private Player player2;
	
	public ArrayList<Position> getPossibleMoves(Position position){
		return board.getPossibleMoves(position);
	}
	
	public ChessGame(char[][] board){
		this.board = new Board(board);
	}
	
	public char[][] getBoard(){
		return board.getBoard();
	}
}
