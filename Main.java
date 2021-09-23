package hello.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String arr[] = new String[t];

        for(int i = 0; i < t; i++){
            arr[i] = sc.next();
            int cnt = 0;
            int sum = 0;

            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
