package com.company;

import java.util.Scanner;

public class Ex05PrintPartASCIITable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstIndex=Integer.parseInt(sc.nextLine());
        int secondIndex=Integer.parseInt(sc.nextLine());
        for (int i = firstIndex; i <=secondIndex ; i++) {
            char symbol=(char)i;
            System.out.print(symbol+" ");
        }

    }
}
