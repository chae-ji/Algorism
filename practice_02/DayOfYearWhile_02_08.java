package chap02.practice_02;

import java.util.Scanner;

public class DayOfYearWhile_02_08 {

    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {

        while (m > 1) {
            d += mdays[isLeap(y)][--m-1];
        }
        return d;
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
