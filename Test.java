package hello.core;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        int[] num = new int[t];
        int sum = 0;

        for(int i = 0; i < t; i++){
            num[i] = str.charAt(i) - 48;
            sum += num[i];
        }
        System.out.println(sum);
    }
}


