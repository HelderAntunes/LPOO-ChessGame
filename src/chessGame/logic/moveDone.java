package chessGame.logic;

class MoveDone {
	private int sourceX;
	private int sourceY;
	private int DestX;
	private int DestY;
	
	public MoveDone(int sourceX,int sourceY,int DestX,int DestY){
		this.sourceX=sourceX;
		this.sourceY=sourceY;
		this.DestX=DestX;
		this.DestY=DestY;
	}
	
	public int getSourceX(){
		return this.sourceX;
	}
	
	public int getSourceY(){
		return this.sourceY;
	}
	
	public int getDestX(){
		return this.DestX;
	}
	
	public int getDestY(){
		return this.DestY;
	}
	
	
	
	

}
