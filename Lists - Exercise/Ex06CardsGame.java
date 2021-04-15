package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06CardsGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> cardsOfFirstPlayer = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> cardsOfSecondPlayer = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean isFirst=true;
        while(true) {
            int cardOfFirst=cardsOfFirstPlayer.get(0);
            int cardOfSecond=cardsOfSecondPlayer.get(0);
            if(cardOfFirst>cardOfSecond){
                cardsOfFirstPlayer.remove(Integer.valueOf(cardOfFirst));
                cardsOfFirstPlayer.add(cardOfFirst);
                cardsOfFirstPlayer.add(cardOfSecond);

                cardsOfSecondPlayer.remove(Integer.valueOf(cardOfSecond));
            }else if(cardOfFirst<cardOfSecond){
                cardsOfSecondPlayer.remove(Integer.valueOf(cardOfSecond));
                cardsOfSecondPlayer.add(cardOfSecond);
                cardsOfSecondPlayer.add(cardOfFirst);

                cardsOfFirstPlayer.remove(Integer.valueOf(cardOfFirst));
            }else if(cardOfFirst==cardOfSecond){
                cardsOfFirstPlayer.remove(Integer.valueOf(cardOfFirst));
                cardsOfSecondPlayer.remove(Integer.valueOf(cardOfSecond));
            }
            if(cardsOfFirstPlayer.size()<1){

                isFirst=false;
                break;
            }
            if(cardsOfSecondPlayer.size()<1){

                break;
            }

        }
        int sum=0;
        if(isFirst){
            for (Integer card : cardsOfFirstPlayer) {
                sum+=card;
            }
            System.out.println("First player wins! Sum: "+sum);
        }else {
            for (Integer card : cardsOfSecondPlayer) {
                sum+=card;
            }
            System.out.println("Second player wins! Sum: "+sum);
        }

    }
}
