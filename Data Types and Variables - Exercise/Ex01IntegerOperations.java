package com.company;

import java.util.Scanner;

public class Ex01IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());
        int fourthNumber = Integer.parseInt(sc.nextLine());
       Long sumOfFirstTwoNumbers = Long.valueOf(firstNumber) + Long.valueOf(secondNumber);
        Long result=sumOfFirstTwoNumbers/Long.valueOf(thirdNumber);
        System.out.println(result*Long.valueOf(fourthNumber));
    }


}
