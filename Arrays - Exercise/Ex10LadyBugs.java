package com.company;

import java.util.Scanner;

public class Ex10LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[] field = new int[size];
        String[] bugIndexes = sc.nextLine().split("\\s+");
        for (int i = 0; i < bugIndexes.length; i++) {
            int bugIndex = Integer.parseInt(bugIndexes[i]);
            if (bugIndex >= 0 && bugIndex < field.length) {
                field[bugIndex] = 1;
            }
        }
        String line = sc.nextLine();
        while (!line.equals("end")) {
            String[] commands = line.split("\\s+");
            int bugIndex = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);
            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] != 1) {
                line = sc.nextLine();
                continue;
            }
            field[bugIndex]=0;
            if (direction.equals("right")) {
                bugIndex += length;
                while (bugIndex < field.length && field[bugIndex] == 1) {
                    bugIndex += length;
                }
                if (bugIndex < field.length) {
                    field[bugIndex] = 1;
                }

            } else if (direction.equals("left")) {
                bugIndex -= length;
                while (bugIndex >= 0 && field[bugIndex] == 1) {
                    bugIndex -= length;
                }
                if (bugIndex >= 0) {
                    field[bugIndex] = 1;
                }
            }
            line = sc.nextLine();
        }
        for (int i : field) {
            System.out.print(i + " ");
        }
    }
}
