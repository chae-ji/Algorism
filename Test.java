package hello.core;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for(int i = 0; i < C; i++){
            int N = sc.nextInt(); //6
            int L = sc.nextInt(); //3

            int[] arr = new int[N];
            double avgMin = 0;
            double avg = 0;



            for(int j = 0; j < arr.length; j++){
                arr[j] = sc.nextInt();
            }

            for(int j = L; j < arr.length + 1;j++){

                for(int k = 0; k < arr.length; k++) {

                    double sum = 0;

                    for (int m = k; m < j + k; m++) {

                        if (j + k > arr.length) {
                            break;
                        }
                        sum += arr[m];
                    }
                    if (sum != 0) {
                        avg = sum / j;
                    }
                    if (avgMin == 0) {
                        avgMin = avg;
                    } else if (avg < avgMin) {
                        avgMin = avg;
                    }
                }
            }
            System.out.printf("%.11f\n", avgMin);
        }
    }
}


