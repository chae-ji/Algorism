package chap02.practice_02;


import java.util.Scanner;

public class Copy_02_04 {
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numa = sc.nextInt();
        int[] a = new int[numa];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int numb = sc.nextInt();
        int[] b = new int[numb];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        copy(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d " ,a[i]);
        }
    }
}