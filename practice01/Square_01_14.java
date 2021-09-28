package chap01.practice;

import java.util.Scanner;

public class Square_01_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        int dan;
        do{
            System.out.printf("단 수 : ");
            dan = sc.nextInt();
        }while(dan <= 0);


        for(int i = 1; i <= dan; i++){
            for(int j = 1; j <= dan; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
