
package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;


public class Game {
		private char[][] board;
		private char player;
		private boolean draw;

		public void turn(char input) {

		}

		public char[][] getBoard() {
			return new char[3][3];
		}

		public char getPlayer() {
			return '0';
		}

		public boolean checkIfInputIsValid(char input) {
			return false;
		}

		private boolean gameOver(char[][] board) {
			return false;
		}
	}