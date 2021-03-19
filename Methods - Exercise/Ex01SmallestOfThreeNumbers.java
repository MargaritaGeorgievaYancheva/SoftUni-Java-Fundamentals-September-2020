package com.company;

import java.util.Scanner;

public class Ex01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int smallOfTwoNumbers = findSmallerNumber(firstNumber,secondNumber);
        System.out.println(findSmallerNumber(smallOfTwoNumbers,thirdNumber));
    }

    private static int findSmallerNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
