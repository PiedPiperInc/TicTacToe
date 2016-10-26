package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;

public class TicTacToe {

        public void play() {
                //initialize a new Game. This fills the board with numbers 1-9
                Game game = new Game();

                //display the board with the board from the game class
                displayBoard(game.getBoard());

        }

        private char getInput() {
                return '0';
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

