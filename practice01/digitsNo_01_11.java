package chap01.practice;

import java.util.Scanner;

public class digitsNo_01_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;

        do {
            num = sc.nextInt();
        } while(num <= 0);

        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("그 수는 " + count + "자리입니다.");
    }
}
