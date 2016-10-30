#  PiedPiper Inc - TicTacToe Development manual

  In this manual you will find instructions on how to install the Tic Tac Toe game.

### To install the game on to a fresh machine, you will need to have the following:

+ [Git](https://git-scm.com)
+ [Gradle](https://www.gradle.org/downloads)
+ [Java SE Development kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
+ [Heroku](https://www.heroku.com/)
+ [Travis](https://travis-ci.org/)

### To open in a browser:
https://detroitbadboys-3000.herokuapp.com/


### Clone the Tic Tac Toe [repository](https://github.com/PiedPiperInc/TicTacToe/) from Github in order to get access to the code.
After you have set up git you can open Git Bash(Windows) or Terminal(macOS/linux), navigate to where you want to keep the files and run *git clone https://github.com/PiedPiperInc/TicTacToe.git*
When you make changes to the code, make sure you are on a new branch. When you're happy with your code, add your files, commit them and push to Github. After a push you should open a pull request and we'll merge your branch with the feature branch.
We created a branch called feature for our first feature, the console app, and another branch called webApp for the web application. Our latest version is a web application and is on the master branch now.


### Find the code
Our main code, i.e. the java files are at */src/main/java/is/ru/tictactoe/*. The tests use the same path structure but with *test* instead of *main*. The files for the web, .html, .css and .js, are at *src/main/resources/*.

### Running the game
To test and run your app locally first use *gradle build* and then *gradle run*. If all works the run should stop at 75% and you can find the program at *localhost:4567*


### Commit the changes

If you wish to make changes to the repository, you must create a new branch and then commit the changes using git. 
When the changes have been up uploaded you'll have to merge them with the feature branch.

### Travis-CI

We use travis for our unit tests. It's connected to github so when we push to github Travis automatically tests our code. If the tests pass, travis deploys the app to Heroku.

+ Travis builds the project, you can moniter the progress at:
  (https://travis-ci.org/PiedPiperInc/TicTacToe)
+  Compiles the code and runs unit-tests 
