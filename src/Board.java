public class Board {
    private  char[][] grid;
    private  static final  int SIZE = 3;

    public  Board () {
        grid = new char[SIZE][SIZE];
        resetBoard();
    }

    public  void displayBoard() { // Visa brädet
        System.out.println("Current Board:");
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print(grid[row][col] + " "); //
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col) { // Kontrollera giltigt drag
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && grid[row][col] == '-';
    }

    public  void  makeMove(int row, int col, char symbol) { // Gör Drag
        if (isValidMove(row,col)) {
            grid[row][col] = symbol;
        }
    }

    public boolean checkWin(char symbol) {
        // Kolla  rader och kolumner
        for (int i = 0; i < SIZE; i++) {
            if ((grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) ||
            (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol)){
                return true;
            }
        }
        //Kolla diagonaler
        return (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) ||
                (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol);
    }
       // Kontrollera om brädet är fullt
    public  boolean isFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (grid[row][col] == '-') {
                    return false;
                }
            }
        }
        return  true;
    }
        // Äterställ brädet
        public void resetBoard() {
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    grid[row][col] = '-';
                }
            }
        }
    }

