
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
		private int turns;
		public Game() {
			board = new char[3][3];
			player = 'X';
			draw = false;
			turns = 0;
			initializeBoard(board);
			gameOver();
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

		public  void turn(char input) {

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


		public boolean gameOver() {
		//checks for winner horizontally
		for(int i = 0; i < 3; i++){
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
				return true;
			}
			//check for winner vertically
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i]){	
				return true;
}	
		}


		//checks for winner diagonally
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
			return true;
		}

		//checks for winner diagonally			
		else if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
			return true;
		}

		turns++;

		//checks if its a draw
		if(turns == 9){
			draw = true;
		}
			return false;	 
		}	
		public static void main(String[] args) {
		}
	}
