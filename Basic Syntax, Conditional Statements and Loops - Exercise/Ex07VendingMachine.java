package com.company;

import java.util.Scanner;

public class Ex07VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        double totalMoney = 0.0;

        while (true) {
            if (command.equals("Start")) {
                break;
            }
            double money = Double.parseDouble(command);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                totalMoney += money;

            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
            command = sc.nextLine();

        }
        String commandForProducts = sc.nextLine();
        double currentMoney = totalMoney;
        while (true) {
            if (commandForProducts.equals("End")) {
                break;
            }
            if (commandForProducts.equals("Nuts")) {

                currentMoney -= 2.0;
                if (currentMoney < 0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 2.0;
                    System.out.println("Purchased " + commandForProducts);
                }

            } else if (commandForProducts.equals("Water")) {
                currentMoney -= 0.7;
                if (currentMoney < 0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 0.7;
                    System.out.println("Purchased " + commandForProducts);
                }
            } else if (commandForProducts.equals("Crisps")) {
                currentMoney -= 1.5;
                if (currentMoney < 0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 1.5;
                    System.out.println("Purchased " + commandForProducts);
                }
            } else if (commandForProducts.equals("Soda")) {
                currentMoney -= 0.8;
                if (currentMoney < 0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 0.8;
                    System.out.println("Purchased " + commandForProducts);
                }
            } else if (commandForProducts.equals("Coke")) {
                currentMoney -= 1.0;
                if (currentMoney < 0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= 1.0;
                    System.out.println("Purchased " + commandForProducts);
                }
            } else {
                System.out.println("Invalid product");
            }
            commandForProducts = sc.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}
