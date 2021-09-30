package chap02.practice_02;

import java.util.Scanner;

public class ReverseArrayEx_02_02 {

    static void swap(int[] a, int b, int c){
        int t = a[b];
        a[b] = a[c];
        a[c] = t;
    }

    static void print(int[] a){
        for (int j = 0; j < a.length; j++) {
            System.out.printf("%d ",a[j]);
        }
        System.out.println();
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            print(a);
            System.out.println("a[" + i + "]과 a[" + (a.length-i-1) + "]을 교환합니다.");
            swap(a,i,a.length-i-1);
        }
        print(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        reverse(a);
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
