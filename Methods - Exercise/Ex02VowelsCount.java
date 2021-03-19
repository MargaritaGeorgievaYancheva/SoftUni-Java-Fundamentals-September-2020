package com.company;

import java.util.Scanner;

public class Ex02VowelsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        findAndPrintCountOfVowels(word);
    }

    private static void findAndPrintCountOfVowels(String word1) {
        String word=word1.toLowerCase();
        int countOfVowels=0;
        for (int i = 0; i <word.length() ; i++) {
            char symbol=word.charAt(i);
            if(symbol=='a'||symbol=='e'||symbol=='o'||symbol=='u'||symbol=='i'){
                countOfVowels++;
            }
        }
        System.out.println(countOfVowels);
    }
}
