package com.company;

import java.util.Scanner;

public class Ex03CharactersInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char firstChar=sc.nextLine().charAt(0);
        char secondChar=sc.nextLine().charAt(0);
        printCharactersInRange(firstChar,secondChar);
    }

    private static void printCharactersInRange(char firstChar, char secondChar) {

        if(firstChar<secondChar){
            firstChar++;
            for (int i = firstChar; i <secondChar ; i++) {
                System.out.print((firstChar++)+" ");

            }
        }else {
            secondChar++;
            for (int i = secondChar; i <firstChar ; i++) {
                System.out.print((secondChar++)+" ");

            }
        }

    }
}
