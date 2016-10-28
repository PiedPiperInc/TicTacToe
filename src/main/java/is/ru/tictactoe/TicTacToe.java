package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;

public class TicTacToe {

	Game game;
        public void play() {
                //initialize a new Game. This fills the board with numbers 1-9
                game = new Game();

                while(!game.gameOver() && !game.draw){

                //display the board with the board from the game class
                displayBoard(game.getBoard());

                char input = getInput();

                game.turn(input);

            }
   		displayBoard(game.getBoard());    
	    if(game.draw){
                StdOut.println("It's a draw!");
            } 
            else if(game.getPlayer() == 'X'){

                StdOut.println("O is the winner!");
            }
            else{

                StdOut.println("X is the winner!");
            }


        }

        private char getInput() {

                char convert = '0';

                while(convert == '0')
                {
                StdOut.print("Please insert a number between 1 to 9: ");
                //Asks user to insert valid numbers

                int input = StdIn.readInt();
                //Gets the input from user

                convert = game.checkIfInputIsValid(input);
                //checks if the input is valid and returns the input
                }
                return convert;
        }

        public void displayBoard(char[][] board) {
                /*board should look like this on the console
                         _____________
                         | 1 | 2 | 3 |
                         _____________
                         | 4 | 5 | 6 |
                         _____________
                         | 7 | 8 | 9 |
                         _____________
                */
                for(int i = 0;i <3;i++)
                {
                        StdOut.println(" _____________");
                        for(int j = 0;j < 3;j++)
                        {
                                StdOut.print(" | " + board[i][j]);
                        }
                        StdOut.print(" |\n");
                }
                StdOut.println(" _____________");
        }

        public static void main(String[] args) {
                //main function should only need to create a Game instance and run play()
                TicTacToe game = new TicTacToe();
                game.play();
        }
}

