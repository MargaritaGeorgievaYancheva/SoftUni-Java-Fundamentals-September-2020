package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01Train {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> wagons= Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity= Integer.parseInt(sc.nextLine());
        String command=sc.nextLine();

        while (!command.equals("end")){
            String[] partOfCommand=command.split("\\s+");
            if(partOfCommand[0].equals("Add")){
                int passenger=Integer.parseInt(partOfCommand[1]);
                wagons.add(passenger);

            }else {
                int passenger=Integer.parseInt(partOfCommand[0]);
                for (int i = 0; i <wagons.size() ; i++) {
                   if(wagons.get(i)<maxCapacity){
                       if(wagons.get(i)+passenger<=maxCapacity){
                           wagons.set(i, wagons.get(i)+passenger);
                           break;
                       }

                   }
                }
            }
            command=sc.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon+" ");
        }
    }
}
