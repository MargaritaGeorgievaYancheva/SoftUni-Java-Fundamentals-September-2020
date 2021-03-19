package com.company;

import java.util.Collection;
import java.util.Scanner;

public class Ex09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (true) {
            if (command.equals("END")) {
                break;
            }
            if (isPalindrome(command)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            command = sc.nextLine();
        }
    }

    private static boolean isPalindrome(String command) {
        String reverse = String.valueOf(new StringBuilder(command).reverse());
        if (command.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}
