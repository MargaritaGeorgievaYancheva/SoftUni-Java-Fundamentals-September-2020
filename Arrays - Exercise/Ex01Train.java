package com.company;

import java.util.Scanner;

public class Ex01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfWagons = Integer.parseInt(sc.nextLine());
        int[] peoplesInTrain = new int[countOfWagons];
        int sumOfPeople = 0;
        for (int i = 0; i < countOfWagons; i++) {
            peoplesInTrain[i] = Integer.parseInt(sc.nextLine());
            sumOfPeople += peoplesInTrain[i];
        }
        for (int people : peoplesInTrain) {
            System.out.print(people+" ");
        }
        System.out.println();
        System.out.println(sumOfPeople);
    }
}
