package com.company;

import java.util.Scanner;

public class Ex01Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String typeOfPerson = " ";
        if (age >= 0 && age <= 2) {
            typeOfPerson = "baby";
        }
        if (age >= 3 && age <= 13) {
            typeOfPerson = "child";
        }
        if (age >= 14 && age <= 19) {
            typeOfPerson = "teenager";
        }
        if (age >= 20 && age <= 65) {
            typeOfPerson = "adult";
        }
        if (age >= 66) {
            typeOfPerson = "elder";
        }
        System.out.println(typeOfPerson);
    }
}
