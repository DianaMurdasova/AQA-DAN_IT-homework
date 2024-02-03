package Homeworks.HWL7;

import java.util.Random;
import java.util.Scanner;

public class BoardGame {
    public static void main(String[] args) {
        char[][] gameBoard = initializeGameBoard();
        displayGameBoard(gameBoard);

        System.out.println("All Set. Get ready to rumble!");

        Random random = new Random();
        int targetRow = random.nextInt(5) + 1;
        int targetColumn = random.nextInt(5) + 1;

        while (true) {
            int playerRow = getPlayerInput("Enter the row (1-5): ");
            int playerColumn = getPlayerInput("Enter the column (1-5): ");

            if (playerRow == targetRow && playerColumn == targetColumn) {
                gameBoard[targetRow][targetColumn] = 'x';
                displayGameBoard(gameBoard);
                System.out.println("You have won!");
                break;
            } else {
                if (isValidInput(playerRow) && isValidInput(playerColumn)) {
                    if (gameBoard[playerRow][playerColumn] == '-') {
                        System.out.println("Missed! Try again.");
                        gameBoard[playerRow][playerColumn] = '*';
                        displayGameBoard(gameBoard);
                    } else {
                        System.out.println("You have already shot there. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Row and column must be between 1 and 5. Try again.");
                }
            }
        }
    }

    private static char[][] initializeGameBoard() {
        char[][] board = new char[6][6];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0 || j == 0) {
                    board[i][j] = (char) ('0' + Math.max(i, j));
                } else {
                    board[i][j] = '-';
                }
            }
        }

        return board;
    }

    private static void displayGameBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("[" + board[i][j] + "] ");
            }
            System.out.println();
        }
    }

    private static int getPlayerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static boolean isValidInput(int input) {
        return input >= 1 && input <= 5;
    }
}
