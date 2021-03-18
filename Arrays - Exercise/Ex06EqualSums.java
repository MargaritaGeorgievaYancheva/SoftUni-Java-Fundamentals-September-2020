package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06EqualSums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers= Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        boolean sumExists=false;
        int indexOfSum=0;

        for (int i = 0; i <numbers.length ; i++) {
            int leftSum=0;
            int rightSum=0;
            for (int j = 0; j <i ; j++) {
                leftSum+=numbers[j];
            }
            for (int j = i+1; j <numbers.length ; j++) {
                rightSum+=numbers[j];
            }
            if(leftSum==rightSum){
               indexOfSum=i;
                sumExists=true;
            }
        }
        if(sumExists){
            System.out.println(indexOfSum);
        }else {
            System.out.println("no");
        }
    }
}
