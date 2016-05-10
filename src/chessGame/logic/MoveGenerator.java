package chessGame.logic;

import java.util.ArrayList;

class MoveGenerator {


	ArrayList<Position> getDiagonalMoves(Box board[][], Piece piece){
		ArrayList<Position> validPositions = new ArrayList<Position>();
		
		int x = piece.getPosition().getX();
		int y = piece.getPosition().getY();
		Color color = piece.getColor();
		// up-left
		for(int i = y-1, j = x-1;i >= 0 && j >= 0;i--, j--){
			if(board[i][j].isEmpty() == false){
				if(board[i][j].getPiece().getColor() == color)
					break;
				else if(board[i][j].getPiece().getColor() != color){
					validPositions.add(new Position(j,i));
					break;
				}
			}
			else{
				validPositions.add(new Position(j,i));
			}
		}

		// up-right
		for(int i = y-1, j = x+1;i >= 0 && j < 8;i--, j++){
			if(board[i][j].isEmpty() == false){
				if(board[i][j].getPiece().getColor() == color)
					break;
				else if(board[i][j].getPiece().getColor() != color){
					validPositions.add(new Position(j,i));
					break;
				}
			}
			else{
				validPositions.add(new Position(j,i));
			}
		}

		// down-left
		for(int i = y+1, j = x-1;i < 8 && j >= 0;i++, j--){
			if(board[i][j].isEmpty() == false){
				if(board[i][j].getPiece().getColor() == color)
					break;
				else if(board[i][j].getPiece().getColor() != color){
					validPositions.add(new Position(j,i));
					break;
				}
			}
			else{
				validPositions.add(new Position(j,i));
			}
		}

		// down-right
		for(int i = y+1, j = x+1;i < 8 && j < 8;i++, j++){
			if(board[i][j].isEmpty() == false){
				if(board[i][j].getPiece().getColor() == color)
					break;
				else if(board[i][j].getPiece().getColor() != color){
					validPositions.add(new Position(j,i));
					break;
				}
			}
			else{
				validPositions.add(new Position(j,i));
			}
		}

		return validPositions;
	}
}
