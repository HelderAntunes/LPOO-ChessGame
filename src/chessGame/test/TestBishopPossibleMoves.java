package chessGame.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestBishopPossibleMoves {

	static char [][] b1 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', 'B', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', 'p', ' ', 'p', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}};

	static char [][] b2 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{'X', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', 'X', ' ', ' ', 'B', ' ', ' ', ' '},
			{' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', 'X', 'p', ' ', 'p', 'X'},
			{'p', 'p', 'p', 'p', 'X', 'p', 'X', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}};

	static char [][] b3 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', 'X', ' ', 'X', ' ', ' '},
			{' ', ' ', ' ', ' ', 'B', ' ', ' ', ' '},
			{' ', ' ', ' ', 'X', ' ', 'X', ' ', ' '},
			{' ', ' ', 'X', ' ', 'p', ' ', 'X', ' '},
			{'p', 'X', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}};

	@Test
	public void testBishop() {
		ChessGame game = new ChessGame(b1);
		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(5,7));
 
		char[][] boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b2));

		posibleMoves = game.getPossibleMoves(new Position(4,3));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b3));
	}

}
