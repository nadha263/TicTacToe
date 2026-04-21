package org.example;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        int slot = getUserSlot();


        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot entered: " + slot);
        System.out.println("Mapped to Board - Row: " + row + ", Column: " + col);
    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return sc.nextInt();
    }
}



