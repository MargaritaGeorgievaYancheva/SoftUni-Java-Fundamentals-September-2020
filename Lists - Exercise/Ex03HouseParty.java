package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfCommands = Integer.parseInt(sc.nextLine());
        List<String> guests = new ArrayList<String>();
        for (int i = 0; i < countOfCommands; i++) {
            String[] partOfCommand = sc.nextLine().split("\\s+");
            String check = partOfCommand[2];
            String nameOfGuest = partOfCommand[0];
            if (check.equals("going!")) {
                if (guests.contains(nameOfGuest)) {
                    System.out.println(nameOfGuest + " is already in the list!");
                } else {
                    guests.add(nameOfGuest);
                }
            } else if (check.equals("not")) {
                if (guests.contains(nameOfGuest)) {
                   guests.remove(nameOfGuest);
                } else {
                    System.out.println(nameOfGuest + " is not in the list!");
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
