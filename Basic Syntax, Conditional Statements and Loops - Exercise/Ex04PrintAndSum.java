package com.company;

import java.util.Scanner;

public class Ex04PrintAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberToStart=Integer.parseInt(sc.nextLine());
        int numberToEnd= Integer.parseInt(sc.nextLine());
        int sumOfNumbersBetween=0;
        for (int i = numberToStart; i <= numberToEnd; i++) {
            System.out.print(i+" ");
            sumOfNumbersBetween+=i;
        }
        System.out.println();
        System.out.println("Sum: "+sumOfNumbersBetween);
    }
}
