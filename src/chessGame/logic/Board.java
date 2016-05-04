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

<<<<<<< HEAD
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

=======
	public Board(){
	//torre preta 1
	Rook blackRook1 = new Rook(Color.BLACK);
	Box rook1B = new Box(blackRook1,Color.WHITE);
	board[0][0]=rook1B;

	//cavalo preto 1
	Horse blackHorse1 = new Horse(Color.BLACK);
	Box Horse1B = new Box(blackHorse1,Color.BLACK);
	board[0][1]=Horse1B;

	//Bispo preto 1
	Bishop blackBishop1 = new Bishop(Color.BLACK);
	Box Bishop1B = new Box(blackBishop1,Color.WHITE);
	board[0][2]=Bishop1B;

	//rainha preta
	Queen blackQueen = new Queen(Color.BLACK);
	Box QueenB = new Box(blackQueen,Color.BLACK);
	board[0][3]=QueenB;

	//rei preto
	King blackKing = new King(Color.BLACK);
	Box KingB = new Box(blackKing,Color.WHITE);
	board[0][4]=KingB;

	//Bispo preto 2
	Bishop blackBishop2 = new Bishop(Color.BLACK);
	Box Bishop2B = new Box(blackBishop2,Color.BLACK);
	board[0][5]=Bishop2B;

	//cavalo preto 2
	Horse blackHorse2 = new Horse(Color.BLACK);
	Box Horse2B = new Box(blackHorse2,Color.WHITE);
	board[0][6]=Horse2B;

	//torre preta 2
	Rook blackRook2 = new Rook(Color.BLACK);
	Box rook2B = new Box(blackRook2,Color.BLACK);
	board[0][7]=rook2B;

	//Peao preto 1
	Pawn blackPawn1 = new Pawn(Color.BLACK);
	Box pawn1B = new Box(blackPawn1,Color.BLACK);
	board[1][0]=pawn1B;

	//Peao preto 2
	Pawn blackPawn2 = new Pawn(Color.BLACK);
	Box pawn2B = new Box(blackPawn2,Color.WHITE);
	board[1][1]=pawn2B;

	//Peao preto 3
	Pawn blackPawn3 = new Pawn(Color.BLACK);
	Box pawn3B = new Box(blackPawn3,Color.BLACK);
	board[1][2]=pawn3B;

	//Peao preto 4
	Pawn blackPawn4 = new Pawn(Color.BLACK);
	Box pawn4B = new Box(blackPawn4,Color.WHITE);
	board[1][3]=pawn4B;

	//Peao preto 5
	Pawn blackPawn5 = new Pawn(Color.BLACK);
	Box pawn5B = new Box(blackPawn5,Color.BLACK);
	board[1][4]=pawn5B;

	//Peao preto 6
	Pawn blackPawn6 = new Pawn(Color.BLACK);
	Box pawn6B = new Box(blackPawn6,Color.WHITE);
	board[1][5]=pawn6B;

	//Peao preto 7
	Pawn blackPawn7 = new Pawn(Color.BLACK);
	Box pawn7B = new Box(blackPawn7,Color.BLACK);
	board[1][6]=pawn7B;

	//Peao preto 8
	Pawn blackPawn8 = new Pawn(Color.BLACK);
	Box pawn8B = new Box(blackPawn8,Color.WHITE);
	board[1][7]=pawn8B;

	//////////////////////////////////////////////////////////////////


	//Peao Branco 1
	Pawn whitePawn1 = new Pawn(Color.WHITE);
	Box pawn1W = new Box(whitePawn1,Color.WHITE);
	board[6][0]=pawn1W;

	//Peao Branco 2
	Pawn whitePawn2 = new Pawn(Color.WHITE);
	Box pawn2W = new Box(whitePawn2,Color.BLACK);
	board[6][1]=pawn2W;

	//Peao Branco 3
	Pawn whitePawn3 = new Pawn(Color.WHITE);
	Box pawn3W = new Box(whitePawn3,Color.WHITE);
	board[6][2]=pawn3W;

	//Peao Branco 4
	Pawn whitePawn4 = new Pawn(Color.WHITE);
	Box pawn4W = new Box(whitePawn4,Color.BLACK);
	board[6][3]=pawn4W;

	//Peao Branco 5
	Pawn whitePawn5 = new Pawn(Color.WHITE);
	Box pawn5W = new Box(whitePawn5,Color.WHITE);
	board[6][4]=pawn5W;

	//Peao Branco 6
	Pawn whitePawn6 = new Pawn(Color.WHITE);
	Box pawn6W = new Box(whitePawn6,Color.BLACK);
	board[6][5]=pawn6W;

	//Peao Branco 7
	Pawn whitePawn7 = new Pawn(Color.WHITE);
	Box pawn7W = new Box(whitePawn7,Color.WHITE);
	board[6][6]=pawn7W;

	//Peao Branco 8
	Pawn whitePawn8 = new Pawn(Color.WHITE);
	Box pawn8W = new Box(whitePawn8,Color.BLACK);
	board[6][7]=pawn8W;

	//torre branca 1
	Rook whiteRook1 = new Rook(Color.WHITE);
	Box rook1W = new Box(whiteRook1,Color.BLACK);
	board[7][0]=rook1W;

	//cavalo branco 1
	Horse whiteHorse1 = new Horse(Color.WHITE);
	Box Horse1W = new Box(whiteHorse1,Color.WHITE);
	board[7][1]=Horse1W;

	//Bispo branco 1
	Bishop whiteBishop1 = new Bishop(Color.WHITE);
	Box Bishop1W = new Box(whiteBishop1,Color.BLACK);
	board[7][2]=Bishop1W;

	//rainha branca
	Queen whiteQueen = new Queen(Color.WHITE);
	Box QueenW = new Box(whiteQueen,Color.WHITE);
	board[7][3]=QueenW;

	//rei branco
	King whiteKing = new King(Color.WHITE);
	Box KingW = new Box(whiteKing,Color.BLACK);
	board[7][4]=KingW;

	//Bispo branco 2
	Bishop whiteBishop2 = new Bishop(Color.WHITE);
	Box Bishop2W = new Box(whiteBishop2,Color.WHITE);
	board[7][5]=Bishop2W;

	//cavalo branco 2
	Horse whiteHorse2 = new Horse(Color.WHITE);
	Box Horse2W = new Box(whiteHorse2,Color.BLACK);
	board[7][6]=Horse2W;

	//torre branca 2
	Rook whiteRook2 = new Rook(Color.WHITE);
	Box rook2W = new Box(whiteRook2,Color.WHITE);
	board[7][7]=rook2W;

	//Espaços vazios
	NonePiece nB = new NonePiece(Color.BLACK);
	NonePiece nW = new NonePiece(Color.WHITE);
	Box nBB = new Box(nB,Color.BLACK);
	Box nWB = new Box(nW,Color.WHITE);

	//linha 2
	board[2][0]=nWB;
	board[2][1]=nBB;
	board[2][2]=nWB;
	board[2][3]=nBB;
	board[2][4]=nWB;
	board[2][5]=nBB;
	board[2][6]=nWB;
	board[2][7]=nBB;
	//linha 3
	board[3][0]=nBB;
	board[3][1]=nWB;
	board[3][2]=nBB;
	board[3][3]=nWB;
	board[3][4]=nBB;
	board[3][5]=nWB;
	board[3][6]=nBB;
	board[3][7]=nWB;
	//linha 4
	board[4][0]=nWB;
	board[4][1]=nBB;
	board[4][2]=nWB;
	board[4][3]=nBB;
	board[4][4]=nWB;
	board[4][5]=nBB;
	board[4][6]=nWB;
	board[4][7]=nBB;
	//linha 5
	board[5][0]=nBB;
	board[5][1]=nWB;
	board[5][2]=nBB;
	board[5][3]=nWB;
	board[5][4]=nBB;
	board[5][5]=nWB;
	board[5][6]=nBB;
	board[5][7]=nWB;





	}


	public Box[][] getBoard(){
		return this.board;
	}





>>>>>>> origin/master
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
