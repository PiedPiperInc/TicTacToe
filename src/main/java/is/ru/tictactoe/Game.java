
package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;


public class Game {
		/*
		board looks like this:
			1 2 3
			4 5 6
			7 8 9
		*/
		private char[][] board;
		private char player; //represents the player whose turn it is, X or O
		private boolean draw; //represents if there is a draw in the game

		public Game() {
			board = new char[3][3];
			player = 'X';
			draw = false;
			initializeBoard(board);
		}

		private void initializeBoard(char[][] board) {
			char counter = 49;	//counter starts at ascii value for 1
			for(int i=0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					board[i][j] = counter;
					counter++; //counter is incremented
				}
			}
		}

		public  void turn(char input) {

		}

		public char[][] getBoard() {
			return board;
		}

		public char getPlayer() {
			return player;
		}

		public boolean checkIfInputIsValid(char input) {
			if(input > 48 && input < 58)
				return true;
			return false;
		}

		private boolean gameOver(char[][] board) {
			return false;
		}

		public static void main(String[] args) {
		}
	}