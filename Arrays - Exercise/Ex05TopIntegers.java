package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.print(numbers[i] + " ");
            }

        }
    }
}
