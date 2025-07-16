import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initBoard();
        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard();

        char currentPlayer = 'X';
        int moves = 0;

        while (true) {
            int row = -1, col = -1;

            while (true) {
                System.out.print("玩家 " + currentPlayer + " 請輸入 row col (0-4): ");
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                } else {
                    scanner.next(); // skip invalid
                    System.out.println("請輸入數字！");
                    continue;
                }

                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                } else {
                    scanner.next();
                    System.out.println("請輸入數字！");
                    continue;
                }

                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("座標超出範圍，請重新輸入！");
                } else if (board[row][col] != '.') {
                    System.out.println("該位置已有棋子，請重新輸入！");
                } else {
                    break;
                }
            }

            board[row][col] = currentPlayer;
            moves++;
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");
            printBoard();

            if (checkWin(currentPlayer)) {
                System.out.println("玩家 " + currentPlayer + " 獲勝！");
                break;
            } else if (moves == SIZE * SIZE) {
                System.out.println("平手！");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    static void initBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '.';
            }
        }
    }

    static void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < SIZE; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != player) rowWin = false;
                if (board[j][i] != player) colWin = false;
            }
            if (rowWin || colWin) return true;
        }

        // Check main diagonal
        boolean mainDiagWin = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player) {
                mainDiagWin = false;
                break;
            }
        }

        // Check anti-diagonal
        boolean antiDiagWin = true;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][SIZE - 1 - i] != player) {
                antiDiagWin = false;
                break;
            }
        }

        return mainDiagWin || antiDiagWin;
    }
}
