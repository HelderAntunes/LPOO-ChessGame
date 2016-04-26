
public class Live implements PieceState{
	
	public void dead(Piece piece){
		piece.setState(new Dead());
		
	}
}
