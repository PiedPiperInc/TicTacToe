# Design report
##*Pied Piper Inc - TicTacToe*

## Introduction
 The project is to build a Tic Tac Toe game coded in java and runs as a web application. The main focus of this project will also be using the right software development method.
 
The application has two classes, *TicTacToe* and *Game*. This classes are listed below with it's functions.

## Classes and functions

###TicTacToe
* __void play()__ - The main function in TicTacToe, runs the game.
* __char getInput()__ - Request user input and returns it into Game.
* __void displayBoard(char[][] board)__ - Display the game board.

###Game
* __Char[][] board__ - The game board.
* __Char player__ - Reprents player, either 'X" or 'O'.
* __Boolean draw__ - Tells us whether there is a draw or not in the end of the game.
* __Void turn(char input)__ - Runs one round of the game with input from the UI layer.
* __Char[][] getBoard()__ - Returns the game board so the UI layer can display it.
* __Char getPlayer()__ - Returns player function so the UI player can display it.
* __Boolean checkifInputIsValid()__ - Read the input from UI layer and check whether it is within the right boundaries and whether the space is already taken by 'X' or 'O'.
* __Boolean gameover(char[][] board)__ - Checks if the game is over. The function first checks if there is a winner and then whether the board is full. If there is no winner and the board is full we will get a draw. 

## Layers
* __UI__ - TicTacToe class is in the UI layer. It gets input from the user and displays the game board among other things on to the screen. The Play() function within the TicTacToe class starts the game by creating an instance of Game. Play function runs a loop while the game isn't over and runs one Game.Turn() function in each loop.

* __Business Logic__ - The Game class handles all of the business logic. Furthermore it manages the game itself and is working with the input it gets from the TicTacToe class and uses it to put 'X's and 'O's into appropriate places.

