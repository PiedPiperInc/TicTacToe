package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;

public class TicTacToe {

	public void play() {

	}

	private char getInput() {
		char input = StdIn.read();
		if(checkIfInputIsValid(input)){
		   return input;
		}
	}

	private void displayBoard(char[][] board) {

	}


	public static void main(String[] args) {
		Game theGame = new Game();
		theGame.turn('0');
		StdOut.println("TicTacToooooe");
	}
}