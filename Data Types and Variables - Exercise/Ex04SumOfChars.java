package com.company;

import java.util.Scanner;

public class Ex04SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumASCIICode = 0;
        int countOfSymbols = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < countOfSymbols; i++) {
            char symbol = sc.nextLine().charAt(0);
            sumASCIICode += (int) symbol;
        }
        System.out.println("The sum equals: "+sumASCIICode);

    }
}
