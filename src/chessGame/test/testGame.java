package chessGame.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chessGame.logic.ChessGame;

public class testGame {
	
	static char [][] b1 = {{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'}, 
							{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},  
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}}; 
	
	@Test
	public void testGame1() {
		// Kasparov - Gheorghiu, Moscovo 1982
		ChessGame game = new ChessGame(b1);
		assertEquals(true, game.move("d2 d4"));
		assertEquals(true, game.move("g8 f6"));
		
		assertEquals(true, game.move("c2 c4"));
		assertEquals(true, game.move("e7 e6"));
		
		assertEquals(true, game.move("g1 f3"));
		assertEquals(true, game.move("b7 b6"));
		
		assertEquals(true, game.move("a2 a3"));
		assertEquals(true, game.move("c8 b7"));
		
		assertEquals(true, game.move("b1 c3"));
		assertEquals(true, game.move("d7 d5"));
		
		assertEquals(true, game.move("c4 d5"));
		assertEquals(true, game.move("f6 d5"));

		assertEquals(true, game.move("d1 c2"));
		assertEquals(true, game.move("c7 c5"));
		
		assertEquals(true, game.move("e2 e4"));
		assertEquals(true, game.move("d5 c3"));
		
		assertEquals(true, game.move("b2 c3"));
		assertEquals(true, game.move("f8 e7"));
		
		assertEquals(true, game.move("f1 b5"));
		assertEquals(true, game.move("b7 c6"));
		
		assertEquals(true, game.move("b5 d3"));
		assertEquals(true, game.move("b8 d7"));
		
		assertEquals(true, game.move("e1 g1"));
		assertEquals(true, game.move("h7 h6"));
		
		assertEquals(true, game.move("f1 d1"));
		assertEquals(true, game.move("d8 c7"));
		
		assertEquals(true, game.move("d4 d5"));
		for(int i = 0;i < 8;i++){
			for(int j = 0;j < 8;j++){
				System.out.print(game.getBoard()[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
