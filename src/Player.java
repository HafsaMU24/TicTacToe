import java.util.Scanner;

public class Player {
private  String name;
private char symbol;
private Scanner scanner;

// Konstruktor
public Player(String name, char symbol, Scanner scanner) {
    this.name = name;
    this.symbol = symbol;
    this.scanner = scanner;
}
// Hämta spelarens symbol
    public  String getName() {
      return name;
    }

public  char getSymbol() {
    return  symbol;
}

// Ta spelarens drag
public int[] getMove() {

    while (true) {
        try {
            System.out.print("enter row and column (e.g., 1 2 for row 1, column 2 for row 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() -1;
            return new int[]{ row,col };
        }catch (Exception e) {
            System.out.println("Invalid input. Please inter tow itegers.");
            scanner.next(); // Rens felaktig input
        }
    }
  }
}
