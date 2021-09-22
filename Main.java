package hello.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double numMax = 0;
        double result = 0;

        int[] arr = new int[num];
        double[] arr2 = new double[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > numMax){
                numMax = arr[i];
            }
        }
        sc.close();

        for(int i =0; i < num; i ++){
            arr2[i] = arr[i]/numMax*100;
            result += arr2[i];
        }
        System.out.println(result/num);

    }
}
