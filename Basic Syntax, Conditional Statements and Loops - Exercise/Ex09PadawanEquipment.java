package com.company;

import java.util.Scanner;

public class Ex09PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int countOfStudents = Integer.parseInt(sc.nextLine());
        double priceOfLightsabers = Double.parseDouble(sc.nextLine());
        double priceOfRobes = Double.parseDouble(sc.nextLine());
        double priceOfBelts = Double.parseDouble(sc.nextLine());
        double totalPriceLightsabers = 0.0, totalPriceRobes = 0.0, totalPriceBells = 0.0;
        totalPriceLightsabers = (countOfStudents + Math.ceil(0.1 * countOfStudents)) * priceOfLightsabers;
        totalPriceRobes = priceOfRobes * countOfStudents;

        if ((countOfStudents / 6) > 0) {
            countOfStudents = countOfStudents - (countOfStudents / 6);
            totalPriceBells = countOfStudents * priceOfBelts;
        } else {
            totalPriceBells = countOfStudents * priceOfBelts;
        }

        double result = totalPriceBells + totalPriceLightsabers + totalPriceRobes;
        if (result <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", result);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (result - budget));
        }
    }
}
