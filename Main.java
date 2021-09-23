package hello.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        for(int i = 0; i < t; i++){
            arr[i] = sc.nextInt();
            int num[] = new int[arr[i]];
            int cnt = 0;
            int sum = 0;

            for(int j = 0; j < arr[i]; j++){

                num[j] = sc.nextInt();
                sum += num[j];
            }
            double avg = sum / arr[i];

            for(int j = 0; j< arr[i]; j++){
                if(num[j] > avg){
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f%%", (double) cnt / arr[i] *100));
        }
    }
}
