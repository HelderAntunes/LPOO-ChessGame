package chessGame.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestQueenPossibleMoves {
	
	static char [][] b1 = {{'R', 'H', 'B', 'Q', 'K', 'P', 'H', 'R'}, 
							{'P', 'P', ' ', 'P', ' ', ' ', 'B', 'P'}, 
							{' ', ' ', 'P', ' ', 'P', 'P', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', 'q', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},  
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', ' ', 'k', 'b', 'h', 'r'}};
		
	static char [][] b2 = {{'R', 'H', 'B', 'Q', 'K', 'P', 'H', 'R'}, 
							{'P', 'P', 'X', 'P', 'X', ' ', 'B', 'P'}, 
							{' ', 'X', 'P', ' ', 'P', 'P', ' ', ' '}, 
							{'X', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', 'q', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},  
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', ' ', 'k', 'b', 'h', 'r'}};
	
	static char [][] b3 = {{'R', 'H', 'B', 'Q', 'K', 'P', 'H', 'R'}, 
							{'P', 'P', ' ', 'P', ' ', ' ', 'B', 'X'}, 
							{' ', ' ', 'X', ' ', 'X', 'P', 'X', ' '}, 
							{' ', ' ', ' ', 'X', 'X', 'X', ' ', ' '}, 
							{'X', 'X', 'X', 'X', 'q', 'X', 'X', 'X'}, 
							{' ', ' ', ' ', 'X', 'X', 'X', ' ', ' '},  
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', ' ', 'k', 'b', 'h', 'r'}};

	@Test
	public void testQueen() {
		ChessGame game = new ChessGame(b1);

		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(3,0));
		char[][] boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b2));

		posibleMoves = game.getPossibleMoves(new Position(4,4));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b3));

	}

}
