package com.company;

import java.util.Scanner;

public class Ex06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        char firstSymbol='a';
        int symbol=(int)firstSymbol;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k <n ; k++) {
                    char firstChar=(char) ('a'+i);
                    char secondChar=(char)('a'+j);
                    char thirdChar=(char)('a'+k);
                    System.out.println(firstChar+""+secondChar+""+thirdChar);
                }

            }

        }
    }
}
