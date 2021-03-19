package com.company;

import java.util.Scanner;

public class Ex06MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String middleCharacter = findMiddleCharacter(word);
        System.out.println(middleCharacter);
    }

    private static String findMiddleCharacter(String word) {
        String result = "";
        if (word.length() % 2 == 0) {
            result += word.charAt((word.length() / 2) - 1);
            result += word.charAt(word.length() / 2);
        } else {
            result += word.charAt(word.length() / 2);
        }
        return result;
    }
}
