package chap01.practice;

import java.util.Scanner;

public class SumForEx_01_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){

            if(i == n) {
                sum += i;
                System.out.println(i + " = " + sum);
            }else {
                sum += i;
                System.out.print(i + " + ");
            }
        }
    }
}
