package com.company;

import java.util.Scanner;

public class Ex05AddSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger = Integer.parseInt(sc.nextLine());
        int secondInteger = Integer.parseInt(sc.nextLine());
        int thirdInteger = Integer.parseInt(sc.nextLine());
        int sumOfFirstTwo = sum(firstInteger, secondInteger);
        int result = subtract(sumOfFirstTwo, thirdInteger);
        System.out.println(result);
    }

    private static int subtract(int sumOfFirstTwo, int thirdInteger) {
        return sumOfFirstTwo - thirdInteger;
    }

    private static int sum(int firstInteger, int secondInteger) {
        return firstInteger + secondInteger;
    }
}
