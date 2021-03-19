package com.company;

import java.util.Scanner;

public class Ex04PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean firstCheck = checkCharacters(password);
        boolean secondCheck = checkPassword(password);
        boolean thirdCheck = checkDigit(password);
        if (!firstCheck) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!secondCheck) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!thirdCheck) {
            System.out.println("Password must have at least 2 digits");
        }
        if (firstCheck && secondCheck && thirdCheck) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkDigit(String password) {
        int countOfDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countOfDigit++;
            }
        }
        if (countOfDigit >= 2) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkPassword(String password) {
        boolean isValid = true;
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isDigit(password.charAt(i))) && !(Character.isLetter(password.charAt(i)))) {
                isValid = false;
            }
        }
        return isValid;
    }

    private static boolean checkCharacters(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
