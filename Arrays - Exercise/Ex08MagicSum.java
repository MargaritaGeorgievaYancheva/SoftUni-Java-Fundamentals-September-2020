package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int givenSum = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == givenSum) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
