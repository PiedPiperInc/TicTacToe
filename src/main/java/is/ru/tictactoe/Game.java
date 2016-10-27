
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

		public Game(char[][] board) {
			this.board = board;
			player = 'O';
			draw = false;
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

		public void turn(char input) {


			board[(input - '1')/3][(input - '1')%3] = player; //Assign the correct letter to the correct index of the board

			if(player == 'X'){ //If previous move was made by X, then the next move belongs to O
				player = 'O';
			}
			else{
				player = 'X';
			}
		}

		public char[][] getBoard() {
			return board;
		}

		public char getPlayer() {
			return player;
		}

		public char checkIfInputIsValid(int input) {
			if(input >= 1 && input <= 9){
				input += 48;
				if(board[(input - '1')/3][(input - '1')%3] != (char) input ){
					return '0';
				} 
			}
			else{
				return '0';
			}
			char convert = (char) input;
				
			return convert;
		}

		private boolean gameOver(char[][] board) {
			return false;
		}

		public static void main(String[] args) {
		}
	}
