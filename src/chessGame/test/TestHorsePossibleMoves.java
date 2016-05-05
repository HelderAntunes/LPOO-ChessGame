package chessGame.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestHorsePossibleMoves {

	static char [][] b1 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', ' ', ' ', 'p', ' ', ' '},
			{' ', ' ', ' ', 'h', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', ' ', 'r'}};

	static char [][] b2 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', ' ', ' ', 'p', ' ', ' '},
			{' ', ' ', ' ', 'h', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{'X', ' ', 'X', ' ', 'p', ' ', ' ', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', ' ', 'r'}};

	static char [][] b3 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', ' ', ' ', 'X', ' ', 'X'},
			{' ', ' ', ' ', 'h', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', 'B', ' ', 'p', ' ', ' ', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', ' ', 'r'}};

	static char [][] b4 = {{'R', 'H', ' ', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'X', 'P', 'X', 'P', 'P', 'P'},
			{' ', 'X', ' ', ' ', ' ', 'p', ' ', ' '},
			{' ', ' ', ' ', 'h', ' ', ' ', ' ', ' '},
			{' ', 'X', ' ', ' ', ' ', 'X', ' ', ' '},
			{' ', ' ', 'X', ' ', 'p', ' ', ' ', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', ' ', 'r'}};

	@Test
	public void testHorse() {
		boolean sucess = true;
		ChessGame game = new ChessGame(b1);

		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(1,7));
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

		posibleMoves = game.getPossibleMoves(new Position(6,0));
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


		posibleMoves = game.getPossibleMoves(new Position(3,3));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(boardTest[i][j] != b4[i][j]){
					sucess = false;
					break;
				}
		assertEquals(true, sucess);
	}

}
