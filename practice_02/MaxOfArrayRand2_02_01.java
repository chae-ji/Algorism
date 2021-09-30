package chap02.practice_02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand2_02_01 {

    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            };
        }
        return max;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = 100 + rand.nextInt(90);
            System.out.println("a[i] = " + a[i]);
        }


        System.out.println("num = " + num);
        System.out.println("maxOf(a) = " + maxOf(a));
        
    }
}
