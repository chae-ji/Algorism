package chap03.practice_03;

import java.util.Scanner;

public class SeqSearchSenFor_03_01 {

    static int seqSearchsen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;

        for (i = 0; i <= n; i++) {
            if (a[i] == key)
                break;
        }
        return i == n ? -1 : i;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.println("숫자 입력");
            x[i] = sc.nextInt();
        }

        System.out.println("ky : ");
        int ky = sc.nextInt();

        int idx = seqSearchsen(x, num, ky);

        if(idx == -1){
            System.out.println("요소가 없습니다.");
        }else
            System.out.println("x[" + idx + "]에 있습니다.");
    }
}
