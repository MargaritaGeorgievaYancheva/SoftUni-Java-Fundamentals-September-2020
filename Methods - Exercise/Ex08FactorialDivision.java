package com.company;

import java.util.Scanner;

public class Ex08FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        try {
            double result = factorial(firstNumber) / factorial(secondNumber);
            System.out.printf("%.2f", result);
        } catch (Exception e) {
        }
    }

    public static double factorial(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        else {
            return (n * factorial(n - 1));
        }
    }
}
