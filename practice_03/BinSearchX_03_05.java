package chap03.practice_03;

import java.util.Scanner;

public class BinSearchX_03_05 {

    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key) {
                for (; pc > 0; pc--) {
                    if (a[pc - 1] != a[pc])
                        break;
                }
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else if (a[pc] > key) {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.println("숫자 입력 :");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);

        }

        System.out.println("ky : ");
        int ky = sc.nextInt();

        int result = binSearchX(x, num, ky);

        if (result == -1) {
            System.out.println("찾는 값은 없습니다.");
        }else
            System.out.println("x[" + result + "]");
    }
}
