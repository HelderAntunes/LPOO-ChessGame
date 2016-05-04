package chessGame.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestRookMove {

	static char [][] b1 = {{' ', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', 'R', ' ', 'B', ' ', 'r', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', 'p', ' ', 'p', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', ' '}};

	static char [][] b2 = {{' ', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
			{'X', 'X', 'R', 'X', 'B', ' ', 'r', ' '},
			{' ', ' ', 'X', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', 'X', ' ', 'p', ' ', 'p', ' '},
			{'p', 'p', 'X', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', ' '}};

	static char [][] b3 = {{' ', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'X', 'P'},
			{' ', ' ', ' ', ' ', ' ', ' ', 'X', ' '},
			{' ', ' ', 'R', ' ', 'X', 'X', 'r', 'X'},
			{' ', ' ', ' ', ' ', ' ', ' ', 'X', ' '},
			{' ', ' ', ' ', ' ', 'p', ' ', 'p', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', ' '}};

	@Test
	public void testRook() {
		boolean sucess = true;
		ChessGame game = new ChessGame(b1);

		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(2,3));
		char[][] boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(boardTest[i][j] != b2[i][j]){
					sucess = false;
					break;
				}
		assertEquals(true, sucess);

		posibleMoves = game.getPossibleMoves(new Position(6,3));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(boardTest[i][j] != b3[i][j]){
					sucess = false;
					break;
				}
		assertEquals(true, sucess);
	}

}
