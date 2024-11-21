import java.util.Scanner;

public class TicTacGame {
private Board board;
private Player p1;
private Player p2;
private Scanner scanner;

public TicTacGame (String player1Name, String player2Name) {
    board = new Board();
    scanner = new Scanner(System.in);
    p1 = new Player(player1Name,'X', scanner);  // Skapa Spelare med namn och symbol
    p2 = new Player(player2Name,'O', scanner);
}
public void startGame() { // Starta spelet
    Player currentPlayer = p1;
    boolean gameWon = false;

    while (true) {
        board.displayBoard();
        System.out.println(currentPlayer.getName() +"(" + currentPlayer.getSymbol() + "), enter your move: ");
        int[] move = currentPlayer.getMove();

        if (!board.isValidMove(move[0], move[1])) { // Kontrollera giltigt drag
            System.out.println("Invalid move. Try again.");
            continue;
        }

        board.makeMove(move[0], move[1], currentPlayer.getSymbol());
        if (board.checkWin(currentPlayer.getSymbol())) { // Kontrollera vinst
            board.displayBoard();
            System.out.println(currentPlayer.getName() + "wins!");
            gameWon = true;
        } else if (board.isFull()) { // Kontrollera oavgjort
            board.displayBoard();
            System.out.println("It's a draw!");
            gameWon = true;
        }

        if (gameWon) {
            System.out.println("Game over. Restating game again:");
            board.resetBoard(); // Återställ brädet
            gameWon = false;
            currentPlayer = p1; // Starta om med spelare 1
            continue;
        }
        currentPlayer = (currentPlayer == p1) ? p2 : p1; // Byt spelare
    }
 }
}