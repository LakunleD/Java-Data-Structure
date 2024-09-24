import java.util.Scanner;

public class WorkingWith2DArrays {
    private static char [][] board = new char[3][3];
    private static char currentPlayer = 'X';
    public static void main(String[] args) {

        initializeBoard();
        playGame();

    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public static void playGame() {
        boolean gameWon = false;
        boolean isDraw = false;
        printBoard();

        while (!gameWon && !isDraw) {
            playerMove();
            printBoard();
            gameWon = checkWin();
            if (gameWon) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            isDraw = checkDraw();
            if (isDraw) {
                System.out.println("The game is a draw!");
                break;
            }
            switchPlayer();
        }
    }

    public static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row = -1, col = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (row >= 0 && col >= 0 && row < 3 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                validInput = true;
            } else {
                System.out.println("This move is not valid, try again.");
            }
        }
    }

    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
