package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] partsOfCommand = command.split("\\s+");
            String nameOfCommand = partsOfCommand[0];
            switch (nameOfCommand) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(partsOfCommand[1]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == elementToDelete) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(partsOfCommand[1]);
                    int position = Integer.parseInt(partsOfCommand[2]);
                    if (isValid(position, numbers)) {
                        numbers.add(position, elementToInsert);
                    }


            }
            command = sc.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValid(int position, List<Integer> numbers) {
        if (position < 0 || position > numbers.size()) {
            return false;
        } else {
            return true;
        }
    }
}
