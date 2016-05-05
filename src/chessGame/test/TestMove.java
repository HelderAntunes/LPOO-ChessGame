package chessGame.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chessGame.logic.ChessGame;

public class TestMove {
						//   a   b     c   d     e   f    g     h
	static char [][] b1 = {{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'}, // 1
							{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}, // 2
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 3
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 4
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 5
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},  // 6
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, // 7
							{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}}; // 8
	
	static char[][]  b2 = {{'R', 'H', 'B', 'Q', 'K', 'B', ' ', 'R'}, 
							{'P', 'P', 'P', 'P', ' ', 'P', 'P', 'P'}, 
							{' ', ' ', ' ', ' ', ' ', 'H', ' ', ' '}, 
							{' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', 'p', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', 'h', ' ', ' '},  
							{'p', 'p', 'p', 'p', ' ', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', 'q', 'k', 'b', ' ', 'r'}}; 
	
					     
	static char [][] b3 = {{'R', 'H', 'B', 'Q', 'K', ' ', 'H', 'R'}, // 1
							{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'}, // 2
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 3
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 4
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 5
							{' ', ' ', 'B', ' ', ' ', ' ', ' ', ' '},  // 6
							{'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'}, // 7
							{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}}; // 8
	
	static char [][] b4 = {{'R', 'H', 'B', 'Q', 'K', ' ', 'H', 'R'}, // 1
							{'P', 'P', 'P', 'P', 'P', ' ', 'P', 'P'}, // 2
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 3
							{' ', ' ', ' ', ' ', ' ', 'P', ' ', 'q'}, // 4
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, // 5
							{' ', ' ', 'B', 'p', ' ', ' ', ' ', ' '},  // 6
							{'p', 'p', 'p', ' ', 'p', 'p', 'p', 'p'}, // 7
							{'r', 'h', 'b', ' ', 'k', 'b', 'h', 'r'}}; // 8
	
	
	
	@Test
	public void testMove() {

		ChessGame game = new ChessGame(b1);
		
		// valid moves
		assertEquals(true, game.move("e7 e5"));
		assertEquals(true, game.move("e2 e4"));
		
		// test move in empty box
		assertEquals(false, game.move("e7 e5"));
		assertEquals(false, game.move("e2 e4"));
		
		// test move a opponent piece(white try move a black piece)
		assertEquals(false, game.move("a2 a3"));
		
		assertEquals(true, game.move("g8 f6"));
		
		// test move a opponent piece(black try move a white piece)
		assertEquals(false, game.move("b8 c6"));
		
		assertEquals(true, game.move("g1 f3"));
		
		boolean sucess = true;
		char[][] boardTest = game.getBoard();
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(boardTest[i][j] != b2[i][j]){
					sucess = false;
					break;
				}
		assertEquals(true, sucess);
	}
	
	@Test
	public void testMoveThatCausesCheckMate() {
		ChessGame game = new ChessGame(b3);
		assertEquals(false, game.move("d7 d6"));
		assertEquals(false, game.move("d7 d5"));
	}
	
	@Test
	public void testCheck() {
		ChessGame game = new ChessGame(b4);
		assertEquals(true, game.blackIsInCheck());
		assertEquals(true, game.whiteIsInCheck());
	}
	
	
	
	

}
