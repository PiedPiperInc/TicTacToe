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
	public void TestLargeInput() throws IllegalArgumentException {
     		Game theGame = new Game();
			assertEquals('0' ,theGame.checkIfInputIsValid(10));
	}
    
    @Test
    public void TestCharInput() throws IllegalArgumentException {
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
    public void testTurn(){
    	Game game = new Game();
    	game.turn('1');
    	char[][] board = game.getBoard();
    	assertEquals('X', board[0][0]);
    }

}
