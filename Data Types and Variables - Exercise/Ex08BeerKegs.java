package com.company;

import java.util.Scanner;

public class Ex08BeerKegs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int countOfBeers=Integer.parseInt(sc.nextLine());
        double volume=0.0;
        double maxVolume=0.0;
        String maxModelName="";
        for (int i = 1; i <=countOfBeers ; i++) {
            String modelOfBeer=sc.nextLine();
            double radiusOfKeg=Double.parseDouble(sc.nextLine());
            int heightOfKeg=Integer.parseInt(sc.nextLine());
           volume=Math.PI+Math.pow(radiusOfKeg, 2)*heightOfKeg;
            if(volume>maxVolume){
                maxVolume=volume;
                maxModelName=modelOfBeer;
            }
        }
        System.out.println(maxModelName);
    }
}
