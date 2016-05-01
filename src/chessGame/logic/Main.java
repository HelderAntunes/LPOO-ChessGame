package chessGame.logic;

public class Main {

	public static void main(String[] args) {
		
		Board board = new Board();
		
		Box[][] boxes = board.getBoard();
		
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					if(j==7)
						System.out.print("\n");
					else
						System.out.print(boxes[i][j].getChar()+" ");
						
					
		

				}
			}
	}

}
