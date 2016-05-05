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

}
