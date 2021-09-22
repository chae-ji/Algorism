package hello.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int result = 0;

        for(int i = 0; i <10; i++){
            num[i] = sc.nextInt() % 42;
        }

        for(int i = 9; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (num[j] == num[i]) {
                    count++;
                }
            }
            if(count == 0){
                result++;
            }
        }
        System.out.println(result);
    }
}
