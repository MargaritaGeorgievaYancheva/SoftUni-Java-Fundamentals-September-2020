package com.company;

import java.util.Scanner;

public class Ex10PokeMon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int m=Integer.parseInt(sc.nextLine());
        int y=Integer.parseInt(sc.nextLine());
        int result=n;
        int countOfTarget=0;

        while (true){
            if(result==n*0.5){
                try {
                    result=result/y;
                }catch (Exception e){

                }

            }
            if(result<m){
                break;
            }

            result=result-m;
            countOfTarget++;

        }
        System.out.println(result);
        System.out.println(countOfTarget);
        
}

    }

