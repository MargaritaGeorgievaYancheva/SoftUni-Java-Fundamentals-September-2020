package com.company;
import java.util.Scanner;

public class Ex03Vacation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(sc.nextLine());
        String typeOfGroup = sc.nextLine();
        String day = sc.nextLine();
        double discount = 0.0, priceForOnePeople = 0.0, result = 0;
        switch (typeOfGroup) {
            case "Students": {
                if (day.equals("Friday")) {
                    priceForOnePeople = 8.45;
                } else if (day.equals("Saturday")) {
                    priceForOnePeople = 9.80;
                } else if (day.equals("Sunday")) {
                    priceForOnePeople = 10.46;
                }
                if (countOfPeople >= 30) {
                    discount = 0.15;
                }
                break;
            }
            case "Business": {
                if (day.equals("Friday")) {
                    priceForOnePeople = 10.90;
                } else if (day.equals("Saturday")) {
                    priceForOnePeople = 15.60;
                } else if (day.equals("Sunday")) {
                    priceForOnePeople = 16;
                }
                if (countOfPeople >= 100) {
                    countOfPeople = countOfPeople - 10;
                }
                break;
            }
            case "Regular": {
                if (day.equals("Friday")) {
                    priceForOnePeople = 15;
                } else if (day.equals("Saturday")) {
                    priceForOnePeople = 20;
                } else if (day.equals("Sunday")) {
                    priceForOnePeople = 22.50;
                }
                if (countOfPeople >= 10 && countOfPeople <= 20) {
                    discount = 0.05;
                }
                break;
            }
        }
        result = countOfPeople * priceForOnePeople;
        result = result - (discount * result);
        System.out.printf("Total price: %.2f", result);
    }
}
