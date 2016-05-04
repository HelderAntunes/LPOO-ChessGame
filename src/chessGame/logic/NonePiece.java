package chessGame.logic;

class NonePiece extends Piece{
	
	public NonePiece(Color color){
		super(color);
	}
	
	public NonePiece(Color color, Position position){
		super(color, position);
	}
	
	public String toString(){
		return " ";
	}

}
