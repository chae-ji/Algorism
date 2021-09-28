package chap01.practice;

import java.util.Scanner;

public class SumGauss_01_08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = (1 + n ) * (n / 2) + (n % 2 == 1 ? ((n + 1) / 2) : 0);

        System.out.println("sum = " + sum);

    }
}
