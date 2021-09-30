package chap02.practice_02;

import java.util.Scanner;

public class CardConv_02_06 {

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int r;
        char[] d = new char[32];

        do{
            System.out.println("양의 정수를 입력하세요");
            x = sc.nextInt();
        }while(x <= 0);

        do{
            System.out.println("몇 진수로 변환할깝쇼(2~36)");
            r = sc.nextInt();
        }while(r < 2 || r > 36);

        int dno = cardConv(x, r, d);

        for (int i = 0; i < dno / 2; i++) {
            char t = d[i];
            d[i] = d[dno - i - 1];
            d[dno - i - 1] = t;
        }
        System.out.printf("정수 " + x + "를 " + r + "진수로 변환한 값은 : ");

        for(int i = 0; i < dno; i++){
            System.out.printf("%c",d[i]);
        }
        System.out.println("입니다.");


    }
}
