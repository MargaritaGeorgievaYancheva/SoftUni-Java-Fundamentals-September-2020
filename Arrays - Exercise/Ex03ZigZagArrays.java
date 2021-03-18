package com.company;

import java.util.Scanner;

public class Ex03ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] firstArrOfNumbers = new int[n];
        int[] secondArrOfNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("\\s+");
            if (i % 2 == 0) {
                firstArrOfNumbers[i] = Integer.parseInt(arr[0]);
                secondArrOfNumbers[i] = Integer.parseInt(arr[1]);
            } else {
                firstArrOfNumbers[i] = Integer.parseInt(arr[1]);
                secondArrOfNumbers[i] = Integer.parseInt(arr[0]);

            }
        }
        printArr(firstArrOfNumbers);
        System.out.println();
        printArr(secondArrOfNumbers);
    }

    private static void printArr(int[] firstArrOfNumbers) {
        for (int i = 0; i < firstArrOfNumbers.length; i++) {
            System.out.print(firstArrOfNumbers[i] + " ");
        }

    }
}
