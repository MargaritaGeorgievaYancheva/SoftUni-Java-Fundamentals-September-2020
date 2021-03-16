package com.company;

import java.util.Scanner;

public class Ex03Elevator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfPeople=Integer.parseInt(sc.nextLine());
        int capacityOfElevator=Integer.parseInt(sc.nextLine());
        int courses=(int)Math.ceil((double)numberOfPeople/capacityOfElevator);
        System.out.println(courses);
    }
}
