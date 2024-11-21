Förklaring av spelplanens struktur:
Den här strukturen använder ett 3x3 rutnät, där varje cell i grid -arrayen representerar en plats på brädet. 
Symbolerna '-' används för att indikera tomma platser på brädet,vilket gör det tydligt för spelarna var de kan spela.
Declarera spelarnamn i "Main" för att använda spelarnamn på både TicTacGame och Player -kalssen. 
Spelat startar i klassen TicTacGame som hanterar spelat.
Board -klassen "Board.checkWin() och Board.isFulll()" hanterar visningen av brädet och kontrollerar om någon har vunnit eller om brädet är fullt. 
Player -klassen Spelarna turas om att ange sina drag i form av rad och kolumn (t.ex., 1 2 för rad 1, kolumn 2).
Programmet kontrollerar om ett drag är giltigt och visar resultatet (vinst eller oavgjort).
När spelet är klart, börjar det om från början.
