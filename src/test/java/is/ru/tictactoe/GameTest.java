package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
public class GameTest {
	@Test
	public void testInitializeBoard() {
		Game theGame = new Game();
		char[][] theBoard = theGame.getBoard();
		char counter = 49; //counter is char value of 1
		for(int i=0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				assertEquals(counter, theBoard[i][j]);
				counter++; 
			}
		}
	}
	@Test
	public void TestInput(){
		Game theGame = new Game();
		assertEquals('1', theGame.checkIfInputIsValid(1));
	}
	
	@Test
	public void TestLargeInput(){
     		Game theGame = new Game();
		assertEquals('0' ,theGame.checkIfInputIsValid(10));
	}
    
    @Test
    public void TestCharInput(){
        Game theGame = new Game();
        assertEquals('0', theGame.checkIfInputIsValid('A'));
    }

    @Test
    public void testAlreadyTakenSpot() {
    	char[][] board = new char[3][3];
    	char counter = 49;
    	for(int i=0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = counter;
				counter++; 
			}
		}
		board[0][0] = 'X';
		Game theGame = new Game(board);
		assertEquals('0', theGame.checkIfInputIsValid(1));
    }

	@Test
    	public void testCorrectAnswerInTurn(){
        	Game game = new Game();
        	game.turn('1');
        	char[][] board = game.getBoard();
	        assertEquals('X', board[0][0]);
    }

	@Test
	public void testIfWinner(){
		char[][] board = new char[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				board[i][j] = 'X';
			}
		}
		Game theGame = new Game(board);
		assertEquals(true, theGame.gameOver());
	}

	@Test
	public void testIfPlayerIsO(){
		Game theGame = new Game();
		char input = '1';
		theGame.turn(input);
		input = '4';
		theGame.turn(input);
		input = '2';
		theGame.turn(input);
		assertEquals('O', theGame.getPlayer());
	}

	@Test
	public void testWrongInputPlayer(){
		Game theGame = new Game();
		char input = '8';
		theGame.turn(input);
		input = '4';
		theGame.turn(input);
		input = theGame.checkIfInputIsValid(4);
		if(input != '0'){
			theGame.turn(input);
		}
		else{}
		assertEquals('X', theGame.getPlayer());
	}
}
