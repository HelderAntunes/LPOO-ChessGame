package chessGame.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestKingMove {

	static char [][] b1 = {{'R', 'H', ' ', 'Q', ' ', 'B', 'H', 'R'},
						{'P', 'P', 'P', 'P', ' ', 'P', 'P', 'P'},
						{' ', ' ', ' ', ' ', 'P', 'p', ' ', 'k'},
						{' ', ' ', ' ', 'h', 'K', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
						{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
						{'r', 'h', 'b', 'q', ' ', 'b', ' ', 'r'}};
	
	static char [][] b2 = {{'R', 'H', ' ', 'Q', ' ', 'B', 'H', 'R'},
						{'P', 'P', 'P', 'P', ' ', 'P', 'P', 'P'},
						{' ', ' ', ' ', 'X', 'P', 'X', ' ', 'k'},
						{' ', ' ', ' ', 'X', 'K', 'X', ' ', ' '},
						{' ', ' ', ' ', 'X', 'X', 'X', ' ', ' '},
						{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
						{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
						{'r', 'h', 'b', 'q', ' ', 'b', ' ', 'r'}};
	
	static char [][] b3 = {{'R', 'H', ' ', 'Q', ' ', 'B', 'H', 'R'},
						{'P', 'P', 'P', 'P', ' ', 'P', 'X', 'X'},
						{' ', ' ', ' ', ' ', 'P', 'p', 'X', 'k'},
						{' ', ' ', ' ', 'h', 'K', ' ', 'X', 'X'},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
						{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
						{'r', 'h', 'b', 'q', ' ', 'b', ' ', 'r'}};

	@Test
	public void testKing() {
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

		posibleMoves = game.getPossibleMoves(new Position(7,2));
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
