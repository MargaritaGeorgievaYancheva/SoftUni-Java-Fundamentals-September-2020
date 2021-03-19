package com.company;

import java.util.Scanner;

public class Ex07NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        printMatrix(number);
    }

    private static void printMatrix(int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
