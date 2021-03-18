package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int maxCount = 0;
        int index = 0;
        int bestIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    index = i;
                    if (count > maxCount) {
                        maxCount = count;
                        bestIndex = index;
                    }
                } else {
                    break;
                }
            }


        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(numbers[i + bestIndex] + " ");
        }
    }

}
