package chap01.practice;

import java.util.Scanner;

public class SumOf_01_09 {

    static int sumOf(int a, int b) {

        int max;
        int min;
        int sum = 0;

        if(a > b){
            max = a;
            min = b;
        }else {
            max = b;
            min = a;
        }
        for(int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sumOf(a, b);
        System.out.println("result = " + result);
    }
}
