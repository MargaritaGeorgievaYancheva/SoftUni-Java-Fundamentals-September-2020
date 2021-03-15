package com.company;

import java.util.Scanner;

public class Ex06StrongNumber {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int currentNumber = number;
        int sumOfTheFactorial = 0;
        while (currentNumber != 0) {
            sumOfTheFactorial += factorial(currentNumber % 10);
            currentNumber = currentNumber / 10;
        }
        if (sumOfTheFactorial == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
