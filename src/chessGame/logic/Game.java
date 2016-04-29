package chessGame.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {
	
	private Board board;
	private Player player1;
	private Player player2;
	private Map<Player, moveDone> moveHistory = new HashMap<Player, moveDone>();
	
	
	public void selectPlayerColor(Player player){
		
	}
	
	public void startGame(){
		
	}
	
	public Player announceWinner(){
		Player p=new Player();
		return p;
	}
}
