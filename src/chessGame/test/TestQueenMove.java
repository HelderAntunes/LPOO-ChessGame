package chessGame.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestQueenMove {
	
	static char [][] b1 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
							{'P', 'P', 'P', 'P', ' ', 'P', 'P', 'P'},
							{' ', ' ', ' ', ' ', ' ', 'p', ' ', ' '},
							{' ', ' ', ' ', 'h', 'q', ' ', ' ', ' '},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
							{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
							{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
							{'r', 'h', 'b', ' ', 'k', 'b', ' ', 'r'}};
		
	static char [][] b2 = {{'R', 'H', ' ', 'Q', 'X', 'B', 'H', 'R'},
							{'P', 'P', 'X', 'P', 'X', 'P', 'P', 'P'},
							{' ', ' ', ' ', 'X', 'X', 'p', ' ', ' '},
							{' ', ' ', ' ', 'h', 'q', 'X', 'X', 'X'},
							{' ', ' ', ' ', 'X', 'X', 'X', ' ', ' '},
							{' ', ' ', 'X', ' ', 'p', ' ', 'X', ' '},
							{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
							{'r', 'h', 'b', ' ', 'k', 'b', ' ', 'r'}};
	
	static char [][] b3 = {{'R', 'H', 'X', 'Q', 'K', 'B', 'H', 'R'},
							{'P', 'P', 'P', 'P', 'X', 'P', 'P', 'P'},
							{' ', ' ', ' ', ' ', ' ', 'X', ' ', ' '},
							{' ', ' ', ' ', 'h', 'q', ' ', ' ', ' '},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
							{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
							{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
							{'r', 'h', 'b', ' ', 'k', 'b', ' ', 'r'}};

	@Test
	public void testQueen() {
		boolean sucess = true;
		ChessGame game = new ChessGame(b1);

		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(4,3));
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

		posibleMoves = game.getPossibleMoves(new Position(3,0));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(boardTest[i][j] != b3[i][j]){
					System.out.println(i + " " + j);
					sucess = false;
					break;
				}
		assertEquals(true, sucess);

	}

}
