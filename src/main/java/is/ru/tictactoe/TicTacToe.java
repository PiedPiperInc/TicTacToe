package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;

public class TicTacToe {

        public void play() {

                Game game = new Game();
                displayBoard(game.getBoard());

        }

        private char getInput() {
                return '0';
        }

        public void displayBoard(char[][] board) {

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

                TicTacToe game = new TicTacToe();
                game.play();
        }
}

