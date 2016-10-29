package is.ru.tictactoe;

import net.joningi.icndb.ICNDBClient;

public class Game {

		final ICNDBClient client = new ICNDBClient();
		/*
		board looks like this:
			1 2 3
			4 5 6
			7 8 9
		*/
		private char[][] board;
		private char player; //represents the player whose turn it is, X or O
		public Game() {
			board = new char[3][3];
			initialize();
		}

		public Game(char[][] board) {
			this.board = board;
			player = 'O';
			draw = false;
		}

		private void initialize() {
			char counter = 49;	//counter starts at ascii value for 1
			for(int i=0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					board[i][j] = counter;
					counter++; //counter is incremented
				}
			}

			player = 'X';
		}

		public char turn(String s) {

			char input = s.charAt(0);
            if(board[(input - '1')/3][(input - '1')%3] == 'X' || board[(input - '1')/3][(input - '1')%3] == 'O') {
                return player;
            }

            else {
                board[(input - '1')/3][(input - '1')%3] = player;
                char thePlayer = player;
                if(player == 'X')
                    player = 'O';
                else if(player == 'O')
                    player = 'X';
                return thePlayer;
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
				if(board[(input - '1')/3][(input - '1')%3] != (char) input){ 
					return '0';
				} 
			}
			else{
				return '0';
			}
			char convert = (char) input;
				
			return convert;
		}

		public String gameOver() {

		//checks for winner horizontally
		for(int i = 0; i < 3; i++){
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
				initialize();
				return "true";
			}	
		}

		//checks for winner vertically
		for(int i = 0; i < 3; i++){
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i]){
				initialize();
				return "true";
			}	
		}	

		//checks for winner diagonally
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
			initialize();
			return "true";
		}

		//checks for winner diagonally			
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
			initialize();
			return "true";
		}


		//checks if its a draw
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(board[i][j] != 'X' && board[i][j] != 'O')
					return "false";
			}	
		}
		
		initalize();
		return "draw";
		}
	}