package chessGame.logic;

import java.util.ArrayList;

class Pawn extends Piece{

	Pawn(Color color, Position position){
		super(color, position);
	}

	public String toString(){
		return "P";
	}

	ArrayList<Position> getPossibleMoves(Box board[][]){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		
		int x = this.position.getX();
		int y = this.position.getY();

		// Forward
		if(this.color == Color.WHITE){
			if(board[y-1][x].isEmpty() == true){
				validPositions.add(new Position(x,y-1));
				if(board[y-2][x].isEmpty() == true && y == 6)
					validPositions.add(new Position(x,y-2));
			}
		}
		else if(this.color == Color.BLACK){
			if(board[y+1][x].isEmpty() == true){
				validPositions.add(new Position(x,y+1));
				if(board[y+2][x].isEmpty() == true && y == 1)
					validPositions.add(new Position(x,y+2));
			}
		}
		
		// takes other piece
		if(this.color == Color.WHITE){
			// right
			if(x < 7 && board[y-1][x+1].isEmpty() == false && board[y-1][x+1].getPiece().getColor() == Color.BLACK)
				validPositions.add(new Position(x+1, y-1));
			// left
			if(x > 0 && board[y-1][x-1].isEmpty() == false && board[y-1][x-1].getPiece().getColor() == Color.BLACK)
				validPositions.add(new Position(x-1, y-1));
		}
		else if(this.color == Color.BLACK){
			// right
			if(x < 7 && board[y+1][x+1].isEmpty() == false && board[y+1][x+1].getPiece().getColor() == Color.WHITE)
				validPositions.add(new Position(x+1, y+1));
			// left
			if(x > 0 && board[y+1][x-1].isEmpty() == false && board[y+1][x-1].getPiece().getColor() == Color.WHITE)
				validPositions.add(new Position(x-1, y+1));
		}

		return validPositions;
	}

}
