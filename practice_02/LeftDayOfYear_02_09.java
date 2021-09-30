package chap02.practice_02;

import java.util.Scanner;

public class LeftDayOfYear_02_09 {

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        int days =d;
        for(int i = 1;i < m; i++){
            days += mdays[isLeap(y)][i-1];
        }
        return 365 + isLeap(y) - days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        int days = dayOfYear(year, month, day);

        System.out.println("days = " + days);

    }
}
