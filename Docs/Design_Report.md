Hér verður hönnunarskýrsla

# Inngangur
Verkefnið gengur út á að búa til Tic Tac Toe leik í java. Verkefnið snýst samt ekki bara um að forritaleikinn heldur að fylgja leiðbeiningum og ákveðnum ferlum sem við lærðum í áfanganum Hugbúnaðarfræði. Þetta er hönnunarskýrsla sem á að útskýra sýn okkar á verkefninu eins og við hugsum hana áður en við byrjum að forrita.


#Klasar
##TicTacToe
*void play()
..* Aðalfallið í TicTacToe, keyrir leikinn sjálfan
*char getInput()
..*Sækir inntak frá notanda, sendir það inn í Game
*void displayBoard(char[][] board)
..*Birtir leikborðið frá Game
##Game
*Char[][] board
..*Leikborðið sjálft
*Char player
..*Táknar leikmann, annað hvort ‘X’ eða ‘O’
*Boolean draw
..*Segir til um hvort það sé jafntefli eða ekki í lok leiks
*Void turn(char input)
..*Keyrir eina umferð af leiknum útfrá inntaki frá UI laginu.
*Char[][] getBoard()
..*Skilar leikborðinu svo UI lagið geti birt það
*Char getPlayer()
..*Skilar player svo UI lagið geti birt það.
*Boolean checkifInputIsValid()
..*Skoðar inntakið frá UI laginu og athugar hvort það sé innan réttra marka og hvort það sé X eða O þar fyrir.
*Boolean gameover(char[][] board)
..*Skoðar hvort leikurinn sé búinn. Skoðar fyrst hvort að það sé kominn sigurvegari og svo ef borðið er fullt og enginn sigurvegari finnst þá gefum við okkur að það sé komið draw.

#Lagskipting
