package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int countOfRotation = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=countOfRotation ; i++) {
            int n = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {

                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = n;

        }
        printArr(numbers);

    }

    private static void printArr(int[] firstArrOfNumbers) {
        for (int i = 0; i < firstArrOfNumbers.length; i++) {
            System.out.print(firstArrOfNumbers[i] + " ");
        }

    }
}
