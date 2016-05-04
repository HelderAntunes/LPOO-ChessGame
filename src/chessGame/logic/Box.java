package chessGame.logic;

class Box {
	private Piece piece;
	private Color color;
	
	public Box(Piece piece,Color color){
		this.piece=piece;
		this.color=color;
	}
	
	public String getChar(){
		return this.piece.toString();
	}
	
	public Piece getPiece(){
		return piece;
	}
	
	public boolean isEmpty(){
		return piece instanceof NonePiece;
	}
	
}
