package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
		assertEquals(true, theGame.checkIfInputIsValid('3'));
	}
}