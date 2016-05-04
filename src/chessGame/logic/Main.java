package chessGame.logic;

public class Main {

	static char [][] b1 = {{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
			{'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', ' ', ' ', ' ', 'p', ' ', 'p', ' '},
			{'p', 'p', 'p', 'p', ' ', 'p', ' ', 'p'},
			{'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'}};

	public static void main(String[] args) {

		Board board = new Board(b1);

		char[][] boxes = board.getBoard();
		
		System.out.print("----------------\n");
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(j == 0)
					System.out.print("|");
				System.out.print(boxes[i][j] +"|");
				if(j==7){
					System.out.print("\n");	
					System.out.print("----------------\n");
				}
			}
		}
	}

}
