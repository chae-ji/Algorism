package chap01.practice;

import java.util.Scanner;

public class Triangle_01_15 {

    static void triangleLB(int n) {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i = 1; i <= n; i++){

            for(int j = 1; j < i; j++) {
                System.out.printf(" ");
            }

            for(int j = n; j >= i; j--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {

        for(int i = n; i >= 1; i--) {
            for(int j = i; j > 1; j--){
                System.out.printf(" ");
            }

            for(int j = i; j <= n; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.printf("단 수 : ");
            n = sc.nextInt();
        }while(n <= 0);

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }
}
