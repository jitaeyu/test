package oop;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CraneGameMachine game = new CraneGameMachine();
		game.dolls=5;
		game.doGame();
		game.insertCoin();
		game.insertCoin();
		game.insertCoin();
		
		game.doGame();
		game.doGame();
		game.doGame();
		game.doGame();
		
	}

}
