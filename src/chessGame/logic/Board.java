package chessGame.logic;

import java.util.ArrayList;


public class Board {

	private Box board[][] = new Box[8][8];

	public Board(char[][] board){
		initialize(board);
	}
	
	public void initialize(char[][] board){
		for(int i = 0;i < board.length;i++)
			for(int j = 0;j < board.length;j++){
				char c = board[i][j];
				Position position = new Position(j,i);
				Piece piece = null;
				Color colorBoard;
				if(i%2 == 0)
					if(j%2 == 0)
						colorBoard = Color.BLACK;
					else
						colorBoard = Color.WHITE;
				else
					if(j%2 == 0)
						colorBoard = Color.WHITE;
					else
						colorBoard = Color.BLACK;
				switch(c){
				case ' ':
					piece = new NonePiece(colorBoard, position);
					break;
				case 'p':
					piece = new Pawn(Color.WHITE, position);
					break;
				case 'P':
					piece = new Pawn(Color.BLACK, position);
					break;
				case 'h':
					piece = new Horse(Color.WHITE, position);
					break;
				case 'H':
					piece = new Horse(Color.BLACK, position);
					break;
				case 'b':
					piece = new Bishop(Color.WHITE, position);
					break;
				case 'B':
					piece = new Bishop(Color.BLACK, position);
					break;
				case 'k':
					piece = new King(Color.WHITE, position);
					break;
				case 'K':
					piece = new King(Color.BLACK, position);
					break;
				case 'q':
					piece = new Queen(Color.WHITE, position);
					break;
				case 'Q':
					piece = new Queen(Color.BLACK, position);
					break;
				case 'r':
					piece = new Rook(Color.WHITE, position);
					break;
				case 'R':
					piece = new Rook(Color.BLACK, position);
					break;
				}
				this.board[i][j] = new Box(piece, colorBoard);
			}
	}
	
	public char[][] getBoard(){
		char[][] boardChar = new char[8][8];
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++){
				Piece piece = board[i][j].getPiece();
				if(piece instanceof NonePiece)
					boardChar[i][j]  = ' ';
				else if(piece.getColor() == Color.WHITE)
					boardChar[i][j] = piece.toString().toLowerCase().charAt(0);
				else
					boardChar[i][j] = piece.toString().charAt(0);
			}
		return boardChar;
	}

	public boolean move(int sourceX,int sourceY,int destX,int destY){
		return true;
	}

	public boolean checkForCheck(){
		return true;
	}

	public void removePiece(int sourceX,int sourceY){

	}
	
	public ArrayList<Position> getPossibleMoves(Position position){
		return board[position.getY()][position.getX()].getPiece().getPossibleMoves(board);
	}

}