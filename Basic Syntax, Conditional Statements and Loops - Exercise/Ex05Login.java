package com.company;

import java.util.Scanner;

public class Ex05Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String truePass = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            truePass += username.charAt(i);
        }
        String command = sc.nextLine();
        int countOfTry = 0;
        while (true) {
            if (command.equals(truePass)) {
                System.out.println("User " + username + " logged in.");
                break;
            }
            countOfTry++;
            if (countOfTry == 4) {
                System.out.println("User " + username + " blocked!");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                command = sc.nextLine();
            }

        }
    }
}
