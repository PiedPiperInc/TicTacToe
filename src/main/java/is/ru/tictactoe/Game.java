package is.ru.tictactoe;

import net.joningi.icndb.ICNDBClient;

public class Game {
		//this is something for spark
		final ICNDBClient client = new ICNDBClient();
		/*
		board looks like this:
			1 2 3
			4 5 6
			7 8 9
		*/
		private char[][] board; //this is the board of the game
		private char player; //represents the player whose turn it is, X or O
		private int xWins;	//number of wins for player X
		private int oWins;	//number of wins for player O
		private int draws;  //number of draws


		//initializes the board and private variables
		public Game() {
			initialize();
			xWins = 0;
			oWins = 0;
			draws = 0;
		}

		public Game(char[][] board) {
			this.board = board;
			player = 'O';
		}




		private void initialize() {
			board = new char[3][3];
			char counter = 49;	//counter starts at ascii value for 1
			for(int i=0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					board[i][j] = counter;
					counter++; //counter is incremented
				}
			}

			player = 'X';
		}



		/*
		this puts a character on the board, X or O
		it returns the current player as a response 
		to an ajax request from the javascript code
		*/
		public char turn(String s) {

			char input = s.charAt(0);
            if(board[(input - '1')/3][(input - '1')%3] == 'X' || board[(input - '1')/3][(input - '1')%3] == 'O') {
                return player;
            }

            board[(input - '1')/3][(input - '1')%3] = player;
            char thePlayer = player;
            if(player == 'X')
                player = 'O';
            else if(player == 'O')
                player = 'X';
           
           return thePlayer;
		}


		//returns the board
		public char[][] getBoard() {
			return board;
		}


		//returns the current player
		public char getPlayer() {
			return player;
		}


		/*
		this checks the input, we used this for the console application
		we don't really need it for the web app because the user
		is not giving input, the user is clicking
		*/
		public char checkIfInputIsValid(int input) {

			int[] inputLength = new int[1];
			inputLength[0] = input;
			input = inputLength[0];

			if(input >= 1 && input <= 9 ){
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


		//returns the wins of both players and the number of draws as a response to ajax
		public String getWins() {
			return xWins + " " + oWins + " " + draws;
		}



		/*
		this returns 'true' if there is a winner, 'false' if not and 'draw' if there is a draw
		This returns string because it's a response to an ajax requests and always came
		as a string either way in our javascript code
		*/
		public String gameOver() {

		//checks for winner horizontally
		for(int i = 0; i < 3; i++){
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
				if(player == 'X') {
					oWins++;
				}
				else {
					xWins++;
				}
				initialize();
				return "true";
			}	
		}

		//checks for winner vertically
		for(int i = 0; i < 3; i++){
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i]){
				if(player == 'X') {
					oWins++;
				}
				else {
					xWins++;
				}
				initialize();
				return "true";
			}	
		}	

		//checks for winner diagonally
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
			if(player == 'X') {
					oWins++;
				}
				else {
					xWins++;
				}
			initialize();
			return "true";
		}

		//checks for winner diagonally			
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
			if(player == 'X') {
					oWins++;
				}
				else {
					xWins++;
				}
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
		
		initialize();
		draws++;
		return "draw";
		}
	}