package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("End")) {
            String[] partOfCommand = command.split("\\s+");
            String nameOfCommand = partOfCommand[0];
            switch (nameOfCommand) {
                case "Add":
                    int numberToAdd = Integer.parseInt(partOfCommand[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(partOfCommand[1]);
                    int indexToInsert = Integer.parseInt(partOfCommand[2]);
                    if (isValid(indexToInsert, numbers)) {
                        numbers.add(indexToInsert, numberToInsert);

                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(partOfCommand[1]);
                    if (isValid(indexToRemove, numbers)) {
                        numbers.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String typeOfShift = partOfCommand[1];
                    int count = Integer.parseInt(partOfCommand[2]);
                    if (typeOfShift.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int firstElement = numbers.remove(0);
                            numbers.add(firstElement);

                        }
                    } else if (typeOfShift.equals("right")) {
                        for (int i = 0; i < count; i++) {
                            int lastElement = numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastElement);

                        }
                    }
                    break;

            }
            command = sc.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValid(int position, List<Integer> numbers) {
        if (position < 0 || position >= numbers.size()) {
            return false;
        } else {
            return true;
        }
    }

}
