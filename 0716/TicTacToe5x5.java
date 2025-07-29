import java.util.Scanner;

public class TicTacToe5x5 {
    static final int SIZE = 5;
    static final char EMPTY = '.';
    static final char X = 'X';
    static final char O = 'O';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                board[i][j] = EMPTY;

        char current = X;
        System.out.println("=== 5x5 井字遊戲 ===");
        printBoard(board);

        while (true) {
            System.out.print("請玩家 " + current + " 輸入 row col：");

            int row, col;
            if (sc.hasNextInt()) {
                row = sc.nextInt();
            } else {
                sc.next(); // 忽略錯誤輸入
                System.out.println("請輸入整數！");
                continue;
            }

            if (sc.hasNextInt()) {
                col = sc.nextInt();
            } else {
                sc.next();
                System.out.println("請輸入兩個整數！");
                continue;
            }

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("超出範圍，請重試！");
                continue;
            }

            if (board[row][col] != EMPTY) {
                System.out.println("這個位置已被佔用！");
                continue;
            }

            board[row][col] = current;
            System.out.println("玩家 " + current + " 在位置 (" + row + ", " + col + ") 放置棋子");
            printBoard(board);

            if (checkWin(board, current)) {
                System.out.println("玩家 " + current + " 獲勝！");
                break;
            }

            if (isFull(board)) {
                System.out.println("平手！");
                break;
            }

            current = (current == X) ? O : X;
        }

        sc.close();
    }

    static void printBoard(char[][] board) {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j]);
                if (j < SIZE - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    static boolean checkWin(char[][] b, char p) {
        // 檢查每一行
        for (int i = 0; i < SIZE; i++) {
            boolean all = true;
            for (int j = 0; j < SIZE; j++) {
                if (b[i][j] != p) {
                    all = false;
                    break;
                }
            }
            if (all) return true;
        }

        // 檢查每一列
        for (int j = 0; j < SIZE; j++) {
            boolean all = true;
            for (int i = 0; i < SIZE; i++) {
                if (b[i][j] != p) {
                    all = false;
                    break;
                }
            }
            if (all) return true;
        }

        // 主對角線
        boolean diag1 = true;
        for (int i = 0; i < SIZE; i++) {
            if (b[i][i] != p) {
                diag1 = false;
                break;
            }
        }
        if (diag1) return true;

        // 反對角線
        boolean diag2 = true;
        for (int i = 0; i < SIZE; i++) {
            if (b[i][SIZE - 1 - i] != p) {
                diag2 = false;
                break;
            }
        }
        return diag2;
    }

    static boolean isFull(char[][] b) {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (b[i][j] == EMPTY) return false;
        return true;
    }
}
