package chap01.practice;

public class Min4_01_03 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min4(3,4,5,2) = " + min4(3,4,5,2));
    }
}
