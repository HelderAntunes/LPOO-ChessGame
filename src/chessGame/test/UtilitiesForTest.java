package chessGame.test;

class UtilitiesForTest {
	
	boolean boardEquals(char b1[][], char b2[][]){
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				if(b1[i][j] != b2[i][j])
					return false;
		return true;
	}
	
}
