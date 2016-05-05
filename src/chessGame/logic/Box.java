package chessGame.logic;

class Box {
	private Piece piece;
	private Color color;
	
	Box(Piece piece,Color color){
		this.piece=piece;
		this.color=color;
	}
	
	String getChar(){
		return this.piece.toString();
	}
	
	Piece getPiece(){
		return piece;
	}
	
	boolean isEmpty(){
		return piece instanceof NonePiece;
	}
	
}
