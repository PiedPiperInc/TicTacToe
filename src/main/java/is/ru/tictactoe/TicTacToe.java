package is.ru.tictactoe;

import edu.princeton.cs.algs4.*;

public class TicTacToe {

        public void play() {

        }

        private char getInput() {
                return '0';
        }

        public void displayBoard() {
                char[][] board = new char[3][3];
                for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                                if(i % 2 == 0 && j % 2 == 1)
                                        board[i][j] = 'X';
                                else
                                        board[i][j] = 'O';

                                StdOut.printf(board[i][j] + " ");
                        }
                        StdOut.printf("\n");
                }

        }

        public static void main(String[] args) {

                TicTacToe burd = new TicTacToe();
                burd.displayBoard();
                StdOut.println("TicTacToooooe");
        }
}

