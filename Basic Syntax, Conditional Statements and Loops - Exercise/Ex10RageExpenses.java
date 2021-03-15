package com.company;

import java.util.Scanner;

public class Ex10RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfLostGames = Integer.parseInt(sc.nextLine());
        double priceOfHeadset = Double.parseDouble(sc.nextLine());
        double priceOfMouse = Double.parseDouble(sc.nextLine());
        double priceOfKeyboard = Double.parseDouble(sc.nextLine());
        double priceOfDisplay = Double.parseDouble(sc.nextLine());
        int countOfHeadset = 0;
        int countOfMouse = 0;
        int countOfKeyboard = 0;
        int countOfDisplay = 0;
        int countOfTrashedKeyboard = 0;
        for (int i = 1; i <= countOfLostGames; i++) {

            if (i % 2 == 0) {
                countOfHeadset++;
            }
            if (i % 3 == 0) {
                countOfMouse++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                countOfKeyboard++;
                countOfTrashedKeyboard++;
                if (countOfTrashedKeyboard % 2 == 0) {
                    countOfDisplay++;
                }
            }

        }
        double result =
                (priceOfHeadset * countOfHeadset) +
                        (priceOfKeyboard * countOfKeyboard) +
                        (priceOfMouse * countOfMouse) +
                        (priceOfDisplay * countOfDisplay);
        System.out.printf("Rage expenses: %.2f lv.", result);
    }
}


