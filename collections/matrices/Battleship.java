import java.util.Random;

public class Battleship {
    public static void main(String[] args) {
        int boardLength = 12;
        int boardDepth = 12;
        String[][] board = new String[boardLength][boardDepth];
        placeLand(board, boardDepth);
        placeShips(board, boardDepth);
        printBoard(board);
    }

    private static String[][] placeLand(String[][] board, int boardDepth) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < boardDepth; j++) {
                board[i][j] = ". ";
                if (i == 0 || i == board.length - 1) {
                    board[i][j] = "T ";
                }
                if (j == 0 || j == board.length - 1) {
                    board[i][j] = "T ";
                }
            }
        }
        return board;
    }

    private static String[][] placeShips(String[][] board, int boardDepth) {
        int[] ships = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        String numbers = "1234";
        Random r = new Random();
        for (int ship : ships) {
            boolean exit = false;
            while (!exit) {
                int randomH = r.nextInt(10) + 1;
                int randomV = r.nextInt(10) + 1;
                if (!numbers.contains(board[randomV][randomH])) {
                    int shipPosition = checkShipPosition(board, randomV, randomH, boardDepth, ship);
                    if (shipPosition != -1) {
                        if (shipPosition == 1) {
                            for (int i = 0; i < ship; i++) {
                                board[randomV + i][randomH] = ship + " ";
                            }
                        } else {
                            for (int i = 0; i < ship; i++) {
                                board[randomV][randomH + i] = ship + " ";
                            }
                        }
                        exit = true;
                    }
                }
            }
            printBoard(board);
            System.out.println("\n");
        }
        return board;
    }

    private static int checkShipPosition(String[][] board, int i, int j, int boardDepth, int ship) {
        String numbers = "1234";
        if ((i > 0 && j > 0) && (i < board.length - 1 && j < boardDepth - 1)) {
            for (int k = 0; k < ship; k++) {
                if (board[i - 1 + k][j + k].equals("T ")) {
                    return -1;
                }
                if (board[i - 1 + k][j - 1 + k].equals("T ")) {
                    return -1;
                }
                if (board[i + k][j - 1 + k].equals("T ")) {
                    return -1;
                }
                if (board[i + 1 + k][j + k].equals("T ")) {
                    return -1;
                }
                if (board[i + 1 + k][j + 1 + k].equals("T ")) {
                    return -1;
                }
                if (board[i + k][j + 1 + k].equals("T ")) {
                    return -1;
                }
            }

            boolean continueVertically = true;
            for (int k = 0; k < ship; k++) {
                if (numbers.contains(board[i - 1 + k][j].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i - 1 + k][j - 1].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i + k][j - 1].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i + 1 + k][j - 1].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i + 1 + k][j].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i + 1 + k][j + 1].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i + k][j + 1].stripTrailing())) {
                    continueVertically = false;
                }
                if (numbers.contains(board[i - 1 + k][j + 1].stripTrailing())) {
                    continueVertically = false;
                }
                if (!continueVertically) {
                    break;
                }
            }
            if (continueVertically) {
                return 1;
            }

            boolean continueHorizontally = true;
            for (int k = 0; k < ship; k++) {
                if (numbers.contains(board[i - 1][j + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i - 1][j - 1 + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i][j - 1 + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i + 1][j - 1 + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i + 1][j + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i + 1][j + 1 + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i][j + 1 + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (numbers.contains(board[i - 1][j + 1 + k].stripTrailing())) {
                    continueHorizontally = false;
                }
                if (!continueHorizontally) {
                    break;
                }
            }
            if (continueHorizontally) {
                return 0;
            }
        }
        return -1;
    }

    private static void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.print("\n");
        }
    }
}
