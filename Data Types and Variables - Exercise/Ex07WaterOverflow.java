package com.company;

import java.util.Scanner;

public class Ex07WaterOverflow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tankCapacity=255;
        int currentTankCapacity=255;
        int countOfLines=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <countOfLines ; i++) {
            int quantityOfWater=Integer.parseInt(sc.nextLine());
            if(quantityOfWater>currentTankCapacity){
                System.out.println("Insufficient capacity!");
                continue;
            }else {
                currentTankCapacity-=quantityOfWater;
            }
        }
        System.out.println(tankCapacity-currentTankCapacity);
    }
}
