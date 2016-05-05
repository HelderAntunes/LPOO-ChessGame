package chessGame.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import chessGame.logic.ChessGame;
import chessGame.logic.Position;

public class TestKingPossibleMoves {

	static char [][] b1 = {{'R', 'H', 'B', 'Q', 'K', ' ', 'H', 'R'}, 
							{'P', 'P', 'P', 'P', 'P', 'P', 'B', 'P'}, 
							{' ', ' ', ' ', ' ', ' ', ' ', 'P', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
							{' ', ' ', ' ', ' ', 'p', ' ', ' ', ' '},  
							{'p', 'p', 'p', 'p', ' ', 'p', 'p', 'p'}, 
							{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}}; 
	
	static char [][] b2 = {{'R', 'H', 'B', 'Q', 'K', ' ', 'H', 'R'}, 
						{'P', 'P', 'P', 'P', 'P', 'P', 'B', 'P'}, 
						{' ', ' ', ' ', ' ', ' ', ' ', 'P', ' '}, 
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
						{' ', ' ', ' ', ' ', 'p', ' ', ' ', ' '},  
						{'p', 'p', 'p', 'p', 'X', 'p', 'p', 'p'}, 
						{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}}; 
	
	static char [][] b3 = {{'R', 'H', 'B', 'Q', 'K', 'X', 'H', 'R'}, 
						{'P', 'P', 'P', 'P', 'P', 'P', 'B', 'P'}, 
						{' ', ' ', ' ', ' ', ' ', ' ', 'P', ' '}, 
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
						{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
						{' ', ' ', ' ', ' ', 'p', ' ', ' ', ' '},  
						{'p', 'p', 'p', 'p', ' ', 'p', 'p', 'p'}, 
						{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}}; 

	@Test
	public void testKing() {
		boolean sucess = true;
		ChessGame game = new ChessGame(b1);

		ArrayList<Position> posibleMoves = game.getPossibleMoves(new Position(4,7));
		char[][] boardTest = game.getBoard();
		for(Position position: posibleMoves)
			boardTest[position.getY()][position.getX()] = 'X';
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(boardTest[i][j] != b2[i][j]){
					System.out.println(i + " " + j);
					sucess = false;
					break;
				}
		assertEquals(true, sucess);

		posibleMoves = game.getPossibleMoves(new Position(4,0));
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
