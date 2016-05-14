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
	
	static char [][] b5 = {{'R', 'H', 'B', 'Q', 'K', 'B', ' ', 'R'},
						{'P', 'P', 'P', 'P', 'H', 'P', 'P', 'P'},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', 'p', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', 'h'},
						{'p', 'p', 'p', 'p', ' ', 'p', 'p', 'p'},
						{'r', 'h', 'b', 'q', 'k', 'b', ' ', 'r'}};
	
	static char [][] b6 = {{'R', 'H', 'B', 'Q', 'K', 'B', ' ', 'R'},
							{'P', 'P', 'P', 'P', 'H', 'P', 'P', 'P'},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
							{' ', ' ', ' ', ' ', 'P', ' ', 'X', ' '},
							{' ', ' ', ' ', ' ', 'p', 'X', ' ', ' '},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', 'h'},
							{'p', 'p', 'p', 'p', ' ', 'p', 'p', 'p'},
							{'r', 'h', 'b', 'q', 'k', 'b', 'X', 'r'}};

	@Test
	public void testHorse() {
		ChessGame game = new ChessGame(b1);

		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(1,7));
		char[][] boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b2));

		posibleMoves = game.getPossibleMoves(new Position(6,0));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b3));

		posibleMoves = game.getPossibleMoves(new Position(3,3));
		boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b4));
		
		ChessGame game2 = new ChessGame(b5);
		posibleMoves = game2.getPossibleMoves(new Position(7,5));
		boardTest = game2.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		assertEquals(true, new UtilitiesForTest().boardEquals(boardTest, b6));
	}
}
