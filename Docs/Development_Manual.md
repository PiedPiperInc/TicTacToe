#  PiedPiper Inc - TicTacToe Development manual

  In this manual you will find instructions on how to install the Tic Tac Toe game.

### To install the game on to a fresh machine, you will need to have the following:

+ [Github](https://www.github.com)
+ [Gradle](https://www.gradle.org/downloads)
+ [Java SE Development kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
+ [Heroku](https://www.heroku.com/)
+ [Travis](https://travis-ci.org/)

### To open in a browser:

https://detroitbadboys-3000.herokuapp.com/

### Clone the Tic Tac Toe [repository](https://github.com/PiedPiperInc/TicTacToe/) from Github in order to get access to the code.

We use Gradle to handle external libraries.

### Compile and package Tic Tac Toe by running:

./bin/compile

./bin/package

### Commit the changes

If you wish to make changes to the repository, you must create a new branch and then commit the changes using git. 
When the changes have been up uploaded you'll have to merge them with the feature branch.

### Travis-CI
+ Travis builds the project, you can moniter the progress at:
  (https://travis-ci.org/PiedPiperInc/TicTacToe)
+  Compiles the code and runs unit-tests 
