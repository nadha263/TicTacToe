package org.example;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        for (int turn = 0; turn < 9; turn++) {

            char currentPlayer = (turn % 2 == 0) ? 'X' : 'O';
            System.out.println("\nPlayer " + currentPlayer + "'s turn");

            int slot = getUserSlot();

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;
            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("Spot taken! Try again.");
                turn--;
                continue;
            }
            printBoard(board);
        }
        System.out.println("Game Over!");
    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }}
