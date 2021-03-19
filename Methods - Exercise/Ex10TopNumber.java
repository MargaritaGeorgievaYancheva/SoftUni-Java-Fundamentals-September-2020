package com.company;

import java.util.Scanner;

public class Ex10TopNumber {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        printTopNumber(number);
    }

    public static void printTopNumber(int number) {
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            boolean oddDigit = false;
            int cpy = i;
            while (true) {
                if (cpy == 0) {
                    break;
                }
                int digit = cpy % 10;
                sum += digit;
                if (digit % 2 != 0) {
                    oddDigit = true;
                }
                cpy /= 10;
            }
            if (sum % 8 == 0 && oddDigit == true) {
                System.out.println(i);
            }
        }
    }



}
