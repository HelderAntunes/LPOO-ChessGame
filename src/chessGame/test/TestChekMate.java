package chessGame.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chessGame.logic.ChessGame;

public class TestChekMate {
	
	static char [][] b1 = {{'R', 'H', ' ', ' ', 'K', 'B', 'H', 'R'},
						{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', 'B', ' ', ' ', ' ', ' ', ' '},
						{' ', ' ', ' ', ' ', 'p', ' ', ' ', ' '},
						{' ', ' ', ' ', 'p', ' ', 'p', 'p', ' '},
						{'p', 'p', 'p', ' ', ' ', 'Q', ' ', 'p'},
						{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}};
	
	static char [][] b2 = {{'K', ' ', ' ', ' ', ' ', 'B', 'H', 'R'},
							{' ', ' ', 'P', 'P', 'P', 'P', 'P', 'P'},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
							{'r', 'r', ' ', ' ', 'p', ' ', ' ', ' '},
							{' ', ' ', ' ', 'p', ' ', 'p', 'p', ' '},
							{'p', 'p', 'p', ' ', ' ', ' ', 'Q', 'p'},
							{' ', 'h', 'b', 'q', 'k', 'b', 'h', ' '}};
	
	@Test
	public void testCheckMateOfBlack() {
		ChessGame game = new ChessGame(b1);
		assertEquals(true, game.blackWinsByCheckMate());
	}
	
	@Test
	public void testCheckMateOfWhite() {
		ChessGame game = new ChessGame(b2);
		assertEquals(true, game.whiteWinsByCheckMate());
	}

}
