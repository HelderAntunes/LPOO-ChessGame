package chessGame.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chessGame.logic.ChessGame;

public class TestCastling {

	static char [][] b1 = {{'R', ' ', ' ', ' ', 'K', 'B', 'H', 'R'}, 
							{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}, 
							{' ', 'H', 'B', 'Q', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', 'b', 'h', ' '},  
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', 'q', 'k', ' ', ' ', 'r'}}; 
	
	static char [][] b2 = {{' ', ' ', 'K', 'R', ' ', 'B', 'H', 'R'}, 
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}, 
			{' ', 'H', 'B', 'Q', ' ', ' ', ' ', ' '}, 
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
			{' ', ' ', ' ', ' ', ' ', 'b', 'h', ' '},  
			{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, 
			{'r', 'h', 'b', 'q', ' ', 'r', 'k', ' '}}; 


	@Test
	public void testMove() {
		ChessGame game = new ChessGame(b1);
		assertEquals(true, game.move("e1 g1"));
		assertEquals(true, game.move("e8 c8"));
		assertEquals(true,  new UtilitiesForTest().boardEquals(game.getBoard(), b2));
	}

}
