Hér verður hönnunarskýrsla

# Inngangur
Verkefnið gengur út á að búa til Tic Tac Toe leik í java. Verkefnið snýst samt ekki bara um að forritaleikinn heldur að fylgja leiðbeiningum og ákveðnum ferlum sem við lærðum í áfanganum Hugbúnaðarfræði. Þetta er hönnunarskýrsla sem á að útskýra sýn okkar á verkefninu eins og við hugsum hana áður en við byrjum að forrita.


#Klasar
###TicTacToe
* __void play()__ - Aðalfallið í TicTacToe, keyrir leikinn sjálfan.
* __char getInput()__ - Sækir inntak frá notanda, sendir það inn í game
* __void displayBoard(char[][] board)__ - Birtir leikborðið frá Game.

###Game
* __Char[][] board__ - Leikborðið sjálft
* __Char player__ - Táknar leikmann, annað hvort ‘X’ eða ‘O’
* __Boolean draw__ - Segir til um hvort það sé jafntefli eða ekki í lok leiks
* __Void turn(char input)__ - Keyrir eina umferð af leiknum útfrá inntaki frá UI laginu.
* __Char[][] getBoard()__ - Skilar leikborðinu svo UI lagið geti birt það
* __Char getPlayer()__ - Skilar player svo UI lagið geti birt það.
* __Boolean checkifInputIsValid()__ - Skoðar inntakið frá UI laginu og athugar hvort það sé innan réttra marka og hvort það sé X eða O þar fyrir.
* __Boolean gameover(char[][] board)__ - Skoðar hvort leikurinn sé búinn. Skoðar fyrst hvort að það sé kominn sigurvegari og svo ef borðið er fullt og enginn sigurvegari finnst þá gefum við okkur að það sé komið draw.


#Lagskipting
* __UI__ - TicTacToe klasinn er UI lagið hjá okkur, þ.e. Hann sér um að sækja input frá notanda og birta leikborðið ofl á skjáinn. Play() fallið hans sér um að byrja leikinn með því að búa til instance af Game. Play fallið keyrir lykkju á meðan leikurinn er ekki búinn og keyrir eitt Game.Turn() fall í hverri loopu.
* __Business Logic__ - Game klasinn sér um alla business lógík hjá okkur. Hann sér í raun um leikinn sjálfan og er þá að vinna með inputið sem kemur frá TicTacToe klasanum og notar það til að setja inn X eða O á viðeigandi stað.

