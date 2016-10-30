# Administration manual

## Að install'a og setja upp kerfið

 - Til að sækja forritið þarf að byrja á að sækja repository'ið okkar [hér](https://github.com/PiedPiperInc/TicTacToe)
 - Ef ekki er sett upp Git skel í tölvu viðkomandi er hægt að sækja það [hér](https://git-scm.com/downloads)
 - Þegar Git skel hefur verið sett upp, er farið á repository'ið okkar og clone'aður linkurinn að honum og skelin opnuð. Í skelinni þarf svo að fara á það svæði sem viðkomandi vill vista repo'ið. Þegar þangað er komið er keyrð skipunin "git clone https://github.com/PiedPiperInc/TicTacToe".
 - Núna er repo'ið komið á þann stað í tölvunni sem viðkomandi valdi.
 - Þegar keyra á kerfið á console, er fyrst keyrð skipunin "gradle build", þar á eftir skal notandi fara inn á slóðina "~/TicTacToe/build/install/TicTacToe/bin", þar er svo keyrð skipunin "./TicTacToe" og þá er forritið keyrt.
 
## Að deploy'a, keyra og viðhalda kerfinu

 - Til að deploy'a kerfinu, er keyrð skipunin "gradle build", Gradle sér þá um að compile'a allan kóða og deploy'ar ef hann finnur engar villur.
 - Til að keyra kerfið, er keyrð skipunin "gradle run", þá er hægt að fara á [heroku](https://dashboard.heroku.com/apps/safe-inlet-50535) og opna appið okkar.
