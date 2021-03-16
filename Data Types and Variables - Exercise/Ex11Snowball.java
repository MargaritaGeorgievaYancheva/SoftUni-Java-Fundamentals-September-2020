package com.company;

import java.util.Scanner;

public class Ex11Snowball {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = Integer.parseInt(sc.nextLine());
        long max = Integer.MIN_VALUE;
        int endSnowBallSnow = 0, endSnowBallTime = 0, endSnowBallQuality = 0;
        for (int i = 0; i < n; i++) {
            int snowBallSnow = Integer.parseInt(sc.nextLine());
            int snowBallTime = Integer.parseInt(sc.nextLine());
            int snowBallQuality = Integer.parseInt(sc.nextLine());
            double result = snowBallSnow / snowBallTime;
            long snowBallVolume = (long) Math.pow((long) result, snowBallQuality);
            if (snowBallVolume > max) {
                max = snowBallVolume;
                endSnowBallQuality = snowBallQuality;
                endSnowBallSnow = snowBallSnow;
                endSnowBallTime = snowBallTime;
            }

        }


        System.out.printf("%d : %d = %d (%d) ", endSnowBallSnow, endSnowBallTime, max, endSnowBallQuality);

    }
}
