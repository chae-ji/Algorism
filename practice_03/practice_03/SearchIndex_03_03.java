package chap03.practice_03;

import java.util.Scanner;

public class SearchIndex_03_03 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[ptr++] = a[i];
            }
        }

        return ptr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];

        int[] index = new int[num];

        for (int i = 0; i < num; i++) {
            x[i] = sc.nextInt();
        }
        int ky = sc.nextInt();
        int count = searchIdx(x, num, ky, index);

        for (int i = 0; i < count; i++) {
            System.out.println("index[" + i + "] : " + index[i]);
        }

        System.out.println("count = " + count);
    }
}
