package com.company;

import java.util.Scanner;

public class Ex09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startingYield = Integer.parseInt(sc.nextLine());
        int countOfDays = 0;
        long totalSum = 0;
        if (startingYield > 0) {
            while (true) {
                if (startingYield < 100) {
                    if (totalSum >= 26) {
                        totalSum -= 26;
                    }
                    break;
                }
                long currentYield = startingYield - 26;
                startingYield -= 10;
                countOfDays++;
                totalSum += currentYield;
            }

            System.out.println(countOfDays);
            System.out.println(totalSum);
        } else {
            System.out.println(0);
            System.out.println(0);
        }

    }
}
